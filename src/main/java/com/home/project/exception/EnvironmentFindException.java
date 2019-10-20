package com.home.project.exception;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Error for find environment")
@NoArgsConstructor
public class EnvironmentFindException extends RuntimeException {
}
