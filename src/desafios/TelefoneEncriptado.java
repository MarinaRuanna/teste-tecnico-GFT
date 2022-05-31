package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelefoneEncriptado {
    public static void telefoneEncriptado() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a expressão: ");
        String expressao = scan.next();
        List<Character> letras = new ArrayList<>();


        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            if( c == 'A' || c == 'B' || c == 'C') {
                System.out.println(2);
            } else if (c == 'D' || c == 'E' || c == 'F') {
                System.out.println(3);
            } else if (c == 'G' || c == 'H' || c == 'I') {
                System.out.println(4);
            }else if (c == 'J' || c == 'K' || c == 'L') {
                System.out.println(5);
            }else if (c == 'M' || c == 'N' || c == 'O') {
                System.out.println(6);
            }else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                System.out.println(7);
            }else if (c == 'T' || c == 'U' || c == 'V') {
                System.out.println(8);
            }else if (c == 0) {
                System.out.println(0);
            }else if (c == 1) {
                System.out.println(0);
            }else if (c == '-') {
                System.out.println('-');
            } else {

            }
        }

    }
}
