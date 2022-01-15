package entidades;

import javax.persistence.*;

@Entity
@Table(name = "listas")
public class Lista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lista")
	private Integer id;
	
	private String nombre;
	
	public Lista() {

	}

	public Lista(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Lista [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
