package dao;

import java.util.List;

import entidades.Articulo;

public class ArticuloDAO extends GenericDAO {	
	
	public static List<Articulo> obtenerTodos(){
		SessionHandler.start();
		List<Articulo> objects = SessionHandler.get().createQuery("from Articulo", Articulo.class).list();
		SessionHandler.close();
		return objects;
	}

}
