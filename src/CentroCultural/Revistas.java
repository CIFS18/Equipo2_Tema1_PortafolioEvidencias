
package CentroCultural;

import entradadatosjopi.EntradaDatosJOPI;
import javax.swing.JOptionPane;
import salida.JOPIS;
import salida.Menu;

public class Revistas {
    private Revista [] revistas;
    private int i;

    public Revistas() {
    }

    public Revistas(int numRevistas) {
        revistas=new Revista[numRevistas];
        this.i=-1;
        //AGREGADO EL 26 DE FEBREO--CIFS

    }

    public Revista[] getRevistas() {
        return revistas;
    }
    
    public void alta(){
        //Verifica que existen celdas vacias para insertar un objeti
        if (i<this.revistas.length-1){
            revistas[++i]=creaRevista();
        }
    
    }
    
    private Revista creaRevista(){
        String codID, titulo, autor, numPags;
        codID = EntradaDatosJOPI.cadena("codID");
        titulo=EntradaDatosJOPI.cadena("Titulo");
        autor=EntradaDatosJOPI.cadena("Autor");
        
        return new Revista(codID, titulo, autor);
    }
    
    public void muestra(){
        for (int j=0; j<=i; j++){
            JOptionPane.showMessageDialog(null, this.revistas[j].getDatosRevista());
        }
    }
    public void elimina(){
        try{
            this.revistas[i]=null;
            if (this.revistas[i]!=null){
            JOPIS.mensaje("SE HA ELIMINADO LA ULTIMA REVISTA");
        }
            i--;

        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "La posicion no existe");
        }
    
    }
    
    public void elimina (int posicion){
        if (posicion<=i && posicion >=0){
            while(posicion<i){
                this.revistas[posicion]=this.revistas[posicion+1];
                posicion++;
            }
            String opEliminar[]={"SI","NO"};
            int opcion=Menu.menuBotones(opEliminar, "QUIEREN ELIMINARLO");
            switch(opcion){
                case 0: elimina();JOPIS.mensaje("SE HA ELIMINADO EL ARTICULOS"); ;break;
                case 1: JOPIS.mensaje("NO SE HA ELIMINADO NADA"); break;
            
            }
        }
        else{ JOptionPane.showMessageDialog(null, "esa posicion no existe!!");  }
    
    }
    
    public void modifica(int p){
        String r="";
        if (p<=i && p>=0){
            r=EntradaDatosJOPI.cadena("Esto es lo que deseas modificar si o no? \n\n"
                    +this.revistas[p].getDatosRevista());
                if (r.equalsIgnoreCase("SI")){
                    String codID=EntradaDatosJOPI.cadena("Nuevo ID");
                    String titulo=EntradaDatosJOPI.cadena("Nuevo titulo");
                    String autor=EntradaDatosJOPI.cadena("Nuevo autor");                    
                    this.revistas[p].setCid(codID);
                    this.revistas[p].setTitulo(titulo);
                    this.revistas[p].setAutor(autor);

                
                }
                else{JOptionPane.showMessageDialog(null, "Esa posicion no existe");}
        
        }
    
    }
        public Revista buscar(String cId){
        int k=0;
        
        while (k<1){
            if (this.revistas[k].getCid().equals(cId)){
                return this.revistas[k];
            }
            k++;
        }
        return null; //no se encuentra el libro
    }
}
