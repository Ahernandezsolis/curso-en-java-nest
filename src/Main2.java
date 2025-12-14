//multiplos de tres numeros e imprima tres resultados //

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int numero1, numero2, numero3, resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("NUMERO 1");
        numero1 = leer.nextInt();
        System.out.println("numero2");
        numero2 = leer.nextInt();
        System.out.println("numero3");
        numero3 = leer.nextInt();
        resultado = numero1 * numero2 * numero3;
        System.out.print("resultado \n :"  + resultado);
    }


}
