import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
     

        int valor,numero, cont;
        valor = teclado.nextInt();
        cont = 0;

        for (cont =2; cont <= valor; cont= cont + 2){
           System.out.println(cont+"^2 = "+(cont*cont));
        }
  
               
    }
}