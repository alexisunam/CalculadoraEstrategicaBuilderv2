package operaciones;

import interfaces.BuilderOperacion;
import interfaces.Operacion;

public class Division implements Operacion {

    private Division(){

    }
    @Override
    public float ejecuta(float operando, float operando2) {
        return operando / operando2;
    }

    public static class Builder implements BuilderOperacion {
        private Division division;

        public Builder(){
            this.reset();
        }
        @Override
        public void reset() {
            this.division = new Division();
        }

        public Division Build(){
            Division build = this.division;
            this.reset();
            return build;
        }
    }
}
