
package CentroCultural;

public class Clientes {
    private String nombre;
    private String nc; //Numeroo de control
    private Peticiones peticiones[];
    private int toPeticiones;

    public Clientes() {
    }

    public Clientes(String nombre, String nc) {
        this.nombre = nombre;
        this.nc = nc;
        this.peticiones = new Peticiones[5];
        toPeticiones=-1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public Peticiones[] getPeticiones() {
        return peticiones;
    }

    public void setPeticiones(Peticiones[] peticiones) {
        this.peticiones = peticiones;
    }
    public String getDatosClientes(){
        String msg="NC; "+this.getNc()+"\n";
        msg+="Nombre del Cliente: "+this.getNombre()+"\n";
        return msg;
    }
    public boolean insertaPeticion(Peticiones peticion){
        if(toPeticiones<this.peticiones.length){
            this.peticiones[++toPeticiones]=peticion;
            return true;
        }
        return false;
    
    
    }
    
}
