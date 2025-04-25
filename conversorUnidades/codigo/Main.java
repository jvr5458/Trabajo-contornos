import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elige una opción:");
        System.out.println("1. Convertir metros a kilómetros");
        System.out.println("2. Convertir gramos a kilogramos");
        System.out.println("3. Convertir libras a kilogramos");
        
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce la cantidad en metros: ");
                double metros = scanner.nextDouble();
                double kilometros = ConversorDistancia.convertirMetrosAKilometros(metros);
                System.out.println(metros + " metros son " + kilometros + " kilómetros.");
                break;
            case 2:
                System.out.print("Introduce la cantidad en gramos: ");
                double gramos = scanner.nextDouble();
                double kilogramos = ConversorPeso.convertirGramosAKilogramos(gramos);
                System.out.println(gramos + " gramos son " + kilogramos + " kilogramos.");
                break;
            case 3:
                System.out.print("Introduce la cantidad en libras: ");
                double libras = scanner.nextDouble();
                double kilogramosLibras = ConversorPeso.convertirLibrasAKilogramos(libras);
                System.out.println(libras + " libras son " + kilogramosLibras + " kilogramos.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        scanner.close();
    }
}
