package nascimento.thalles.src.application;

import nascimento.thalles.src.entities.ProblemaEstatico;

import java.util.Locale;
import java.util.Scanner;

public class MainProblemaEstatico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio: ");
        double raio = sc.nextDouble();

        System.out.printf("Raio: %.2f%n" +
                "Circunferência: %.2f%n" +
                "Volume: %.2f%n" +
                "PI: %.2f",
                raio,
                ProblemaEstatico.calculaCircum(raio),
                ProblemaEstatico.calculoVolume(raio),
                ProblemaEstatico.pi
        );


        sc.close();
    }

}
