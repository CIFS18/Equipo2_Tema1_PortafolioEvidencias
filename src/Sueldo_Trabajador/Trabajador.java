
package Sueldo_Trabajador;

public class Trabajador {
    private String apellidoP;
    private String apMaterno;
    private String nombre;
    private DatosLaborales datosLabor;

    public Trabajador() {
    }

    public Trabajador(String apellidoP, String apMaterno, String nombre, DatosLaborales datosLabor) {
        this.apellidoP = apellidoP;
        this.apMaterno = apMaterno;
        this.nombre = nombre;
        this.datosLabor = datosLabor;
    }


    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DatosLaborales getDatosLabor() {
        return datosLabor;
    }

    public void setDatosLabor(DatosLaborales datosLabor) {
        this.datosLabor = datosLabor;
    }
    
}
