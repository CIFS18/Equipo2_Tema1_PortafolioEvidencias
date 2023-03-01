
package CentroCultural;

import entradadatosjopi.EntradaDatosJOPI;
import salida.JOPIS;
import salida.Menu;

public class CtrlPeticiones {
    String opcionesPeticiones[]={"SOLICITAR","DEVOLVER","REPASAR"};
    Libros vLibros;
    Revistas vRevistas;

    public CtrlPeticiones(Libros vLibros, Revistas vRevistas) {
        this.vLibros = vLibros;
        this.vRevistas = vRevistas;
    }
    
    public void ctrlLibros(Clientes clte){
        int opcion;
        do{
            opcion=Menu.menuBotones(opcionesPeticiones,"QUE DESEA HACER\n");
            switch(opcion){
                case 0:solicitaLibro(clte);break;
                case 1:devuelveLibro(clte);break;
            }
        }while(opcion!=2);
        
        }
    public void solicitaLibro(Clientes clte){
        String numLibro=EntradaDatosJOPI.cadena("De el numero de libro");
        Libro fichaLibro=null;
        if ((fichaLibro=vLibros.buscar(numLibro))!=null){
            Fecha fechaI=creaFecha("Inicio");
            Fecha fechaF=creaFecha("Fin");
            Peticiones peticion = new Peticiones (fechaI,fechaF,null,fichaLibro);
            insertaPeticion(clte,peticion);
        }
    }
    public void insertaPeticion(Clientes clte, Peticiones peticion){
        if(clte.insertaPeticion(peticion)){
            JOPIS.mensaje("SE PRESTO EL LIBRO");
        }else{
            JOPIS.mensaje("AGOTO SUS PRESTAMOS");
        }
    }
    public Fecha creaFecha(String msg){
    byte d,m;
    int a;
    d=EntradaDatosJOPI.byteEntero("DIA"+msg);
    m=EntradaDatosJOPI.byteEntero("MES"+msg);
    a=EntradaDatosJOPI.entero("AÑO"+msg);
    return new Fecha(d,m,a);
        
    }

    private void devuelveLibro(Clientes clte) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

