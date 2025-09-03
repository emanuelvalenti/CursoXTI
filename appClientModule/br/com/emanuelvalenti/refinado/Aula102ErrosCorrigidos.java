package br.com.emanuelvalenti.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * A anotação target neste caso
 * permite que ela só seja usada
 * em classe e métodos 
 */
@Target({ElementType.TYPE, ElementType.METHOD})

/**
 * Anotação documentada pelo
 * Javadoc
 */
@Documented

public @interface Aula102ErrosCorrigidos {

	String[] erros();
}
