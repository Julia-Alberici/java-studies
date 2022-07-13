package sobrecargas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d, 7d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(8, 5, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);

        double areaLozangulo = Quadrilatero.area(5f, 7f);
        System.out.println("Área do lozangulo: " + areaLozangulo);


    }
}
