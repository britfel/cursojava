import java.util.Scanner;
public class Uri1157{
    public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
     

        int valorx, valory, cont, repet;
        
        cont = 0;
        repet = teclado.nextInt();
        valorx = teclado.nextInt();
        valory = teclado.nextInt();
      
            
        do {
            cont = cont + 1;
            if (valor % cont == 0){
                System.out.println(cont);
            }
        }     
                       
        while (cont <= valor);
       
                           
    }
}