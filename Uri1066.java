import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
     

        int valor, cont, cont2, cont3, cont4, cont5;
        cont = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        
        do {
            valor = teclado.nextInt();
            cont = cont + 1;
            
            if (valor % 2 == 0 ){
                cont2 = cont2 + 1; 
            }
            else {
                cont3 = cont3 + 1;
            }
            if (valor > 0){
                cont4 = cont4 + 1;
            }
            else if (valor < 0){
                cont5 = cont5 + 1;
            }

           
        } while (cont < 5);
    
        System.out.println(cont2+" valor(es) par(es)");
        System.out.println(cont3+" valor(es) impar(es)");
        System.out.println(cont4+" valor(es) positivo(s)");
        System.out.println(cont5+" valor(es) negativo(s)");
        
    }
}