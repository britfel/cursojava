import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int area, diagonal1, diagonal2;

        System.out.println("Digite o valor da primeira diagonal");
        diagonal1 = teclado.nextInt();

        System.out.println("Digite o valor da segunda diagonal");
        diagonal2 = teclado.nextInt();

        area = diagonal1 * diagonal2;

        System.out.println("A area do losango sera de "+area);
    }
}