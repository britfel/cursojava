import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        int opcao, Alcool, Gasolina, Diesel;
        Scanner teclado= new Scanner(System.in);
        Alcool = 0;
        Gasolina = 0;
        Diesel = 0;
    
        do{
           // System.out.println("Digite 1 Alcool / 2 Gasolina / 3 Diesel / 4 Fim");
            opcao = teclado.nextInt();
            if (opcao ==1) {
                Alcool = Alcool + 1;
            }
            else if (opcao == 2){
                Gasolina = Gasolina + 1;                
            }
            else if (opcao == 3){
                Diesel = Diesel + 1;
            }
            else if (opcao == 4){
                
            }
        } while (opcao != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+Alcool);
        System.out.println("Gasolina: "+Gasolina);
        System.out.println("Diesel: "+Diesel);
    }
}