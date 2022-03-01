package com.gft.bancodigital.domain.repository;

import com.gft.bancodigital.domain.model.Conta;

public interface IConta {

	 void sacar(double valor); 
	 void depositar(double valor); 
	 void transferir(double valor, Conta contaDestino);
	 void imprimirExtrato();
}
