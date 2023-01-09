package operaciones;

import interfaces.Operacion;

public class Suma implements Operacion {

    public Suma(){

    }


    @Override
    public float ejecuta(float operando, float operando2) {
        return operando + operando2;
    }

}
