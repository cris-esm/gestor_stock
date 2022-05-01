package entities;

import javax.persistence.*;

@Entity
@Table(name = "STOCK_ARTICULO")
public class StockArticulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_STOCK")
	private Integer id;
	
	@Column(name = "PRECIO")
	private Double precio;
	
	@Column(name = "TALLE")
	private String talle;
	
	@Column(name = "DISENIO")
	private String disenio;
	
	@Column(name = "MATERIAL")
	private String material;
	
    @ManyToOne
    @JoinColumn(name = "ID_ARTICULO")
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
