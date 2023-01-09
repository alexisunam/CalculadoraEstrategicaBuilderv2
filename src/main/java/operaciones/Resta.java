package operaciones;

import interfaces.Operacion;

public class Resta implements Operacion {

    public Resta(){

    }
    @Override
    public float ejecuta(float operando, float operando2) {
        return operando - operando2;
    }


}
