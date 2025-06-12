package nascimento.thalles.src.entities;

public class ProblemaEstatico {
    public static final double pi = 3.14;

    public static double calculaCircum(double raio){
        return 2 * pi * raio;
    }

    public static double calculoVolume (double raio){
        return (4.0 / 3) * pi * Math.pow(raio, 3);
    }
}
