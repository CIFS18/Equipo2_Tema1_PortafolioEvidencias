
package SueldoTrabajador;

public class DatosLaborales {
    private String puesto;
    private float sueldoBase;

    public DatosLaborales() {
    }
    
    public DatosLaborales(String puesto, float sueldoBase) {
        this.puesto = puesto;
        this.sueldoBase = sueldoBase;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public float calcularDescuento(){
    puesto = puesto.toUpperCase();
        if (puesto.equals("GERENTE")){return sueldoBase*0.3f;}else
        if (puesto.equals("SUBGERENTE")){return sueldoBase*0.25f;}else
        if (puesto.equals("SUPERVISOR")){return sueldoBase*0.20f;}else
        if (puesto.equals("OPERATIVO")){return sueldoBase*0.16f;}else{return 0.0f;}
    }

    @Override
    public String toString() {
        return "DatosLaborales{" + "puesto=" + puesto + ", sueldoBase=" + sueldoBase + '}';
    }
    
    
}
