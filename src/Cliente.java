public class Cliente {
    private String nombre;
    private  String rtn;
    private String direccion;
    private String telefono;

    Cliente(String nombre, String rtn, String direccion, String telefono){
        this.nombre = nombre;
        this.rtn = rtn;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }
    public  String getRtn(){
        return rtn;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return  telefono;
    }
    public  void setNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            System.out.println("no puede estar vacio.");
        }
        this.nombre = nombre;
    }
    public  void setRtn(String rtn){
        if (rtn == null || rtn.isEmpty()){
            throw  new IllegalArgumentException("el rtn no puede estar vacio:");
        }
        this.rtn = rtn;
    }
    public  void setDireccion(String direccion){
        if (direccion == null || direccion.isEmpty()){
            throw  new IllegalArgumentException("la direccion no puede estar vacio:");
        }
        this.direccion = direccion;
    }
    public  void setTelefono(String telefono ){
        if (telefono == null || telefono.isEmpty()){
            throw  new IllegalArgumentException("el numero de telefono no puede estar vacio:");
        }
        this.telefono = telefono;
    }

}
