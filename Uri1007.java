import java.util.Scanner;
public class Uri1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int Diferenca, A, B, C, D, DifAB, DifCD;
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        DifAB = A * B;
        DifCD = C * D;
        Diferenca = DifAB - DifCD;

        System.out.println("DIFERENCA = "+Diferenca);



    }
}