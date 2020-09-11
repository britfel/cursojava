import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
     

        int valor, cont, cont2;
        cont = 0;
        cont2 = 0;
        
        do {
            valor = teclado.nextInt();
            cont = cont + 1;
            
            if (valor % 2 == 0 ){
                cont2 = cont2 + 1; 
            }
           
        } while (cont < 5);
    
        System.out.println(cont2+" valores pares");
        
    }
}