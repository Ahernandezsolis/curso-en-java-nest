//Calcular el 20% de cualquier valor dado.//
import java .util.Scanner;
public class Main8 {
    public static void main (String[]args){
        double dato,porcentage;
        Scanner leer= new Scanner(System.in);
        System.out.println("INGRESA UN BALOR");
        dato =leer.nextInt();
        porcentage = dato *.20;
                System.out.println("PROMEDIO"+ porcentage);



    }
}
