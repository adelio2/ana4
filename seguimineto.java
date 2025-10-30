import java.util.Scanner;

public class seguimineto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println(" digite numero " );
            int numero=scanner.nextInt();
      
            
    
            numero=(numero%100000);
            System.out.println(numero);
            numero=numero%10000;
            System.out.println(numero);
            numero=numero%1000;
            System.out.println(numero);
            numero=numero%100;
            System.out.println(numero);
            numero=numero%10;
            System.out.println(numero);
            numero=numero%5;
        }

       
        
        
 }


   
}
