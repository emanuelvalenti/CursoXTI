package br.com.emanuelvalenti.poo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula071DateInternacionalizacaoLocale {

	public static void main(String[] args) {
		
		Calendar data = Calendar.getInstance();
		
		data.set(1982, Calendar.DECEMBER, 29);
		Date date = data.getTime();
		
		Locale padrao = Locale.getDefault();
		Locale brasil = Locale.of("pt","BR");
		Locale eUA = Locale.US;
		Locale india = Locale.of("hi","IN");

		

		/*
		 * Padrão
		 * */
		DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(formato.format(date));
		
		/*
		 * Padrão
		 * */
		formato = DateFormat.getDateInstance(DateFormat.FULL,padrao);
		System.out.println(formato.format(date));
		

		/*
		 * Específico
		 * neste caso Brasil
		 * */
		formato = DateFormat.getDateInstance(DateFormat.FULL,brasil);
		System.out.println(formato.format(date));
		
		/*
		 * Específico
		 * neste caso EUA
		 * */
		formato = DateFormat.getDateInstance(DateFormat.FULL,eUA);
		System.out.println(formato.format(date));
		
		
		/*
		 * Específico
		 * neste caso India
		 * */
		formato = DateFormat.getDateInstance(DateFormat.FULL,india);
		System.out.println(formato.format(date));

		/*
		 * Específico
		 * neste caso França
		 * */
		formato = DateFormat.getDateInstance(DateFormat.FULL,Locale.FRANCE);
		System.out.println(formato.format(date));

		/*
		 * Específico
		 * neste caso Japão
		 * */
		formato = DateFormat.getDateInstance(DateFormat.FULL,Locale.JAPAN);
		System.out.println(formato.format(date));
		
		
		
	}
	
}
