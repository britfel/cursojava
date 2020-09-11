import java.util.Scanner;
public class Uri1008{
    public static void main(String args []){;
    Scanner teclado = new Scanner(System.in);
    int Num, hora;
    float Valhora, Salario;

    Num = teclado.nextInt ();
    hora = teclado.nextInt();
    Valhora = teclado.nextFloat();

     Salario = Valhora * hora;
    System.out.println("NUMBER = "+Num); 
    System.out.printf("SALARY = U$ %.2f\n",+Salario);
    }


}