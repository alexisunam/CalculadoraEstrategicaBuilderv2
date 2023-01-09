package contexto;

import interfaces.BuilderCalculadora;
import interfaces.Operacion;
import operaciones.Division;
import operaciones.Multiplicacion;
import operaciones.Resta;
import operaciones.Suma;

public class Calculadora {
    private Operacion operacion;

    private Calculadora() {}

    public boolean isOperacionAritmetica() {
        return this.operacion != null;
    }

    public float ejecutaOperacion(int num1, int num2) {
        return operacion.ejecuta(num1, num2);
    }

    public static class Builder implements BuilderCalculadora {
        private Calculadora calculadora;

        public Builder(){
            calculadora = new Calculadora();

        }
        /**/
        public Builder setOperacionAritmetica(String operador) {
            switch (operador) {
                //case "+" -> calculadora.operacion = new Suma.Builder().Build();
                case "+" -> calculadora.operacion = new Suma();
                //case "-" -> calculadora.operacion = new Resta.Builder().Build();
                case "-" -> calculadora.operacion = new Resta();
                //case "x" -> calculadora.operacion = new Multiplicacion.Builder().Build();
                case "X" -> calculadora.operacion = new Multiplicacion();
                //case "/" -> calculadora.operacion = new Division.Builder().Build();
                case "/" -> calculadora.operacion = new Division();
                default -> calculadora.operacion = null;
            }
            return this;

        }

        public Calculadora build(){
            return calculadora;
        }
    }
}
