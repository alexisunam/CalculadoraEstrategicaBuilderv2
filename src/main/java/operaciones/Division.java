package operaciones;

import interfaces.Operacion;

public class Division implements Operacion {

    public Division(){

    }
    @Override
    public float ejecuta(float operando, float operando2) {
        return operando / operando2;
    }


}
