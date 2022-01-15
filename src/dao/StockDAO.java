package dao;

import java.util.List;

import entidades.StockArticulo;

public class StockDAO extends GenericDAO {
	
	public static List<StockArticulo> obtenerTodos(){
		SessionHandler.startSession();
		List<StockArticulo> objects = SessionHandler.getSession().createQuery("FROM StockArticulo", StockArticulo.class).list();;
		SessionHandler.closeSession();
		return objects;
	}
	
	
}
