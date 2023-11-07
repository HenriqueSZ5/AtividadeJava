
package estruturaderepeticao;

import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        String nome;
        
        System.out.println("Digite a quantidade: ");
            num = sc.nextInt();
            
        System.out.println("Digite um nome: ");
            nome = sc.next();
        
        for(int i = 1; i < num; i++){
            System.out.println(nome);
        }
    }
    
}
