import java.util.Scanner;
public class Uri1005{
    public static void main(String args []){;
    Scanner teclado = new Scanner(System.in);
    double A, B, MEDIA, notaB, notaA;

    A = teclado.nextDouble();
    B = teclado.nextDouble();

    notaA = A * 3.5;
    notaB = B * 7.5;

    MEDIA = (notaA + notaB)/11;
    System.out.printf("MEDIA = %.5f\n",+MEDIA);
    }


}