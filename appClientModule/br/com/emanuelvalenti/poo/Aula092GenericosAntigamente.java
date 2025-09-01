package br.com.emanuelvalenti.poo;

public class Aula092GenericosAntigamente {

	
	private Object elemento;
	
	public void setElemento(Object elemento) {
		
		this.elemento = elemento; 
	}
	
	public Object getElemento() {
		
		return this.elemento; 
	}
	
	
	public static void main(String[] args) {
		
		Aula092GenericosAntigamente g = new Aula092GenericosAntigamente();


		/*
		 * Aceita qualquer coisa
		 * */
		g.setElemento(123456);
		
		g.setElemento("Lago");
		
		/*
		 * Com os tipos genéricos
		 * não é possivel utilizar os métodos
		 * por exemplo de uma classe String
		 * é necessário fazer o cast
		 * */
		String e = (String) g.getElemento();
		
		e.toUpperCase();
		
	}
}
