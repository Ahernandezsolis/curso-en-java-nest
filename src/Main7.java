//CALCULA EL PROMEDIO DE TRES NUMEROS ENTEROS//
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        int numero1,numero2,numero3,resultado;
        Scanner leer= new Scanner(System.in);
        System.out.println("INGRESA EL PRIMER NUMERO");
        numero1 =leer.nextInt();
        System.out.println("INGRESA EL SEGUNDO NUMERO");
        numero2 =leer.nextInt();
        System.out.println("INGRESA EL TERCER NUMERO ");
        numero3 = leer.nextInt();
        resultado = numero1 + numero2 + numero3 /3;
        System.out.println("RESULTADO \n"+ resultado);
    }
}
