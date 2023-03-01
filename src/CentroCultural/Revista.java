
package CentroCultural;

public class Revista {
    private String cid;
    private String titulo;
    private String autor;

    public Revista() {
    }

    public Revista(String cid, String titulo, String autor) {
        this.cid = cid;
        this.titulo = titulo;
        this.autor = autor;
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
    
        public String getDatosRevista(){
        String msg = "Datos Revista \n";
        msg += "ID Libro: "+cid+"\n";
        msg += "Titulo: "+titulo+"\n";
        msg += "Autor:"+autor+"\n";
        return msg;
    }
}
