package br.com.emanuelvalenti.poo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Aula069DateCalendarGetSetClearAddRoll {

	public static void main(String[] args) {
		
		/*
		 * Data, classe depreciado
		 * */
		
		/*
		 * todo o tempo em java é representado em milesegundos
		 * inicia 01/01/1970 ou tempo zero
		 * */
		
		/*
		 * Recupera o tempo em millesegundos
		 * */
		System.out.println(System.currentTimeMillis());
		
		/*
		 * Recupera a data atual
		 * */
		System.out.println(new Date());

		/*
		 * data informando os millesegundos
		 * */
		System.out.println(new Date(1655689505829L));
		
			
		/*
		 * Métodos
		 * */
		
		Date data = new Date();
		Date data2 = new Date();
		
		/*
		 * Recupera o tempo em millesegundos
		 * */
		System.out.println(data.getTime());
		
		/*
		 * Define uma tempo em millesegundos
		 * */
		data.setTime(1000000000000L);
		System.out.println(data.getTime());
		
		/*
		 * compara datas -1 data esquerda menor, 0 datas iguais, 1 data direita menor
		 * */
		System.out.println(data.compareTo(data2));
		
		/*
		 * compara datas -1 data esquerda menor, 0 datas iguais, 1 data direita menor
		 * */
		System.out.println(data.compareTo(data2));

		
		/*
		 * Calendar 
		 * Gregoriam Calendar
		 * */
		Calendar brasil = Calendar.getInstance();
		Calendar br = GregorianCalendar.getInstance();

		
		/*
		 * definir uma data
		 * */
		brasil.set(2025, Calendar.AUGUST, 19);
		System.out.println(brasil.getTime());
		
		/*
		 * identificar o ano
		 * */
		System.out.println(brasil.get(Calendar.YEAR));
		
		/*
		 * identificar o mês sendo que janeiro inicia no 0 e dezembro é 11
		 * */
		System.out.println(brasil.get(Calendar.MONTH));

		
		/*
		 * identificar o dia do mês 
		 * */
		System.out.println(brasil.get(Calendar.DAY_OF_MONTH));

		
		/*
		 * identificar o dia da semana 
		 * */
		System.out.println(brasil.get(Calendar.DAY_OF_WEEK));
		
		
		/*
		 * altera um campo específico
		 * */
		brasil.set(Calendar.YEAR,2020);
		brasil.set(Calendar.MONTH,Calendar.MARCH);
		brasil.set(Calendar.DAY_OF_MONTH,29);
		
		System.out.println(brasil.getTime());
		
		
		/*
		 * limpar um campo específico
		 * */
		brasil.clear(Calendar.MINUTE);
		brasil.clear(Calendar.SECOND);
		
		System.out.println(brasil.getTime());
		
		/*
		 * adicionar unidade de tempo
		 * */
		brasil.add(Calendar.DAY_OF_MONTH, 1);;
		brasil.add(Calendar.YEAR, 2);;
		
		System.out.println(brasil.getTime());
		
		/*
		 * remover unidade de tempo
		 * */
		brasil.add(Calendar.DAY_OF_MONTH, -10);
		brasil.add(Calendar.YEAR, -4);
		
		System.out.println(brasil.getTime());
		
		/*
		 * roll
		 * aumenta e diminui unidades de tempo
		 * Com excessão de tipo maiores,
		 * Exemplo ele recalcula os dias mas não troca o mês
		 * se o valor extrapolar a data máxima
		 * do mês,
		 * Aplica a qualquer medida de tempo
		 * */
		
		brasil.add(Calendar.DAY_OF_MONTH, 60);
		
		System.out.println(brasil.getTime());
		
		brasil.roll(Calendar.DAY_OF_MONTH, 60);
		
		System.out.println(brasil.getTime());
		
		/*
		 * Mensagem de saudação
		 * */
		
		Calendar c1 = Calendar.getInstance();
		
		if (c1.get(Calendar.HOUR_OF_DAY) < 12) {
			System.out.println("Bom dia");
		} else if (c1.get(Calendar.HOUR_OF_DAY) > 11 || c1.get(Calendar.HOUR_OF_DAY) < 18) {
			System.out.println("Boa tarde");
			
		} else {
			System.out.println("Boa noite");
		}
		
		
		
		
		
		
	}
	
	
}
