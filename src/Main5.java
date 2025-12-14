//costo por minuto de una llamada//
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        double tiempo;
        double costo = 1.50, precio;

        System.out.println("TIEMPO DE LLAMADA");
        tiempo=leer.nextInt();
       precio=costo*tiempo;
       System.out.println("tarifa es :\n"+ "$" + precio);




    }
}
