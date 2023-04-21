package com.carefirst.employeeapi.domain.common;

import java.util.List;
import java.util.Optional;

public class MyResult implements IMyResult {

	public MyHttpStatus status;
	public Optional<List<String>> errors;
	public Optional<Object> data;

	public MyResult(MyHttpStatus status, List<String> errors, Object data) {
		this.status = status;
		this.errors = Optional.ofNullable(errors);
		this.data = Optional.ofNullable(data);
	}

	public MyHttpStatus getStatus() {
		return status;
	}

	protected void setStatus(MyHttpStatus status) {
		this.status = status;
	}

	public Optional<List<String>> getErrors() {
		return errors;
	}

	protected Optional<List<String>> setErrors(List<String> errors) {
		this.errors = Optional.ofNullable(errors);
		return this.errors;
	}

	public Optional<Object> getData() {
		return this.data;
	}

	protected Optional<Object> setData(Object data) {
		this.data = Optional.ofNullable(data);
		return this.data;
	}
	
	public static MyResult ok(Object data) {
		return new MyResult(MyHttpStatus.OK, null, data);
	}
	
	public static MyResult created(Object data) {
		return new MyResult(MyHttpStatus.CREATED, null, data);
	}
	
	public static MyResult badRequest(List<String> errors) {
		return new MyResult(MyHttpStatus.BAD_REQUEST, errors, null);
	}
	
	public static MyResult notFound(Object data) {
		return new MyResult(MyHttpStatus.NOT_FOUND, null, data);
	}
	
	public static MyResult internalServerError(List<String> errors) {
		return new MyResult(MyHttpStatus.INTERNAL_SERVER_ERROR, errors, null);
	}
	
	
}
