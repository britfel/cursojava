import java.util.Scanner;
public class Uri1012{
    public static void main(String args []){;
    Scanner teclado = new Scanner(System.in);
    double A, B, C, Triangulo, raio, pi, Trapezio, Quadrado, RETANGULO;

    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();
    pi = 3.14159;

    Triangulo = (A * C)/2;
    raio = pi * (C * C);
    Trapezio = ((A + B) * C)/2;
    Quadrado = B * B;
    RETANGULO = A * B;

   
    System.out.printf("TRIANGULO : %.3f\n",+Triangulo);
    System.out.printf("CIRCULO : %.3f\n",+raio);
    System.out.printf("TRAPEZIO : %.3f\n",+Trapezio);
    System.out.printf("QUADRADO : %.3f\n",+Quadrado);
    System.out.printf("RETANGULO : %.3f\n",+RETANGULO);
    }


}