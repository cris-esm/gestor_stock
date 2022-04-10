package entidades;

import javax.persistence.*;

@Entity
@Table(name = "stock_articulo")
public class StockArticulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_stock")
	private Integer id;
	
	private Double precio;
	
	private String talle;
	
	private String disenio;
	
	private String material;
	
    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;
	
	public StockArticulo() {
		
	}	
	
	public StockArticulo(Double precio, String talle, String disenio, String material) {
		this.precio = precio;
		this.talle = talle;
		this.disenio = disenio;
		this.material = material;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getDisenio() {
		return disenio;
	}

	public void setDisenio(String disenio) {
		this.disenio = disenio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "StockArticulo [id=" + id + ", precio=" + precio + ", talle=" + talle + ", disenio=" + disenio
				+ ", material=" + material + "]";
	}
	
}
