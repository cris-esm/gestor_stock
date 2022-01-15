package dao;

public abstract class GenericDAO {
	
	public static void guardar(Object object) {
		SessionHandler.startSession();
		SessionHandler.getSession().save(object);
		SessionHandler.getSession().getTransaction().commit();
		SessionHandler.closeSession();
	}
	
	public static void actualizar(Object object) {
		SessionHandler.startSession();
		SessionHandler.getSession().update(object);
		SessionHandler.getSession().getTransaction().commit();
		SessionHandler.closeSession();
	}
	
	public static void eliminar(Object object) {
		SessionHandler.startSession();
		SessionHandler.getSession().delete(object);
		SessionHandler.getSession().getTransaction().commit();
		SessionHandler.closeSession();
	}
	
}
