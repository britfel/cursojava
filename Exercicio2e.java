import java.util.Scanner;

public class Exercicio2e{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int basemenor, basemaior, altura, area;

        System.out.println("Digite o valor da menor base");
        basemenor = teclado.nextInt();

        System.out.println("Digite o valor da maior base");
        basemaior = teclado.nextInt();

        System.out.println("Digite o valor da altura");
        altura = teclado.nextInt();

        area = ((basemaior + basemenor) * altura) / 2;

        System.out.println("A area do trapezio sera de "+area);



    }
    

}