package br.com.emanuelvalenti.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


/**
 * A anotação target neste caso
 * permite que ela só seja usada
 * em classe 
 */
@Target(ElementType.TYPE)

/**
 * Anotação documentada pelo
 * Javadoc
 */
@Documented

public @interface Aula102Cabecalho {

	 String instituição();
	 String projeto();
	 String dataCriacao();
	 String criador();
	 int revisao() default 1;
	
}
