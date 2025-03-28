package com.dizzy.school.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private Integer code; // 业务状态码
    private String msg; // 描述字符串
    private T data; // 数据

    public enum Code {
        SUCCESS(200),
        FAIL(400),
        UNAUTHORIZED(401),
        FORBIDDEN(403),
        NOT_FOUND(404),
        ERROR(500);

        private final int value;

        Code(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static <T> Result<T> success() {
        return new Result<>(Code.SUCCESS.getValue(), "操作成功", null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(Code.SUCCESS.getValue(), "操作成功", data);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(Code.SUCCESS.getValue(), message, data);
    }

    public static <T> Result<T> fail(String message) {
        return new Result<>(Code.FAIL.getValue(), message, null);
    }

    public static <T> Result<T> error(String message) {
        return new Result<>(Code.ERROR.getValue(), message, null);
    }

    public boolean isSuccess() {
        return Code.SUCCESS.getValue() == this.code;
    }
}
