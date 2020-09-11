import java.util.Scanner;
public class Uri1043{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        float a, b, c, ab, ac, bc, area, perimetro;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        ab = a + b;
        ac = a + c;
        bc = b + c;
        
        if ((ab > c) && (ac > b ) && (bc > a)){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        }  
          else{
            area =  ((a + b) * c) / 2;
            System.out.printf("Area =  %.1f\n",area);
        }

    }
}

