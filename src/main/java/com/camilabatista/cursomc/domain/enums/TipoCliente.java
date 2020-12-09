package com.camilabatista.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1,"Pessoa Fisica"),
	PESSOAJURIDICA(2, "Pessoa Juridica");
	
	private Integer codigo;
	private String descricao;
	
	private TipoCliente(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public static TipoCliente toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(codigo.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + codigo);
	}

}
