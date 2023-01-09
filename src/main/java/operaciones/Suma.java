package operaciones;

import interfaces.BuilderOperacion;
import interfaces.Operacion;

public class Suma implements Operacion {

    private Suma(){

    }
    @Override
    public float ejecuta(float operando, float operando2) {
        return operando + operando2;
    }

    public static class Builder implements BuilderOperacion {
        private Suma suma;

        public Builder(){
            this.reset();
        }
        @Override
        public void reset() {
            this.suma = new Suma();
        }

        public Suma Build(){
            Suma build = this.suma;
            this.reset();
            return build;
        }
    }
}
