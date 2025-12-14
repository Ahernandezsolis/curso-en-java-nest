// cambio de peso a dolar//
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        double pesos,resultado=0;
        double dolares=19.18;
        System.out.println("MONEDA MEXICANA");
        pesos =leer.nextInt();
        resultado = pesos / dolares;
        System.out.println("costo del dolar" + resultado);



    }
}
