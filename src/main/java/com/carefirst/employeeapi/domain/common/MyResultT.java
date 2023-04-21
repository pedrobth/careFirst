package com.carefirst.employeeapi.domain.common;

import java.util.List;
import java.util.Optional;

public class MyResultT<T> extends MyResult {

    private final Optional<T> genericData;

    public MyResultT(MyHttpStatus status, List<String> errors, T data) {
        super(status, errors, null);
        this.genericData = Optional.ofNullable(data);
    }

    public Optional<T> getGenericData() {
        return genericData;
    }

    public static <T> MyResultT<T> Ok(MyHttpStatus status, T data) {
        return new MyResultT<>(MyHttpStatus.OK, null, data);
    }

    public static <T> MyResultT<T> Created(MyHttpStatus status, T data) {
        return new MyResultT<>(MyHttpStatus.CREATED, null, data);
    }

    public static <T> MyResultT<T> BadRequest(MyHttpStatus status, List<String> errors) {
        return new MyResultT<>(MyHttpStatus.BAD_REQUEST, errors, null);
    }

    public static <T> MyResultT<T> NotFound(MyHttpStatus status, T data) {
        return new MyResultT<>(MyHttpStatus.NOT_FOUND, null, data);
    }

    public static <T> MyResultT<T> InternalServerError(MyHttpStatus status, List<String> errors) {
        return new MyResultT<>(MyHttpStatus.INTERNAL_SERVER_ERROR, errors, null);
    }
}
