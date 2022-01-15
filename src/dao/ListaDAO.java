package dao;

import java.util.List;

import entidades.Lista;

public class ListaDAO extends GenericDAO{

	public static List<Lista> obtenerTodos(){
		SessionHandler.startSession();
		List<Lista> objects = SessionHandler.getSession().createQuery("FROM Lista", Lista.class).list();
		SessionHandler.closeSession();
		return objects;
	}
}
