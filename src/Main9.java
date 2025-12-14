import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado = 0;

        // for correcto SIN punto y coma
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa calificación " + (i + 1) + ": ");
            resultado += leer.nextInt();
        }

        int promedio = resultado / 5;
        double veintePorciento = promedio * 0.20;

        System.out.printf("Promedio: %d\n", promedio);
        System.out.printf("20%% del promedio: %.2f\n", veintePorciento);
    }
}
