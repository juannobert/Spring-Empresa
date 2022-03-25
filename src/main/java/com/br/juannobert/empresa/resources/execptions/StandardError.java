package com.br.juannobert.empresa.resources.execptions;

import java.time.Instant;

public class StandardError {
	private Instant instant;
	private Integer Status;
	private String error;
	private String mensage;
	private String path;
	public StandardError() {
		// TODO Auto-generated constructor stub
	}
	public StandardError(Instant instant, Integer status, String error, String mensage, String path) {
		super();
		this.instant = instant;
		Status = status;
		this.error = error;
		this.mensage = mensage;
		this.path = path;
	}
	public Instant getInstant() {
		return instant;
	}
	public void setInstant(Instant instant) {
		this.instant = instant;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMensage() {
		return mensage;
	}
	public void setMensage(String mensage) {
		this.mensage = mensage;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}
