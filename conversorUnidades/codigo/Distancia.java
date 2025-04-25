package conversorUnidades.codigo;

public class Distancia {
    public static double kilometrosAMillas(double km) {
        return km * 0.621371;
    }

    public static double millasAKilometros(double millas) {
        return millas / 0.621371;
    }
}
