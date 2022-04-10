package dao;

import java.util.List;

import entidades.Lista;

public class ListaDAO extends GenericDAO{

	public static List<Lista> obtenerTodos(){
		SessionHandler.start();
		List<Lista> objects = SessionHandler.get().createQuery("FROM Lista", Lista.class).list();
		SessionHandler.close();
		return objects;
	}
}
