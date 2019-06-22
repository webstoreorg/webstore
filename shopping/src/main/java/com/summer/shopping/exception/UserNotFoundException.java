package com.summer.shopping.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND, reason ="User not found with the specified ID ")
public class UserNotFoundException extends Exception {

}
