package entidades;

import javax.persistence.*;

@Entity
@Table(name = "articulos")
public class Articulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_articulo")
	private Integer id;
	
	private String nombre;
	
	private String categoria;

	public Articulo() {

	}

	public Articulo(String nombre, String categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + "]";
	}
	
	
	//private Integer idLista;
	
	
	
}
