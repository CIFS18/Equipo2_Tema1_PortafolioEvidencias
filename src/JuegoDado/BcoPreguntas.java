
package JuegoDado;

public class BcoPreguntas {
    String preguntas[]={"1+1","2+2","3+3","4+4","5+5","6+6","7+7","8+8","9+9","10+10","11+11","12+12"};
    String respuestas[]={"2","4","6","8","10","12","14","16","18","20","22","24"};
    public BcoPreguntas(){
        
    }
    public String getPregunta(int n){
        try{
            return preguntas[n];
        }catch(Exception e){
            getPregunta(n);
        }
        return preguntas[n];
    }
    public String getRespuesta(int n){
        return respuestas[n];
    }
}
