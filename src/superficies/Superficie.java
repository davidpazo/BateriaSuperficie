package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian editado por dpazolopez ;)
 */
public class Superficie {

    private static Scanner sc;

    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista obj = new Vista();
        obj.Introducir(mod);
        if (mod.getShapeType().equalsIgnoreCase("Cuadrado")) {
            mod.squareArea = calcuCuad(mod.getHeight());
        }
        if (mod.getShapeType().equalsIgnoreCase("Rectangulo")) {
            mod.rectangleArea = calcuRectang(mod.getBaseLength(), mod.getHeight());
        }
        if (mod.getShapeType().equalsIgnoreCase("Triangulo")) {
            mod.triangleArea = calcuTrian(mod.getBaseLength(), mod.getHeight());
        }
        if (mod.getShapeType().equalsIgnoreCase("Circulo")) {
            mod.circleArea = calcuCirc(mod.getRadius());

        }
    }

    public static float calcuCuad(float lado) {

        float supe;
        supe = ((float) (lado * lado));
        return supe;
    }

    public static float calcuRectang(float base, float altura) {
        float superf;
        superf = ((float) base * altura);
        return superf;
    }

    public static float calcuTrian(float base, float altura) {

        float superfi;
        superfi = ((float) 0.5 * base * altura);
        return superfi;
    }

    public static float calcuCirc(float radio) {

        float sup;
        sup = ((float) 3.14 * (radio * 2));
        return sup;
    }
}
