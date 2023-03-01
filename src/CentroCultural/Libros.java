
package CentroCultural;

import entradadatosjopi.EntradaDatosJOPI;
import javax.swing.JOptionPane;
import salida.JOPIS;
import salida.Menu;

public class Libros {
    private Libro libros[];
    private int i;

    
    //Metodos sobrecargados: Se llaman igual pero reciben mas o menos parametros que otros (Cambian diferentes tipos de datoos)
    
    //Operador sobrecargado= Puede funjir como suma de numeros(int, float, double, Long) o concatenación de textos (String)   // Cambian los parametros 
    
    
    
    public Libros() {}
    
    public Libros(int numLibros) {
        libros=new Libro[numLibros];
        this.i=-1;
    }

    public Libro[] getLibros() {
        return libros;
    }
    
    public void alta(){
        //Verifica que existen celdas vacias para insertar un objeto
        if (i<this.libros.length-1){
            libros[++i]=creaLibro();
        }
        else {
            JOptionPane.showMessageDialog(null, "VECTOR LLENO");
        }
    }
    
    private Libro creaLibro(){
        String codID, titulo, autor, numPags;
        codID = EntradaDatosJOPI.cadena("codID");
        titulo=EntradaDatosJOPI.cadena("Titulo");
        autor=EntradaDatosJOPI.cadena("Autor");
        numPags=EntradaDatosJOPI.cadena("Num Pags");
        
        return new Libro(codID, titulo, autor, numPags);
    }
    
    public void muestra(){
        for (int j=0; j<=i; j++){
            JOptionPane.showMessageDialog(null, this.libros[j].getDatosLibro());
        }
    }
    public void elimina(){
        /*
        Eliminar el ultimo lobro que este en el vector
        */
        try{
            this.libros[i]=null;
            if (this.libros[i]!=null){
            JOPIS.mensaje("SE HA ELIMINADO EL ULTIMO LIBRO");
            }
            i--;
            //AGREGADO EL 26 DE FEBREO--CIFS
            
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "La posicion no existe"+e.getClass());
        }
    
    }
    
    public void elimina (int posicion){
        if (posicion<=i && posicion >=0){
            while(posicion<i){
                this.libros[posicion]=this.libros[posicion+1];
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
                    +this.libros[p].getDatosLibro());
                if (r.equalsIgnoreCase("SI")){
                    String codID=EntradaDatosJOPI.cadena("Nuevo ID");
                    String titulo=EntradaDatosJOPI.cadena("Nuevo titulo");
                    String autor=EntradaDatosJOPI.cadena("Nuevo autor");
                    String numPag=EntradaDatosJOPI.cadena("Num pags");
                    
                    this.libros[p].setCid(codID);
                    this.libros[p].setTitulo(titulo);
                    this.libros[p].setAutor(autor);
                    this.libros[p].setNumPag(numPag);
                
                }
                else{JOptionPane.showMessageDialog(null, "Esa posicion no existe");}
        
        }
    
    
    }
    public Libro buscar(String cId){
        int k=0;
        
        while (k<1){
            if (this.libros[k].getCid().equals(cId)){
                return this.libros[k];
            }
            k++;
        }
        return null; //no se encuentra el libro
    }
}
