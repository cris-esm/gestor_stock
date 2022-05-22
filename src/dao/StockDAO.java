package dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;

import dao.util.persistance.SessionHandler;
import entities.Articulo;
import entities.StockArticulo;

public class StockDAO extends GenericDAO {
	
	public static List<StockArticulo> obtenerTodos(){
		SessionHandler.start();
		List<StockArticulo> objects = SessionHandler.get().createQuery("FROM StockArticulo", StockArticulo.class).list();
		SessionHandler.close();
		return objects;
	}
	
	public static List<StockArticulo> obtenerPorArticulo(Articulo articulo) {
		SessionHandler.start();
		CriteriaBuilder cb = SessionHandler.get().getCriteriaBuilder();
		CriteriaQuery<StockArticulo> cr = cb.createQuery(StockArticulo.class);
		Root<StockArticulo> root = cr.from(StockArticulo.class);
		cr.select(root).where(cb.like(root.get("articulo"), "%"+articulo.getId()+"%"));
		
		Query<StockArticulo> query = SessionHandler.get().createQuery(cr);
		List<StockArticulo> articulos = query.getResultList();
		return articulos;
	}
	
}
