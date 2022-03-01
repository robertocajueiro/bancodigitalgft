package com.gft.bancodigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gft.bancodigital.domain.model.Cliente;
import com.gft.bancodigital.domain.model.Conta;
import com.gft.bancodigital.domain.model.ContaCorrente;

@SpringBootApplication
public class BancodigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancodigitalApplication.class, args);
		
		Cliente roberto = new Cliente();
		roberto.setNome("Roberto");
		
		Conta cc = new ContaCorrente(roberto);
		Conta poupanca = new ContaCorrente(roberto);
		
		cc.depositar(100);		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
