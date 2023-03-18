package model;


public class Servicio extends Mercancia{
	private String servicio;
	private double presupuesto;
	private double porcentajeDescuento;
	private boolean promocion;
	
	public Servicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento,
				 	boolean promocion) throws Exception {
		
		super(codMercancia);
		this.servicio = servicio;
		this.presupuesto = presupuesto;
		this.porcentajeDescuento = porcentajeDescuento;
		this.promocion = promocion;
	}


	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

    //metodos heredados y sobre Escritura
	@Override
	public double calcularPrecioFinal() {
		double precioFinal = this.getPresupuesto();
		if(this.isPromocion()) {
			precioFinal -= this.getPresupuesto() * ( this.getPorcentajeDescuento()/100);
		}
		return precioFinal;
	}

	@Override
	public boolean oferta() {
		return this.isPromocion();
	}
	
	
}
