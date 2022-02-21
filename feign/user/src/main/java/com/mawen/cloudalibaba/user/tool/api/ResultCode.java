package com.mawen.cloudalibaba.user.tool.api;

/**
 * 结果状态码
 *
 * @author mawen
 * @create 2022-01-18 11:26
 */
public enum ResultCode implements IResultCode {
    SUCCESS(200, "操作成功"),

    //====================================================
    //======================== 4xx =======================
    //====================================================
    FAILURE(400, "业务异常"),
    PARAM_MISS(400, "缺少必要的请求参数"),
    PARAM_TYPE_ERROR(400, "请求参数类型错误"),
    PARAM_BIND_ERROR(400, "请求参数绑定错误"),
    PARAM_VALID_ERROR(400, "参数校验失败"),
    UN_AUTHORIZED(401, "请求未授权"),
    CLIENT_UN_AUTHORIZED(401, "客户端请求未授权"),
    NOT_FOUND(404, "404 没找到请求"),
    MSG_NOT_READABLE(404, "信息不能读取"),
    METHOD_NOT_SUPPORTED(405, "不支持当前请求方法"),
    MEDIA_TYPE_NOT_SUPPORTED(415, "不支持当前媒体类型"),
    REQ_REJECT(403, "请求被拒绝"),

    //====================================================
    //======================== 5xx =======================
    //====================================================
    INTERNAL_SERVER_ERROR(500, "服务器异常"),
    ;


    final int code;
    final String message;

    private ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public int getCode() {
        return this.code;
    }
}
