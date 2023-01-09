package operaciones;

import interfaces.BuilderOperacion;
import interfaces.Operacion;

public class Multiplicacion implements Operacion {

    private Multiplicacion(){

    }
    @Override
    public float ejecuta(float operando, float operando2) {
        return operando * operando2;
    }

    public static class Builder implements BuilderOperacion {
        private Multiplicacion multiplicacion;

        public Builder(){
            this.reset();
        }
        @Override
        public void reset() {
            this.multiplicacion = new Multiplicacion();
        }

        public Multiplicacion Build(){
            Multiplicacion build = this.multiplicacion;
            this.reset();
            return build;
        }
    }
}
