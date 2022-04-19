public class multiplos {
    public static void main(String[] args) {

        int num = 1;
        int soma = 1;
        for (int i = num; i <= 1000; i++){
            if ((i % 3 == 0) || (i % 5 == 0)){
                System.out.println( i );
                soma = soma + i;
            }
            

            
        }
        System.out.println("Soma dos múltiplos: " + soma);
        
    }
    
}
