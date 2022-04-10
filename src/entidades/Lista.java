package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "listas")
public class Lista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lista")
	private Integer id;
	
	private String nombre;	

    @OneToMany(mappedBy = "lista")
    private List<Articulo> articulos;
	
	public Lista() {
		articulos = new ArrayList<Articulo>();
	}

	public Lista(String nombre) {
		this.nombre = nombre;
		articulos = new ArrayList<Articulo>();
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

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Lista [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
