import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    int valor, N, cont, Num;
    N = teclado.nextInt();
    
    cont= 0;
    valor= 1;
    Num=0;
    

    for (cont=0; cont < N; cont= cont + 1){
       
        System.out.print((valor)+" ");  
        System.out.print((valor +1)+" ");  
        System.out.print((valor +2)+" ");  
        System.out.println(" PUM");  
        valor = valor + 4;
       
        }
    }
}