
package CentroCultural;

public class Peticiones {
    private Fecha fechaI;
    private Fecha fechaF;
    private Revista revista;
    private Libro libro;

    public Peticiones() {
    }

    public Peticiones(Fecha fechaI, Fecha fechaF, Revista revista, Libro libro) {
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.revista = revista;
        this.libro = libro;
    }

    public Fecha getFechaI() {
        return fechaI;
    }

    public void setFechaI(Fecha fechaI) {
        this.fechaI = fechaI;
    }

    public Fecha getFechaF() {
        return fechaF;
    }

    public void setFechaF(Fecha fechaF) {
        this.fechaF = fechaF;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
}
