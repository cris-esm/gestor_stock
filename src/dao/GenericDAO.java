package dao;

public abstract class GenericDAO {
	
	public static void guardar(Object object) {
		SessionHandler.start();
		SessionHandler.get().save(object);
		SessionHandler.get().getTransaction().commit();
		SessionHandler.close();
	}
	
	public static void actualizar(Object object) {
		SessionHandler.start();
		SessionHandler.get().update(object);
		SessionHandler.get().getTransaction().commit();
		SessionHandler.close();
	}
	
	public static void eliminar(Object object) {
		SessionHandler.start();
		SessionHandler.get().delete(object);
		SessionHandler.get().getTransaction().commit();
		SessionHandler.close();
	}
	
}
