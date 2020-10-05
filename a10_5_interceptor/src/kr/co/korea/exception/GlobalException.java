package kr.co.korea.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException extends RuntimeException{

	@ExceptionHandler(Exception.class)
	public String handleException() {
		return "error";
	}
}
