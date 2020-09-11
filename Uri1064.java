import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){

        int  cont=0, cont2=0;
        float valor, media, result;
        Scanner teclado= new Scanner(System.in);
        
        media = 0;
               

        do {
            valor =  teclado.nextFloat();
            cont = cont + 1;
            
            if (valor > 0 ){
                cont2 = cont2 + 1; 
                media = (valor + media);
            }
           
        } while (cont < 6);
        result = media/cont2;
        System.out.println(cont2+" valores positivos");
        System.out.printf("%.1f\n",result);
    }
}