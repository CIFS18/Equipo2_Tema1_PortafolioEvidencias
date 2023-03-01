
package PuntoV1;

import entradadatosjopi.EntradaDatosJOPI;
import javax.swing.JOptionPane;

public class DistanciaEntre2Puntos {
    public static void main(String[] args) {
        muestraDistancia();
        
    }

    private static void muestraDistancia() {
        Punto puntoA= new Punto();
        Punto puntoB= new Punto();
        Distancia distancia= new Distancia();
        puntoA.setX(EntradaDatosJOPI.doble("Coordenada A(x)"));
        puntoB.setX(EntradaDatosJOPI.doble("Coordenada B(x)"));
        puntoA.setY(EntradaDatosJOPI.doble("Coordenada A(y)"));
        puntoB.setY(EntradaDatosJOPI.doble("Coordenada B(y)"));
        distancia.setPunto1(puntoA);
        distancia.setPunto2(puntoB);
        JOptionPane.showMessageDialog(null, distancia.getDistancia());
    }

}
