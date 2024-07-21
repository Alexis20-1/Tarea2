public class Producto {
    private  String nombre;
    private double precio;
    private CategoriaProducto categoriaProducto;
    private int cantidad;

    Producto(String nombre, double precio, CategoriaProducto categoriaProducto, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.categoriaProducto = categoriaProducto;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        if (precio <= 0){
            throw new IllegalArgumentException("el precio no puede estar en negativo");
        }
        return precio;
    }
    public CategoriaProducto getCategoriaProducto(){
        return  categoriaProducto;
    }
    public int getCantidad(){
        if (cantidad <=0){
            throw new IllegalArgumentException("LA cantidad de productos no pueden ser 0 o menores");
        }
        return  cantidad;
    }
    public void setNombre(String nombre){
        if(nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        if (precio < 0){
            throw new IllegalArgumentException("el precio no puede ser negativo");
        }
        this.precio = precio;
    }
    public void setCategoriaProducto(CategoriaProducto categoriaProducto){
        if (categoriaProducto == null){
            throw new IllegalArgumentException("la categoria de producto no puede estar vacia");
        }
        this.categoriaProducto = categoriaProducto;
    }
    public void setCantidad(int cantidad){
        if (cantidad <=0){
            throw new IllegalArgumentException("LA cantidad de productos no pueden ser 0 o menores");
        }
        this.cantidad = cantidad;
    }

}
