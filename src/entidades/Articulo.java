package entidades;

import java.util.ArrayList;
import java.util.List;

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
	
    @ManyToOne
    @JoinColumn(name = "id_lista")
	private Lista lista;
    
    @OneToMany(mappedBy = "articulo")
    private List<StockArticulo> stock;

	public Articulo() {
		stock = new ArrayList<StockArticulo>();
	}

	public Articulo(String nombre, String categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
		stock = new ArrayList<StockArticulo>();
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

	public Lista getLista() {
		return lista;
	}

	public void setLista(Lista lista) {
		this.lista = lista;
	}

	public List<StockArticulo> getStock() {
		return stock;
	}

	public void setStock(List<StockArticulo> stock) {
		this.stock = stock;
	}
	
	public void addStock(StockArticulo stock) {
		this.stock.add(stock);
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + "]";
	}
	
}
