package br.com.emanuelvalenti.poo;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Aula072NumberFormatParseInternacionalizacao {
	
	public static void main(String[] args) throws ParseException {
		
		double saldo = 123_456_789.1188;

		
		/*
		 * formatação padrão/genéricos
		 * */
		NumberFormat numero = NumberFormat.getInstance();
		System.out.println(numero.format(saldo));
		
		/*
		 * formatação por numero inteiro
		 * */
		numero = NumberFormat.getIntegerInstance();
		System.out.println(numero.format(saldo));
		
		/*
		 * formatação por numero percentuais
		 * */
		numero = NumberFormat.getPercentInstance();
		System.out.println(numero.format(saldo));
		
		/*
		 * formatação por numero moedas
		 * */
		numero = NumberFormat.getCurrencyInstance();
		System.out.println(numero.format(saldo));
		
		/*
		 * formatação por numero moedas no japão 
		 * */
		numero = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(numero.format(saldo));
		
		/*
		 * formatação por numero moedas no estados unidos
		 * */
		numero = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(numero.format(saldo));

		/*
		 * formatação por numero moedas na india
		 * */
		numero = NumberFormat.getCurrencyInstance(Locale.of("hi", "IN"));
		System.out.println(numero.format(saldo));
		
		/*
		 * formatação por numero moedas na india
		 * */
		numero = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(numero.format(saldo));
		
		
		/*
		 * formatação por limitador de dígitoa
		 * */
		numero = NumberFormat.getCurrencyInstance();
		numero.setMaximumFractionDigits(1);
		System.out.println(numero.format(saldo));
		numero.setMaximumFractionDigits(3);
		System.out.println(numero.format(saldo));


		/*
		 * Parse
		 * Conversão de uma string
		 * para uma valor numérico
		 * */
		System.out.println(numero.parse("R$ 1.100,25"));

		
		
	}

}
