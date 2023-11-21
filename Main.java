package transformador;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ITransformador tran = (dev) -> dev.toUpperCase();
		
		List <String> lista = new ArrayList<String>();
		
		Metodo nuevalista = new Metodo();
		
		nuevalista.agregarLista(lista,"facundo");
		nuevalista.agregarLista(lista, "luisana");
		nuevalista.agregarLista(lista, "thiago");
		nuevalista.agregarLista(lista, "ciro");
		nuevalista.agregarLista(lista, "emilia");
		
		System.out.println("Lista en mayúsculas");
		System.out.println("-----------------------------------");
			for(String generar:lista) {
				System.out.println(tran.devuelve(generar));
			}
			System.out.println("-----------------------------------");
		
	}
}
