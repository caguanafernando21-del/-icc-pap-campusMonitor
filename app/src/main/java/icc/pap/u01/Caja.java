package icc.pap.u01;

public class Caja<T> {

    // Dato generico
    private final T valor;
    
    public Caja(T valor){
        this.valor = valor;
    }
    //Metodo generico
    //Getter
    public  T obtener(){
        return valor;
    }

}
