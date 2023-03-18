package model;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Mercancia> lstMercancia;

    //constructor sin parametros
	public Sistema() {
    	this.lstMercancia = new ArrayList<Mercancia>();
    }
	
    
    //lo encuentro por cod? sale y lo devuelve sin recorrer hasta el final
    public Mercancia traerMercancia(String codMercancia) {
    	Mercancia merEncontrada = null;
    	int i = 0;

    	while(i < this.lstMercancia.size() && merEncontrada == null ) {
    		Mercancia mer = this.lstMercancia.get(i);
    		if(mer.getCodMercancia().equalsIgnoreCase(codMercancia)) {
    			merEncontrada = mer;
    		}
    		i++;
    	}
    	return merEncontrada;
    }
    
    //recorre toda la lista, esta en oferta por poliformismo? lo agrega a una nueva y la devuelve
    public List<Mercancia> traerMercancia(boolean enOferta) {

        List<Mercancia> mercanciaEnOferta = new ArrayList<Mercancia>();
        for(Mercancia m: lstMercancia) {
        	if(m.oferta()) {
        		mercanciaEnOferta.add(m);
        	}

        }
    	return mercanciaEnOferta;
    }
   
    // Lo crea, ya existe? error // lo agrega y devuelve true
    public boolean agregarProducto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad) throws Exception {
    	
        Mercancia nuevo = new Producto(codMercancia, producto, precioProducto, porcentajeDescuento, esDescuentoEn2daUnidad);
        
        if(traerMercancia(nuevo.codMercancia)!=null) {
        	throw new Exception("Producto ya existente");
        }
    	return lstMercancia.add(nuevo);
    }
    
 
    public boolean agregarServicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion) throws Exception{

    	Mercancia nuevo = new Servicio(codMercancia, servicio, presupuesto, porcentajeDescuento, enPromocion);
        if(traerMercancia(nuevo.codMercancia)!=null) {
        	throw new Exception("Servicio ya existente");
        }
        return lstMercancia.add(nuevo);
        		
    }

	@Override
	public String toString() {
		return "lstMercancia= " + this.lstMercancia;
	}
}





