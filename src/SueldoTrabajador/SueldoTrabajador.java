package SueldoTrabajador;

import entradadatosjopi.EntradaDatosJOPI;

public class SueldoTrabajador {
    public static void main(String[] args) {
        
        SueldoTrabajador tester = new SueldoTrabajador();
        Trabajador tra = tester.creaTrabajador();
        FechaPago fP= tester.crearFechaPago();
        generaComprobantePago(tra, fP);
        
    }
    public DatosLaborales creaDatosLaborales(){
        DatosLaborales datosLab = new DatosLaborales();
        datosLab.setSueldoBase(EntradaDatosJOPI.flotante("Ingresa el sueldo"));
        datosLab.setPuesto(EntradaDatosJOPI.cadena("Ingresa el puesto de Trabajo \n OPCIONES \n Gerente \n Subgerente \n Supervisor \n Operativo"));
        return datosLab; 
    }
    public Trabajador creaTrabajador(){
        Trabajador trab = new Trabajador();
        trab.setApellidoP(EntradaDatosJOPI.cadena("Apellido Paterno"));
        trab.setApMaterno(EntradaDatosJOPI.cadena("Apellido Materno"));
        trab.setNombre(EntradaDatosJOPI.cadena("Nombre(s)"));
        trab.setDatosLabor(creaDatosLaborales());
        return trab;
    }
    public FechaPago crearFechaPago(){
        //Este metodo se tiene que crear para generar un objeto (INSTANCIA) de la clase FechaPago la cual se le asignara metodos y se retornara valores
        FechaPago creFechaPago = new FechaPago();
        creFechaPago.setDia(EntradaDatosJOPI.entero("Ingresa el dia de fecha de pago"));
        creFechaPago.setMes(EntradaDatosJOPI.entero("Ingresa el mes de fecha de pago"));
        creFechaPago.setAño(EntradaDatosJOPI.entero("Ingresa el año de fecha de pago"));
        return creFechaPago;
    }

    public static void generaComprobantePago(Trabajador tra, FechaPago fP) {
        String ApP=tra.getApellidoP().toUpperCase();
        String ApM=tra.getApMaterno().toUpperCase();
        String nom=tra.getNombre().toUpperCase();
        String puesto=tra.getDatosLabor().getPuesto().toUpperCase();
        float sueldo=tra.getDatosLabor().getSueldoBase();
        float des=tra.getDatosLabor().calcularDescuento();
        int year=fP.getAño();
        int month=fP.getMes();
        int day=fP.getDia();

    }
    
}
