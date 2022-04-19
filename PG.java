import java.util.Scanner;

public class PG {
    public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
    
            System.out.println("Entre com o primeiro termo:");
            int a1 = obj.nextInt();
            System.out.println("Entre com uma razão maior ou igual a 2:");
            int q = obj.nextInt();
            System.out.println("Entre com o número de termos:");
            int n = obj.nextInt();
    
            if (q < 2){
                System.out.println("A razão é muito pequena, ela deve ser maior ou igual a 2");
            }
            else{
                double soma = (a1*(Math.pow (q, n)-1))/(q-1);
    
            System.out.println("A soma dos "+ n + " primeiros termos dessa PG é "+ soma);
            }
    
            obj.close();
            
        }
}
