import java.util.Scanner;
public class Uri1041{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        float eixox, eixoy;
        int X, Y;

        X = 0;
        Y = 0;

        eixox = teclado.nextFloat();
        eixoy = teclado.nextFloat();

        if ((eixox == X) && (eixoy == Y)){
            System.out.println("Origem");
        }
        else if ((eixox > 0) && (eixoy > 0)){
            System.out.println("Q1");
        }
        else if ((eixox < 0) && (eixoy > 0)){
            System.out.println("Q2");
        }
        else if ((eixox < 0) && (eixoy < 0)){
            System.out.println("Q3");
        }
        else if ((eixox > 0) && (eixoy < 0)){
            System.out.println("Q4");
        }
        else if ((eixox == 0)){
            System.out.println("Eixo Y");
        }
        else if ((eixoy == 0)){
            System.out.println("Eixo X");
        }
        
    }
}    