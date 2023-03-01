
package CentroCultural;

import entradadatosjopi.EntradaDatosJOPI;
import salida.Menu;

public class Centro_Cultural {
    String opciones[]={"INSERTAR","CONSULTAR","MODIFICAR","ELIMINA ULTIMO","ELIMINAR","REGRESAR"};
    public void crudLibros(Libros obLibros){
        int opcion=0;
      do{
          opcion=Menu.menuBotones(opciones,"MENU LIBROS");  
        switch(opcion){
            case 0:obLibros.alta();break;
            case 1:obLibros.muestra();break;
            case 2: int pos=EntradaDatosJOPI.entero("QUE POSICION DEASEA MODIFICAR");
                    obLibros.modifica(pos);break;
            case 3:obLibros.elimina();break;
            case 4:int p=EntradaDatosJOPI.entero("QUE POSICION DESEA ELIMINAR");
                   obLibros.elimina(p);break;
        }
      }while(opcion!=5);
    }
    public void crudRevistas(Revistas obRevistas){
        int opcion=0;
      do{
          opcion=Menu.menuBotones(opciones,"MENU REVISTAS");
        switch(opcion){
            case 0:obRevistas.alta();break;
            case 1:obRevistas.muestra();break;
            case 2: int pos=EntradaDatosJOPI.entero("QUE POSICION DEASEA MODIFICAR");
                    obRevistas.modifica(pos);break;
            case 3:obRevistas.elimina();break;
            case 4:int p=EntradaDatosJOPI.entero("QUE POSICION DESEA ELIMINAR");
                   obRevistas.elimina(p);break;
        }
      }while(opcion!=5);
    }  
    public void menuPrincipal(){
        String opPrincipal[]={"LIBROS","REVISTAS","PRESTAMOS","TERMINAR"};
        int opcion=0;
        Libros vecLibros=new Libros(4);
        Revistas vecRevistas=new Revistas(4);
        
        do{
            opcion=Menu.menuBotones(opPrincipal, "MENU PRINCIPAL");
            switch(opcion){
                case 0:crudLibros(vecLibros);break;
                case 1:crudRevistas(vecRevistas);break;
                case 2:ctrlPeticiones(vecLibros,vecRevistas);break;
            }
        }while(opcion!=3);
        }
    public void ctrlPeticiones(Libros vLib, Revistas vRev){
        String opPrincipal[]={"LIBROS","REVISTAS","TERMINAR"};
        int opcion=0;
        Clientes clte=creaClientes();
        CtrlPeticiones administra=new CtrlPeticiones(vLib, vRev);
        do{
            opcion=Menu.menuBotones(opPrincipal, "QUE DESEA SOLICITAR\n");
            
            switch(opcion){
                case 0:administra.ctrlLibros(clte);
                //case 1:ctrl.prestamosRevistas();break;
            }
        }while(opcion!=2);
    }
    public Clientes creaClientes(){
        String numC=EntradaDatosJOPI.cadena("NUMERO DEL CONTROL CLIENTE");
        String nomC=EntradaDatosJOPI.cadena("NOMBRE DEL CLIENTE");
        return new Clientes(numC,nomC);
    }
    public static void main(String[] args) {
        Centro_Cultural obcCultural=new Centro_Cultural();
        obcCultural.menuPrincipal();
    }
        
}


