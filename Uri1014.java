import java.util.Scanner;
public class Uri1014{
    public static void main(String args []){;
    Scanner teclado = new Scanner(System.in);
    int distancia;
    double combust, media;

    distancia = teclado.nextInt();
    combust = teclado.nextDouble();

    media = distancia / combust;


   
    System.out.printf("%.3f km/l\n",media);
    
    }


}