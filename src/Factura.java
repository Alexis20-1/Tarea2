import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Factura {
     private String numero;
     private Date fecha;
     private Cliente cliente;
     private ArrayList<Producto> productos = new ArrayList<>();

     Factura(Date fecha, Cliente cliente){
         if (fecha == null){
             throw  new IllegalArgumentException("la fecha n0o puede estar vacia. ");
         }
         if (cliente == null){
             throw  new IllegalArgumentException("el cliente no puede tener valores vacio.");
         }
         this.numero = generarNumeroFactura();
         this.fecha = fecha;
         this.cliente = cliente;
         this.productos = new ArrayList<>();

     }
     public String getNumero(){
         return numero;
     }
     public Date getFecha(){
         return fecha;
     }
     public  Cliente getCliente(){
         return cliente;
     }
     public ArrayList<Producto> getProductos(){
         return productos;
     }
     public void setNumero(String numero){
         if(numero == null || numero.isEmpty()){
             throw new IllegalArgumentException("el numero de factura no puede estar vacio.");
         }
         this.numero = numero;
     }
     public void  setFecha(Date fecha){
         if (fecha == null){
             throw  new IllegalArgumentException("la fecha no puuede estar vacia.");
         }
         this.fecha = fecha;
     }
     public  void  setCliente(Cliente cliente){
         if (cliente == null){
             throw new IllegalArgumentException("el campo de cliente no puede estar vacio.");
         }
         this.cliente = cliente;
     }
     public void setProductos(ArrayList<Producto> productos){
         if (productos == null){
             throw  new IllegalArgumentException("el campo de producto no puede estar vacio.");
         }
         this.productos = productos;
     }

     public void agregarProductos(Producto producto){
         if (producto == null){
             throw new IllegalArgumentException("el producto no puede estar vacio");
         }
         this.productos.add(producto);

     }
    private String generarNumeroFactura() {
        Random random = new Random();
        int numero = random.nextInt(99999);
        return "F" + String.format("%06d", numero);
    }

}
