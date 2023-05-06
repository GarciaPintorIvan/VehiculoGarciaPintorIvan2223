
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoGarciaPintorIvan2223 miVehiculoGarciaPintorIvan2223;
        int stockActual;
        
        miVehiculoGarciaPintorIvan2223 = new VehiculoGarciaPintorIvan2223("Seat",18000,100);
        operativaVehiculosGarciaPintorIvan2223(miVehiculoGarciaPintorIvan2223, 50); 
        stockActual = miVehiculoGarciaPintorIvan2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosGarciaPintorIvan2223(VehiculoGarciaPintorIvan2223 miVehiculoGarciaPintorIvan2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoGarciaPintorIvan2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoGarciaPintorIvan2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
