package com.br.juannobert.empresa.entities.enums;

public enum Position {
	
	Owner(1),
	Employee(2),
	Supervisor(3),
	Manager(4);
	
	
	private  int  code;
	
	private Position(int code) {
		this.code = code;
	}
	
	public static Position value(int code) {
		for(Position position : Position.values()) {
			if(code == position.getCode())
				return position;
		}
		throw new IllegalArgumentException("Ivalid Code");
	}

	public int getCode() {
		return code;
	}
	
}
