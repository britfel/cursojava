import java.util.Scanner;
public class Uri1047{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int horaini, minutini, a, horafim, minutfim, b, totini, totfim, result, duracao, duracaomin, ajuste; 

        horaini = teclado.nextInt();
        minutini = teclado.nextInt();
        horafim = teclado.nextInt();
        minutfim = teclado.nextInt();

        a = horaini * 60;
        b = horafim * 60;
        totini = a + minutini;
        totfim = b + minutfim;


        if (totfim > totini){
            result = totfim - totini;
            duracao = result / 60;
            duracaomin = result - (duracao * 60);
            System.out.print("O JOGO DUROU "+duracao);
            System.out.print(" HORA(S)");
            System.out.print(" E "+duracaomin);
            System.out.println(" MINUTO(S)");
        }
        else if (totfim <= totini){
            ajuste = totfim + 1440;
            result = ajuste - totini;
            duracao = result / 60;
            duracaomin = result - (duracao * 60);
            System.out.print("O JOGO DUROU "+duracao);
            System.out.print(" HORA(S)");
            System.out.print(" E "+duracaomin);
            System.out.println(" MINUTO(S)");
        }
    }
}    