import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){

        int  cont=0, cont2=0;
        float valor;
        Scanner teclado= new Scanner(System.in);
        
               

        do {
            valor =  teclado.nextFloat();
            cont = cont + 1;
            if (valor > 0 ){
                cont2 = cont2 + 1; 
            }
           
        } while (cont < 6);
        System.out.println(cont2+" valores positivos");
    }
}