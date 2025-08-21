package br.com.emanuelvalenti.poo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aula070DateFormatacaoDateFormatFormatParse {

	public static void main(String[] args) {
		
		Calendar data = Calendar.getInstance();
		
		data.set(1980, Calendar.SEPTEMBER, 12);
		
		Date date = data.getTime();
		System.out.println(date);
		
		/*
		 * formatação de datas
		 * */
		
		/*
		 * data
		 * */
		DateFormat formato = DateFormat.getDateInstance();
		
		System.out.println(formato.format(date));
		
		/*
		 * time
		 * */
		
		formato = DateFormat.getTimeInstance();
		
		System.out.println(formato.format(date));

		/*
		 * Datetime
		 * */
		
		formato = DateFormat.getDateTimeInstance();
		
		System.out.println(formato.format(date));
		

		/*
		 * Estilos de datas
		 * */
		
		/*
		 * completo
		 * */
		formato = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(formato.format(date));
		
		/*
		 * longo
		 * */
		formato = DateFormat.getDateInstance(DateFormat.LONG);
		
		System.out.println(formato.format(date));
		
		/*
		 * medio
		 * */
		formato = DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		System.out.println(formato.format(date));

		/*
		 * curto
		 * */
		formato = DateFormat.getDateInstance(DateFormat.SHORT);
		
		System.out.println(formato.format(date));
		
		/*
		 * Converter String em datas
		 * */
		
		try {
			System.out.println(formato.parse("15/12/2025"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * formatação de datas simples
		 * */
		
		SimpleDateFormat formatoSimples = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println(formatoSimples.format(date));
		
		
		
	}
	
}
