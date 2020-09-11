import java.util.Scanner;
public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float raio, altura, volume, pi;

        System.out.println("Digite o raio do cilindro");
        raio = teclado.nextFloat();
        System.out.println("Digite a altura do cilindro");
        altura = teclado.nextFloat();
        pi = 3.14f;

        volume = raio * raio * pi * altura;

        System.out.println("O Volume vale = "+volume);

        System.out.printf("O Volume vale = %.2f\n",+volume);

    }
}