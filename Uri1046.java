import java.util.Scanner;
public class Uri1046{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int horaini, horafim, ajuste, duracao; 

        horaini = teclado.nextInt();
        horafim = teclado.nextInt();

        if (horafim > horaini){
            duracao = horafim - horaini;
            System.out.print("O JOGO DUROU "+duracao);
            System.out.println(" HORA(S)");
        }
        else if (horafim < horaini){
            ajuste = horafim + 24;
            duracao = ajuste - horaini;
            System.out.print("O JOGO DUROU "+duracao);
            System.out.println(" HORA(S)");
        }
        else if (horafim == horaini){
            ajuste = horafim + 24;
            duracao = ajuste - horaini;
            System.out.print("O JOGO DUROU "+duracao);
            System.out.println(" HORA(S)");
            //System.out.println("O JOGO DUROU ",duracao,"HORA (S)");
        }
    }
}        

        