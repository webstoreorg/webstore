package com.summer.shopping.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.CONFLICT, reason ="User not found with the specified ID ")
public class UserAlreadyExistException extends Exception{

}
