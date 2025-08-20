package br.com.emanuelvalenti.poo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Aula068SerializacaoContas {

	public static void main(String[] args) {
		
		ArrayList<Aula064Conta> conta = new ArrayList<Aula064Conta>();
		
		conta.add(new Aula064Conta("emanuel",12000.00));
		conta.add(new Aula064Conta("natalí",8000.00));
		conta.add(new Aula064Conta("spock",30000.00));
		conta.add(new Aula064Conta("Anakin",15000.00));
		
		try	(FileOutputStream fosc = new FileOutputStream("C:/Armazenamento_Emanuel/Cursos/codes/curso_xti/files/conta.ser")){
			try(ObjectOutputStream oosc = new ObjectOutputStream(fosc)){

				oosc.writeObject(conta);

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try	(FileInputStream fisc = new FileInputStream("C:/Armazenamento_Emanuel/Cursos/codes/curso_xti/files/conta.ser")){
			try(ObjectInputStream oisc = new ObjectInputStream(fisc)){

				ArrayList<Aula064Conta> contasInput = (ArrayList<Aula064Conta>) oisc.readObject();
				
				for (Aula064Conta contaInput : contasInput) {
					System.out.println(contaInput.getCliente());
					System.out.println(contaInput.exibeSaldo());
				}

			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		

	}

}
