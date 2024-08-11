package br.uemg.contas;

public class ContaCorrente {
	private String 	numeroConta;
	private float 	saldo;
	private float 	limite;
	private String	dataAbertura;
	
	// Contrutor /////////////////////////////////////////////////////////////////////////////////////
	public ContaCorrente(String numeroConta, float saldo, float limite, String dataAbertura) {
		this.saldo 			= saldo + limite;
		this.limite 		= limite;
		this.dataAbertura 	= dataAbertura;
		this.numeroConta	= numeroConta;
	}//Não é exirgido um deposito na abertura da conta, se assim a regraa de negocio permitir /////////
	public ContaCorrente( String numeroConta, float limite, String dataAbertura) {
		this.saldo 			= 0.0F;
		this.limite 		= limite;
		this.dataAbertura 	= dataAbertura;
		this.numeroConta	= numeroConta;
	}
	
	
	public boolean sacar(float valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true; //saque realizado com sucesso
		} else {
			return false; //saldo insuficiente
		}
	}
	
	
	public void depositar(float valor) {
		saldo += valor;
	}// transfere valores entre contas ///////////////////////////////////////////////////////////////
	public boolean tranfere(float valor, ContaCorrente destino) {
		if (this.sacar(valor) == true) { // saque foi possivel?
			destino.depositar(valor); // sim, então tramsfere///
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	// Get and setterts /////////////////////////////////////////////////////////////////////////////
	public float getSaldoLimite() {
		return saldo;
	}// obtem saldo sem limite /////////////////////////////////////////////////////////////////////
	public float getSaldo() {
		return saldo - limite;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	@Override
	public String toString() {
		return "ContaCorrente\n " +
				"\n numeroConta= " 				+ numeroConta +
				"\n saldo=            R$"		+ (saldo - limite) +
				"\n saldo com limite= R$"		+ saldo +
				"\n limite=           R$"		+ limite +
				"\n dataAbertura=" 				+ dataAbertura;
	}
	
	
	
}
