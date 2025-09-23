package com.br.springjr.curso.entities.enums;

public enum OrderStatus {
WAITYNG_PAYMENT(1),
PAID(2),
SHIPPED(3),							//atribuir valores para que se no caso venha incrementear algum status, não ficar doido o banco de dados
DELIVERED(4),						//feito isso o java exige alguns especificações
CANCELED(5);
	
	
private int code;

private OrderStatus(int code) {
	this.code = code;
}

public int getCode() {				//para acessar o código
	return code;
}

public static OrderStatus valueof(int code) {
	
	for(OrderStatus value : OrderStatus.values()) {
		if(value.getCode()==code) {
			return value;
		}
	}
	throw new IllegalArgumentException("Invalid OrderStatus code");
	
}
}


