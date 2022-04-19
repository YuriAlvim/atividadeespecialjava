import java.util.Scanner;

public class Espaço {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Entre com a velocidade inicial:");
        int Vo = obj.nextInt();
        System.out.println("Entre com o espaço inicial:");
        int So = obj.nextInt();
        System.out.println("Entre com a aceleração:");
        int a = obj.nextInt();
        System.out.println("Entre com o instante/tempo:");
        int t = obj.nextInt();

        float S = So + (Vo*t) + ((a*(t*t))/2);

        System.out.println("O espaço percorrido foi de " + S + "metros");

        obj.close();
    }
}
