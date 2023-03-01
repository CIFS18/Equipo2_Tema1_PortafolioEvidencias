
package CentroCultural;

public class Fecha {
    private int d;
    private int m;
    private int a;

    public Fecha() {
    }

    public Fecha(int d, int m, int a) {
        this.d = d;
        this.m = m;
        this.a = a;
    }

    public int getD() {
        return d;
    }

    public void setD(byte d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(byte m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }
    
}
