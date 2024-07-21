import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            Cliente cliente = new Cliente("juan alvarenga","","123 calle falsa","3229-9087");

            CategoriaProducto categoriaElectronica = new CategoriaProducto("Electronica", 6);
            CategoriaProducto categoriaFrutas = new CategoriaProducto("Frutas", 9);

            Producto producto1 = new Producto("Radio", 199.99, categoriaElectronica, 9);
            Producto producto2 = new Producto("Manzana",180,categoriaFrutas,10);

            Factura factura = new Factura(new Date(),cliente);

            factura.agregarProductos(producto1);
            factura.agregarProductos(producto2);



            System.out.println("El numero de factura es: "+ factura.getNumero());
            System.out.println("fecha: "+factura.getFecha());
            System.out.println("Cliente: "+ factura.getCliente().getNombre());
            System.out.println("Productos: ");

            for(Producto producto : factura.getProductos()){
                System.out.println("-"+ producto.getNombre()+ " = " + producto.getCantidad());
            }

            double totalAPagar = pagarFactura(factura);
            System.out.println("el total a pagar es: " + totalAPagar + "$");

        }catch (IllegalAccessError e) {
            System.out.println("error: " + e.getMessage());
        }
    }
    public static  double pagarFactura(Factura factura){
        double total = 0;
        for(Producto producto : factura.getProductos()){
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}