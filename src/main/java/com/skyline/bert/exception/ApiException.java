package com.skyline.bert.exception;

import lombok.NoArgsConstructor;

 

@NoArgsConstructor
public class ApiException extends RuntimeException{public ApiException(String message) {
		super(message);
		 
	}
	
}
