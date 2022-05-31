package desafios.questao2_triangulos;
import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o lado 1 do triangulo: ");
        int lado1 = scan.nextInt();
        System.out.println("Informe o lado 2 do triangulo: ");
        int lado2 = scan.nextInt();
        System.out.println("Informe o lado 3 do triangulo: ");
        int lado3 = scan.nextInt();


        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Valor do lado invalido");
            System.exit(2);
        }

        if (lado1 >= lado2 + lado3 || lado2 >= lado3 + lado1 || lado3 >= lado1 + lado2) {
            System.out.println("Triangulo inexistente.");
            System.exit(3);
        }

        if (lado1 == lado2 && lado2 == lado3)
            System.out.println("Triangulo equilatero.");

        else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1)
            System.out.println("Triangulo isosceles.");

        else
            System.out.println("Triangulo escaleno.");
        System.exit(0);

    }
}
