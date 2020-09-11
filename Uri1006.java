import java.util.Scanner;
public class Uri1006{
    public static void main(String args []){;
    Scanner teclado = new Scanner(System.in);
    double A, B, C, MEDIA, notaB, notaA, notaC;

    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();

    notaA = A * 0.2;
    notaB = B * 0.3;
    notaC = C * 0.5;

    MEDIA = (notaA + notaB + notaC);
    System.out.printf("MEDIA = %.1f\n",+MEDIA);
    }


}