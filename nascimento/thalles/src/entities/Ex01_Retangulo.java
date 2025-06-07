package nascimento.thalles.src.entities;

/*
Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.

Área: A = b * h, onde 'b' é a base e 'h' é a altura do retângulo.
Perímetro: P = 2 * (b + h).
Diagonal: d = √(b² + h²), onde 'b' é a base e 'h' é a altura, utilizando o teorema de Pitágoras.
* */

public class Ex01_Retangulo {
    private double height;
    private double width;
    private double a;
    private double p;
    private double d;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double areaRetangle(){
        this.a = this.height * this.width;
        return this.a;
    }

    public double perimeterRetangle(){
        this.p = 2 * (this.width + this.height);
        return this.p;
    }

    public double diagonalRetangle(){
        this.d = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
        return this.d;
    }

    public String toString(){
        return String.format(
                "Base: %.2f%n" +
                "Altura: %.2f%n",
                this.getWidth(),
                this.getHeight());
    }
}
