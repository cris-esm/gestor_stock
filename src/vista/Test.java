package vista;


import dao.ArticuloDAO;

import dao.StockDAO;
import entities.Articulo;
import entities.StockArticulo;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Articulo articulo1 = new Articulo();
		articulo1.setNombre("Remera oferta");
		
		StockArticulo stock1 = new StockArticulo(400.0, "12", "Rojo", null);
		
		articulo1.addStock(stock1);
		
		StockDAO.guardar(stock1);
		ArticuloDAO.guardar(articulo1);
		
		ArticuloDAO.obtenerTodos().forEach(articulo -> System.out.println(articulo));
		
	}
}
