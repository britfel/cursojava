import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
     

        int valor,numero, cont;
        valor = teclado.nextInt();
        cont = 0;

       if (valor % 2 == 0 ){
            numero = valor + 1; 
            
            do {
            cont = cont + 1;
            numero = numero + 2; 
            System.out.println(numero);
                    
            } while (cont < 5);
       }
        else if (valor % 2 != 0){
            do {
            cont = cont + 1;
            valor = valor + 2; 
            System.out.println(valor);
            } while (cont < 5);
        }
    
               
    }
}