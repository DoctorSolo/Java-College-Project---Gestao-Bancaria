package br.uemg.contas;
import br.uemg.cliente.Endereco;
import br.uemg.cliente.Cliente;
import java.util.ArrayList;

public class Agencia {
	private String		codigo;
	private Endereco 	endereco;
	private ArrayList<Cliente> clientes; //cadastro de correntistas da agencia bancaria //////////////////////////////
	
	
	public Agencia(String codigo, Endereco endereco) {
		this.codigo 	= codigo;
		this.endereco	= endereco;
		this.clientes 	= new ArrayList<>(); // cadastro inicialmente sem clientes ///////////////////////////////////
	}
	
	public void cadastraCliente(Cliente novoCliente, ContaCorrente conta) {
		this.clientes.add(novoCliente);
		novoCliente.abreConta(null);
	}
	
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Agencia [codigo=" + codigo + ", endereco=" + endereco + ", clientes=" + clientes + "]";
	}
	
	
}
