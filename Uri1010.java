import java.util.Scanner;
public class Uri1010{
    public static void main(String args []){;
    Scanner teclado = new Scanner(System.in);
    int Codpeca1, Codpeca2, Qtdepeca1, Qtdepeca2;
    float Valpeca1, Valpeca2, tot1, tot2, total;

    Codpeca1 = teclado.nextInt ();
    Qtdepeca1 = teclado.nextInt();
    Valpeca1 = teclado.nextFloat();
    Codpeca2 = teclado.nextInt ();
    Qtdepeca2 = teclado.nextInt();
    Valpeca2 = teclado.nextFloat();

    tot1 = Qtdepeca1 * Valpeca1;
    tot2 = Qtdepeca2 * Valpeca2;
    total = tot1 + tot2;    
         
    
    System.out.printf("VALOR A PAGAR: R$ %.2f\n",+total);
    }


}