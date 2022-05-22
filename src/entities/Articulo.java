package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "articulo")
public class Articulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_articulo")
	private Integer id;
	
	private String nombre;
    
    @OneToMany(mappedBy = "articulo")
    private List<StockArticulo> stock;

	public Articulo() {
		stock = new ArrayList<StockArticulo>();
	}

	public Articulo(String nombre) {
		this.nombre = nombre;
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
		return "Articulo [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
