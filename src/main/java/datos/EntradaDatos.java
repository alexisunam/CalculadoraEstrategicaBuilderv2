package datos;

import java.util.Scanner;

public class EntradaDatos {
    public int numero, numero2;
    public String accion = "";
    public void leerDatos(){
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su opcion: ");
        this.accion = input.nextLine();


        System.out.print("\nIngrese el primer numero: ");
        this.numero = input.nextInt();

        System.out.print("\nIngrese el segundo numero: ");
        this.numero2 = input.nextInt();
        input.nextLine();

        System.out.println("");
    }

    public int getNumero() {
        return numero;
    }

    public int getNumero2() {
        return numero2;
    }

    public String getAccion() {
        return accion;
    }
}
