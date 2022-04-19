import java.util.Scanner;

public class PA {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Entre com o primeiro termo:");
        int a1 = obj.nextInt();
        System.out.println("Entre com o último termo:");
        int an = obj.nextInt();
        System.out.println("Entre com o número de termos:");
        int n = obj.nextInt();

        int soma = (n*(a1+an))/2;

        System.out.println("A soma dos "+ n + " primeiros termos dessa PA é "+ soma);

        obj.close();
        
    }
    
}
