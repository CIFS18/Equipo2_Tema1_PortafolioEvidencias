
package CentroCultural;

public class Libro {
    private String cid;
    private String titulo;
    private String autor;
    private String numPag;

    public Libro() {
    }

    public Libro(String cid, String titulo, String autor, String numPag) {
        this.cid = cid;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumPag() {
        return numPag;
    }

    public void setNumPag(String numPag) {
        this.numPag = numPag;
    }
    
    public String getDatosLibro(){
        String msg = "Datos Libro \n";
        msg += "ID Libro: "+cid+"\n";
        msg += "Titulo: "+titulo+"\n";
        msg += "Autor:"+autor+"\n";
        msg += "Num Pags:"+numPag+"\n";
        return msg;
    }
}
