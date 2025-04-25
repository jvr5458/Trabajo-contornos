import java.util.Scanner;

public class Main {
	//este es un cambio realizado desde el repositorio local.
	//este es un cambio hecho desde la nueva rama.
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Temperatura te = new Temperatura();
        Peso pe = new Peso();
        Distancia di = new Distancia();
        
        System.out.println("Elige una opción:");
        System.out.println("1. Convertir kilómetros a millas");
        System.out.println("2. Convertir kilogramos a libras");
        System.out.println("3. Convertir Celsius a Fahrenheit");
        
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce la cantidad en kilómetros: ");
                double kilometros = scanner.nextDouble();
                double millas = di.kilometrosAMillas(kilometros);
                System.out.println(kilometros + " kilometros son " + millas + " millas.");
                break;
            case 2:
                System.out.print("Introduce la cantidad en kilogramos: ");
                double kilogramos = scanner.nextDouble();
                double libras = pe.kilogramosALibras(kilogramos);
                System.out.println(kilogramos + " kilogramos son " + libras + " libras.");
                break;
            case 3:
                System.out.print("Introduce la cantidad en Celsius: ");
                double Celsius = scanner.nextDouble();
                double Fahrentheit = te.celsiusAFahrenheit(Celsius);
                System.out.println(Celsius + "ºC son " + Fahrentheit + "ºF");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        scanner.close();
    }
}
