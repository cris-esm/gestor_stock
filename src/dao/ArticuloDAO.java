package dao;

import java.util.List;

import entidades.Articulo;

public class ArticuloDAO extends GenericDAO {	
	
	public static List<Articulo> obtenerTodos(){
		SessionHandler.startSession();
		List<Articulo> objects = SessionHandler.getSession().createQuery("from Articulo", Articulo.class).list();
		SessionHandler.closeSession();
		return objects;
	}

}
