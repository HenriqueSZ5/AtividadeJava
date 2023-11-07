

package estruturaderepeticao;
import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        
        System.out.println("Digite seu nome");
            nome = sc.next();
            
        for(int i = 1; i <= 10; i++){
            System.out.println(nome);
        }
        
        
    }
    
}
