package vista;

import java.util.List;

import dao.ArticuloDAO;
import dao.ListaDAO;
import dao.StockDAO;
import entidades.Articulo;
import entidades.Lista;
import entidades.StockArticulo;

public class Test {

	public static void main(String[] args) {
		//ListaDAO.obtenerTodos().forEach(lista -> System.out.println(lista));
		//Lista lista1 = new Lista("Ropa de hombre");

		List<Lista> listas = ListaDAO.obtenerTodos();
		Lista list1 = null;
		for (Lista lista : listas) {
			if(lista.getNombre().equals("Ropa de niño")) {
				list1 = lista;
			}
		}
		
		Articulo articulo1 = new Articulo();
		articulo1.setNombre("Remera oferta");
		articulo1.setLista(list1);
		
		StockArticulo stock1 = new StockArticulo(400.0, "12", "Rojo", null);
		
		articulo1.addStock(stock1);
		
		StockDAO.guardar(stock1);
		ArticuloDAO.guardar(articulo1);
		
		ArticuloDAO.obtenerTodos().forEach(articulo -> System.out.println(articulo));
		
		ListaDAO.obtenerTodos().forEach(lista -> System.out.println(lista));
		
	}
}
