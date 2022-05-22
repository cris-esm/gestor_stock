package dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;

import dao.util.persistance.SessionHandler;
import entities.Articulo;

public class ArticuloDAO extends GenericDAO {	
	
	public static List<Articulo> obtenerTodos(){
		SessionHandler.start();
		List<Articulo> objects = SessionHandler.get().
				createQuery("SELECT a FROM Articulo a", Articulo.class).list();
		SessionHandler.close();
		return objects;
	}
	
	public static List<Articulo> obtenerPorNombre(String nombre) {
		SessionHandler.start();
		
		CriteriaBuilder cb = SessionHandler.get().getCriteriaBuilder();
		CriteriaQuery<Articulo> cr = cb.createQuery(Articulo.class);
		Root<Articulo> root = cr.from(Articulo.class);
		cr.select(root).where(cb.like(root.get("nombre"), nombre+"%"));
		
		Query<Articulo> query = SessionHandler.get().createQuery(cr);
		List<Articulo> articulos = query.getResultList();
		return articulos;
	}

}
