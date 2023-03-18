package test;

import model.*;

public class Principal {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();

		//agrega productos y servicios de a uno
        System.out.println("(1.1)");
        try {
			sistema.agregarServicio("718392", "Mantenimiento hidrolavadora", 2700.0, 10.0, true);
	        System.out.println("Servicio agregado");
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
        
        
        System.out.println("(1.2)");
        try {
			sistema.agregarServicio("7183921", "Mantenimiento hidrolavadora", 2700.0, 10.0, true);
	        System.out.println("Servicio agregado");
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
        
        
        System.out.println("(1.3)");
        try {
			sistema.agregarProducto("782951", "Diyuntor", 4500.0, 25.0, true);
	        System.out.println("Producto agregado");
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
        
        
        System.out.println("(1.4)");
        try {
			sistema.agregarProducto("7829512", "Diyuntor", 4500.0, 25.0, true);
	        System.out.println("Producto agregado");
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
        
        //trae 2 mercancia por su codMercancia
        System.out.println("(2.1)");
        Mercancia m = sistema.traerMercancia("7183921");
        System.out.println("precio final = "+ m.calcularPrecioFinal());
        
        
        System.out.println("(2.2)");
        Mercancia m2 = sistema.traerMercancia("7829512");
        System.out.println("precio final = "+m2.calcularPrecioFinal());
        
        //agrega 2 productos y 2 servicios
        System.out.println("(3.1)");
        try {
            sistema.agregarProducto("3780173","Lampara led 9W", 330.0, 10.0, true);
        	sistema.agregarServicio("1973851","Mantenimiento de martillo neumático", 3500.0, 10.0, true);
            sistema.agregarProducto("4897183","Lampara led 11W", 450.0, 10.0, false);
            sistema.agregarServicio("2891728","Mantenimiento aire acondicionado", 2250.0, 10.0, false);
	        System.out.println("Mercancias agregadas");

        } catch (Exception e) {
			 System.out.println(e.getMessage());
		}
        
        
        // Ya se crearon arriba en 3.1
        System.out.println("(3.2)");
        try {
        	sistema.agregarServicio("2891728","=Mantenimiento aire acondicionado", 2250.0, 10.0, false);
	        System.out.println("Servicio agregado");
        } catch (Exception e) {
			 System.out.println(e.getMessage());
		}
        
        System.out.println("(3.3)");
        try {
            sistema.agregarProducto("3780173","Lampara led 9W", 330.0, 10.0, true);
	        System.out.println("Producto agregado");
        } catch (Exception e) {
			 System.out.println(e.getMessage());
		}
        
        //imprime toda la lista de mercancias
        System.out.println("(4.0)");
        System.out.println(sistema.traerMercancia(true));
        
        
        
        
	}
}
