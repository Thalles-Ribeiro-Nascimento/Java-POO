package nascimento.thalles.src.util;

public class ProblemaEstatico {
    public static final double PI = 3.14;

    public static double calculaCircum(double raio){
        return 2 * PI * raio;
    }

    public static double calculoVolume (double raio){
        return (4.0 / 3) * PI * Math.pow(raio, 3);
    }
}
