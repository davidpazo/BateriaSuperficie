package superficies;

import java.util.Scanner;

/**
 *
 * @author dpazolopez
 */
public class Vista {

    private static Scanner sc;

    public Vista() {

    }
    public void Introducir(Modelo mod) {

        sc = new Scanner(System.in);

        System.out.println("De que objeto quieres calcular el area??-> Cuadrado, Circulo, Triangulo, Rectangulo");
        mod.shapeType = sc.nextLine();
        System.out.println("Has elegido: " + mod.shapeType);

    }
    //nos da el area de nuestra figura
    public void impr(float area) {
        System.out.println("El area de tu figura es: " + area);
    }
    //pedimos area del cuadrado
    public void Cuadrado(Modelo mod) {
        System.out.println("Cual es el tamaño del lado?");
        mod.setHeight(sc.nextFloat());
    }
    //pedimos area del rectangulo
    public void Rectangulo(Modelo mod) {
        System.out.println("Cual es la base del rectangulo?");
        mod.setBaseLength(sc.nextFloat());
        System.out.println("Cual es la altura del rectangulo?");
        mod.setHeight(sc.nextFloat());
    }
    //pedimos datos del triangulo
    public void Triangulo(Modelo mod) {
        System.out.println("Cual es la base del triangulo?");
        mod.setBaseLength(sc.nextFloat());
        System.out.println("Cual es la altura del triangulo?");
        mod.setHeight(sc.nextFloat());
    }
    //pedimos datos del circulo
    public void Circulo(Modelo mod) {
        System.out.println("Cual es el radio del circulo?");
        mod.setRadius(sc.nextFloat());
    }

}