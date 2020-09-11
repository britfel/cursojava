import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int area, base, altura;

        System.out.println("Por favor, digite o valor da base");
        base = teclado.nextInt();
        
        System.out.println("Por favor, digite o valor da altura");
        altura = teclado.nextInt();

        area = base * altura;

        System.out.println("A area do retangulo vale "+area);

    }
}




