package dataInputStream;

public class Conta {
	private double saldo;
	private Operacaoes operacao;
	
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void debitar(double valor){
		this.saldo =- valor;
	}
	
	public void creditar(double valor){
		this.saldo =+ valor;
	}
	
	public void operacaoBancaria(Operacaoes operacao, double valor){
		
		if(operacao.name().equals("DEBITO")){
			debitar(valor);
		}else{
			creditar(valor);
		}
	}
	
}
