package prueba;

import contexto.Calculadora;
import contexto.Menu;
import datos.EntradaDatos;

public class TestCalculadora {
    public static void main(String[] args) {
        float resultado = 0.1F;
        Menu menu = new Menu();
        EntradaDatos in = new EntradaDatos();

        menu.imprimirOpciones();
        in.leerDatos();
        Calculadora calculadora = new Calculadora.Builder()
                .setOperacionAritmetica(in.accion)
                .build();

        if (calculadora.isOperacionAritmetica()){
            resultado = calculadora.ejecutaOperacion(in.numero, in.numero2);
            System.out.println(resultado);
        } else {
            System.out.println("No se reconoce la accion, ingrese + (suma), - (resta)," +
                    " x (multiplicacion) o / (division)");
        }



        System.out.println();
    }
}
