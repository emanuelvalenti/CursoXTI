package br.com.emanuelvalenti.logica;

public class Aula010Wrapper {


	public static void main(String[] Args) {

		Double preco = Double.valueOf("12.45");
		
		//CONVERSÃO APARTIR DE UM OBJETO
		double d = preco.doubleValue();
		int i = preco.intValue();
		byte b = preco.byteValue();
		
		Boolean casado = Boolean.valueOf("true");
		Boolean casada = Boolean.valueOf("yes");
		
		//CONVERSÃO ESTÁTICA
		double d1 = Double.valueOf("123.45");
		int i1 = Integer.valueOf("123");
		float f1 = Float.valueOf("3.14F");
		
		int i2 = Integer.valueOf("101011", 2);
		
		System.out.println("O VALOR DO d é " + String.valueOf(d));
		System.out.println("O VALOR DO b é " + String.valueOf(b));
		System.out.println("O VALOR DO i é " + String.valueOf(i));
		System.out.println("O VALOR DO casado é " + String.valueOf(casado));
		System.out.println("O VALOR DO casada é " + String.valueOf(casada));
		System.out.println("O VALOR DO d1 é " + String.valueOf(d1));
		System.out.println("O VALOR DO i1 é " + String.valueOf(i1));
		System.out.println("O VALOR DO f1 é " + String.valueOf(f1));
		System.out.println("O VALOR DO BINARIO 101011 é " + String.valueOf(i2));
		
		casado = null;
		casada = null;
		
		
	}
	

}
