package estruturaderepeticao;

import java.util.Scanner;

public class Exec5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite 10 numeros: ");

        for (int i = 1; i <= 10; i++) {

            int a = sc.nextInt();
            soma += a;
        }

        System.out.println(soma);
    }
}
