public class CategoriaProducto {

    private String nombre;
    private int pasillo;

    CategoriaProducto(String nombre, int pasillo){
        this.nombre = nombre;
        this.pasillo = pasillo;
    }

    public String getNombre(){
        return nombre;
    }
    public int getPasillo(){
        return pasillo;
    }
    public void setNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            throw  new IllegalArgumentException("el nombre no puede estar vacio.");
        }
        this.nombre = nombre;
    }
    public void setPasillo(int pasillo){
        if (pasillo <= 0){
            throw  new IllegalArgumentException("el numero del pasillo no puede ser cero o menor");
        }
        this.pasillo = pasillo;
    }
}
