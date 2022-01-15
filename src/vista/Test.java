package vista;

import java.util.List;

import dao.ListaDAO;
import entidades.Lista;

public class Test {

	public static void main(String[] args) {
		//ListaDAO.obtenerTodos().forEach(lista -> System.out.println(lista));
		//Lista lista1 = new Lista("Ropa de hombre");

		List<Lista> listas = ListaDAO.obtenerTodos();
		for (Lista lista : listas) {
			if(lista.getId().equals(2)) {
				lista.setNombre("Ropa de niño");
				ListaDAO.actualizar(lista);
			}
		}
		
		ListaDAO.obtenerTodos().forEach(lista -> System.out.println(lista));
		
		
	}
}
