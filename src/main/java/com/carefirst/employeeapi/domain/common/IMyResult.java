package com.carefirst.employeeapi.domain.common;

import java.util.List;
import java.util.Optional;

public interface IMyResult {

	MyHttpStatus getStatus();
    Optional<List<String>> getErrors();
    Optional<Object> getData();
}
