package com.codewithharshu.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
	
	String resourceName;
	String fieldName;
	long fieldvalue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldvalue) {
		super(String.format("%s not found with this %s : %l",resourceName,fieldName,fieldvalue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldvalue = fieldvalue;
	}
	
	

}
