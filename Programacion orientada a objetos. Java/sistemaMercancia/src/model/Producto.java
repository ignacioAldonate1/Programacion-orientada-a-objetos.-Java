package model;

public class Producto extends Mercancia{

	private String producto;
	private double precioProducto;
	private double porcentajeDescuento;
	private boolean esDescuentoEn2daUnidad;
	
	public Producto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento,
					boolean esDescuentoEn2daUnidad) throws Exception{
		
		super(codMercancia);
		this.producto = producto;
		this.precioProducto = precioProducto;
		this.porcentajeDescuento = porcentajeDescuento;
		this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public boolean EsDescuentoEn2daUnidad() {
		return esDescuentoEn2daUnidad;
	}

	public void setEsDescuentoEn2daUnidad(boolean esDescuentoEn2daUnidad) {
		this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
	}


    //metodos heredados y sobre Escritura
	@Override
	public double calcularPrecioFinal() {
		double precioFinal = this.getPrecioProducto();
		
		if(this.EsDescuentoEn2daUnidad()) {
			precioFinal -= (this.getPrecioProducto() /2) * (this.getPorcentajeDescuento() / 100);
		}
		
		return precioFinal;
	}

	@Override
	public boolean oferta() {
		return this.EsDescuentoEn2daUnidad();
	}



}
