import java.util.Scanner;
public class Uri1017{
    public static void main(String args []){;
    Scanner teclado = new Scanner(System.in);
    float horas, velocidade, consumo, x;  // km/h
    consumo = 12; //km/l


    horas = teclado.nextFloat();
    velocidade = teclado.nextFloat();

    x = (velocidade / consumo) * horas;    
   
    System.out.printf("%.3f\n",x);
    
    }


}