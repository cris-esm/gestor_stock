package dao;

import java.util.List;

import dao.util.persistance.SessionHandler;
import entities.StockArticulo;

public class StockDAO extends GenericDAO {
	
	public static List<StockArticulo> obtenerTodos(){
		SessionHandler.start();
		List<StockArticulo> objects = SessionHandler.get().createQuery("FROM StockArticulo", StockArticulo.class).list();
		SessionHandler.close();
		return objects;
	}
	
	
}
