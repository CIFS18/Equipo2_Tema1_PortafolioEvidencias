
package JuegoDado;
import entradadatosjopi.EntradaDatosJOPI;
public class Juego {
    public static void main(String[] args) {
        Juego juego= new Juego();
        juego.jugar();
    }
    public void jugar(){
        Dado dado1=new Dado();
        Dado dado2=new Dado();
        BcoPreguntas maraton=new BcoPreguntas();
        int aciertos=0;byte n;
        String respuesta;
        do{
           n=(byte) (dado1.geTiro()+dado2.geTiro());
           respuesta=EntradaDatosJOPI.cadena(maraton.getPregunta(n));
           if(respuesta.equalsIgnoreCase(maraton.getRespuesta(n))){
               aciertos++;
           }
           respuesta=EntradaDatosJOPI.cadena("DESEA SEGUIR?"+" \n Aciertos"+aciertos);
        }while(respuesta.equalsIgnoreCase("SI") | respuesta.equalsIgnoreCase("Yes"));
    }
}
