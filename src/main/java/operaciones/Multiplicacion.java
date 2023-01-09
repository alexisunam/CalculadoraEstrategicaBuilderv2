package operaciones;

import interfaces.Operacion;

public class Multiplicacion implements Operacion {

    public Multiplicacion(){

    }
    @Override
    public float ejecuta(float operando, float operando2) {
        return operando * operando2;
    }


}
