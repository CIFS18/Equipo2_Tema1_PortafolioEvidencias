
package JuegoDado;

import java.util.Random;

class Dado {

    public Dado() {
    }
    public byte geTiro(){
        Random r= new Random();
        return (byte) (r.nextInt(6)+1);
    }
}
