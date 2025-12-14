//el area de un  triangulo

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int area, base = 0, altura = 0;
        // nuevo cambio de prueba
        Scanner leer = new Scanner(System.in);
        System.out.println("altura");
        altura = leer.nextInt();
        System.out.println("base");
        base = leer.nextInt();
        area = base * altura / 2;
        System.out.println("resultado  \n:" + area);


    }

}
