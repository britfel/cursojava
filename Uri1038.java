import java.util.Scanner;
public class Uri1038{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int A, qtde;
        double Cachorro, Salada, Bacon, Torrada, Refrigerante, Valor;
        A = teclado.nextInt();
        qtde = teclado.nextInt();
    
        Cachorro = 4.00; // Cod 1
        Salada = 4.50;  // Cod 2
        Bacon = 5.00;   // Cod 3 
        Torrada = 2.00;  // Cod 4
        Refrigerante = 1.50;  // Cod 5

        if (A == 1){
            Valor = qtde * Cachorro;
            System.out.printf("TOTAL: R$ %.2f\n",Valor);
        }    
        else if (A == 2){
            Valor = qtde * Salada;
            System.out.printf("TOTAL: R$ %.2f\n",Valor);
        }
        else if (A == 3){
            Valor = qtde * Bacon;
            System.out.printf("TOTAL: R$ %.2f\n",Valor);
        }
        else if (A == 4){
            Valor = qtde * Torrada;
            System.out.printf("TOTAL: R$ %.2f\n",Valor);
        }
        else if (A == 5){
            Valor = qtde * Refrigerante;
            System.out.printf("TOTAL: R$ %.2f\n",Valor);
        }
        else if ((A < 1) || (A > 5)){
            System.out.println("Pedido Invalido");
        }
    }

}

