package com.home.project.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Erro for create user")
@AllArgsConstructor
public class UserCreateException extends RuntimeException {
}
