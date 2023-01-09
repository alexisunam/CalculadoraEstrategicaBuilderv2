package operaciones;

import interfaces.BuilderOperacion;
import interfaces.Operacion;

public class Resta implements Operacion {

    private Resta(){

    }
    @Override
    public float ejecuta(float operando, float operando2) {
        return operando - operando2;
    }

    public static class Builder implements BuilderOperacion {
        private Resta resta;

        public Builder(){
            this.reset();
        }
        @Override
        public void reset() {
            this.resta = new Resta();
        }

        public Resta Build(){
            Resta build = this.resta;
            this.reset();
            return build;
        }
    }
}
