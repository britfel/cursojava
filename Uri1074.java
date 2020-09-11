import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int valor, N, cont;
    N = teclado.nextInt();
    
    cont= 0;
    

    for (cont=0; cont < N; cont= cont + 1){
        valor = teclado.nextInt();     
        if (valor == 0){
            System.out.println("NULL");
        }     
        else if (valor % 2 == 0 ){
            if (valor > 0){
                System.out.println("EVEN POSITIVE");
            }
            else if (valor < 0){
                System.out.println("EVEN NEGATIVE");
            }
        }
        else if (valor % 2 != 0 ){
            if (valor > 0){
                System.out.println("ODD POSITIVE");
            }
            else if (valor < 0){
                System.out.println("ODD NEGATIVE");
            }
      
        
        }
    }
    }
}        
      
