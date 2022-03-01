package com.gft.bancodigital.domain.model;

import java.util.List;

import lombok.Data;

@Data
public class Banco {
	
	private String nome;
	private List<Conta> contas;

}
