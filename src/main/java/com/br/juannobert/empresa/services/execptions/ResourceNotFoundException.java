package com.br.juannobert.empresa.services.execptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Long id) {
		super("Resource Not Found id: " + id);
		
	}
	

}
