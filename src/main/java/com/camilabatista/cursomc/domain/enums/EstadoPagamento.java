package com.camilabatista.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDETE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private Integer codigo;
	private String descricao;
	
	private EstadoPagamento(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public static EstadoPagamento toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(EstadoPagamento x : EstadoPagamento.values()) {
			if(codigo.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + codigo);
	}


}
