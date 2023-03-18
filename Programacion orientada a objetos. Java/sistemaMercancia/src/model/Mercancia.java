package model;

public abstract class Mercancia {
	protected String codMercancia;
	
    public Mercancia(String codMercancia) throws Exception{
    	
		if(codMercancia.length() !=7) {
			throw new Exception("El cod debe tener 7 caracteres");
		}
		
        this.codMercancia = codMercancia;
    }
	
    //metodo abstractos que heredan y se distinguen cada uno usando poliformismo
	public abstract double calcularPrecioFinal();
	public abstract boolean oferta();
	
	public String getCodMercancia() {
		return codMercancia;
	}

	public void setCodMercancia(String codMercancia) throws Exception {
		//no tiene 7 caracteres?
		if(codMercancia.length() !=7) {
			throw new Exception("El cod debe tener 7 caracteres");
		}
		this.codMercancia = codMercancia;
	}

	//toString para para mercancia o lista
	@Override
	public String toString() {
		return "codigo= " + codMercancia +"";
	}
	
	
	
}
