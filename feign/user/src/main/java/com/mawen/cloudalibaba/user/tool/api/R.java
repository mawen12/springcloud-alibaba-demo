package com.mawen.cloudalibaba.user.tool.api;

import org.springframework.util.ObjectUtils;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.Optional;

/**
 * 返回值
 *
 * @author mawen
 * @create 2022-01-18 11:03
 */
public class R<T extends Serializable> implements Serializable {

    /**
     * 状态码
     */
    private int code;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 承载数据
     */
    private T data;

    private R(IResultCode resultCode) {
        this(resultCode, (T)null, resultCode.getMessage());
    }

    private R(IResultCode resultCode, String msg) {
        this(resultCode, (T) null, msg);
    }

    private R(IResultCode resultCode, T data) {
        this(resultCode.getCode(), data, resultCode.getMessage());
    }

    private R(IResultCode resultCode, T data, String msg) {
        this(resultCode.getCode(), data, msg);
    }

    public static boolean isSuccess(@Nullable R<?> result) {
        return Optional.ofNullable(result).map((x) -> {
            return ObjectUtils.nullSafeEquals(ResultCode.SUCCESS.code, x.code);
        }).orElse(Boolean.FALSE);
    }

    public static boolean isNotSuccess(@Nullable R<?> result) {
        return !isSuccess(result);
    }

    public static <T extends Serializable> R<T> data(T data) {
        return data(data, "操作成功");
    }

    public static <T extends Serializable> R<T> data(T data, String msg) {
        return data(200, data, msg);
    }

    public static <T extends Serializable> R<T> data(int code, T data, String msg) {
        return new R(code, data, data == null ? "暂无承载数据" : msg);
    }


    //===============================================================================
    //===============================================================================
    //==================================== success ==================================

    public static <T extends Serializable> R<T> success(String msg) {
        return new R(ResultCode.SUCCESS, msg);
    }

    public static <T extends Serializable> R<T> success() {
        return new R(ResultCode.SUCCESS);
    }

    public static <T extends Serializable> R<T> success(IResultCode resultCode) {
        return new R(resultCode);
    }

    public static <T extends Serializable> R<T> success(IResultCode resultCode, String msg) {
        return new R(resultCode, msg);
    }

    //===============================================================================
    //==================================== fail ==================================
    //===============================================================================
    public static <T extends Serializable> R<T> fail(String msg) {
        return new R(ResultCode.FAILURE, msg);
    }

    public static <T extends Serializable> R<T> fail(int code, String msg) {
        return new R(code, (T) null, msg);
    }

    public static <T extends Serializable> R<T> fail(int code, String msg, T data) {
        return new R(code, data, msg);
    }

    public static <T extends Serializable> R<T> fail(IResultCode resultCode) {
        return new R(resultCode);
    }

    public static <T extends Serializable> R<T> fail(IResultCode resultCode, T data) {
        return new R(resultCode, data);
    }

    public static <T extends Serializable> R<T> fail(IResultCode resultCode, String msg) {
        return new R(resultCode, msg);
    }

    public static <T extends Serializable> R<T> fail(IResultCode resultCode, String msg, T data) {
        return new R(resultCode, data, msg);
    }

    public static <T extends Serializable> R<T> status(boolean flag) {
        return flag ? success("操作成功") : fail("操作失败");
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public R() {
    }

    private R(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.success = ResultCode.SUCCESS.code == code;
    }

    @Override
    public String toString() {
        return "R{" +
                "code=" + code +
                ", success=" + success +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
