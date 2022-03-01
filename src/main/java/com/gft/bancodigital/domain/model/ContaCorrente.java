package com.gft.bancodigital.domain.model;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta corrente ===");
		super.imprimirInfosComuns();
	}
}
