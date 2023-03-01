
package segundoproblema;


public class Distancia {
    private Punto punto1;
    private Punto punto2;

    public Distancia() {
    }

    public Distancia(Punto puntoA, Punto puntoB) {
        this.punto1 = puntoA;
        this.punto2 = puntoB;
    }


    public void setPunto1(Punto puntoA) {
        this.punto1=puntoA;
    }

    public void setPunto2(Punto puntoB) {
        this.punto2=puntoB;
    }
    public double getDistancia(){
        double resultado=Math.sqrt(Math.pow(punto2.getX()-punto1.getX(),2)+Math.pow(punto2.getY()-punto1.getY(), 2));
        return resultado;
    
    }
}
