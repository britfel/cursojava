import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario, imp, imp2, imp3 ;
        
        salario = teclado.nextDouble();
       
   

        if (salario <= 2000.00){
            System.out.println("Isento");
        }
        else if ((salario >= 2000.01) && (salario <= 3000.0)){
            imp = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f\n",imp);
        }
        else if ((salario >= 3000.01) && (salario <= 4500.0)){
            imp = (1000 * 0.08);
            imp2 = (((salario - 3000)) * 0.18) + imp;
            System.out.printf("R$ %.2f\n",imp2);
        }
        else if (salario >4500.0){
            imp = (1000 * 0.08);
            imp2 = (1500 * 0.18);
            imp3 = (((salario - 4500) * 0.28)) + imp + imp2;

            System.out.printf("R$ %.2f\n",imp3);
        }
        

    }
}