import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Entre com o valor inicial: ");
        int num = obj.nextInt();
        int fator = 1;
        

        for (int i = num; i >= 1; i--) {
            fator = fator * i;
            
        }
        System.out.println("Fatorial: " + fator);

        obj.close();

        
    }
    
}
