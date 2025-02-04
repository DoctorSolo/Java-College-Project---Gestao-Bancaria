package br.uemg.cliente;

import java.util.ArrayList;
import br.uemg.contas.ContaCorrente;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private ArrayList<ContaCorrente> contas;
	
	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public void abreConta(ContaCorrente conta) {
		this.contas.add(conta);
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
