package br.com.emanuelvalenti.poo;

public class Aula036ContaTeste {

	public static void main (String[] args) {
		
		Aula036MetodosComParametros conta = new Aula036MetodosComParametros();
		
		conta.cliente = "Emanuel";
		conta.saldo = 10000.00;
		
		//conta.exibeSaldo();
		
		//conta.saca(Double.valueOf(100));
		
		//conta.deposita(Double.valueOf(5962.21));
		
		Aula036MetodosComParametros contaNatali = new Aula036MetodosComParametros();
		
		contaNatali.cliente = "Natalí";
		contaNatali.saldo = Double.valueOf(0);
		
		conta.transferePara(contaNatali, Double.valueOf(1000));
		
		contaNatali.exibeSaldo();
		
	}
	
}
