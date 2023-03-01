
package PuntoV3;

import segundoproblema.version2.*;
import entradadatosjopi.EntradaDatosJOPI;


public class DistanciaEntre2Puntos {
    public Punto creaPunto(String numPunto){
       double x,y;
       x=EntradaDatosJOPI.doble("Dame el valor de x del "+numPunto);
       y=EntradaDatosJOPI.doble("Dame el valor de x del "+numPunto);
       return new Punto(x,y);
    }
    public static void main(String[] args) {
        DistanciaEntre2Puntos d=new DistanciaEntre2Puntos();
        d.calDistancia();
    }

    private void calDistancia() {
        Distancia distancia=new Distancia(creaPunto("Primer punto"),creaPunto("Segundo Punto"));
        System.out.println("La distancuia es: "+distancia.getDistancia());
    }


}
