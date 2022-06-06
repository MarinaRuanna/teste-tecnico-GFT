package desafios.questao1_telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelefoneEncriptado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a expressão: ");
        String expressao = scan.next();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            if( c == 'A' || c == 'B' || c == 'C') {
                System.out.print(2);
            } else if (c == 'D' || c == 'E' || c == 'F') {
                System.out.print(3);
            } else if (c == 'G' || c == 'H' || c == 'I') {
                System.out.print(4);
            }else if (c == 'J' || c == 'K' || c == 'L') {
                System.out.print(5);
            }else if (c == 'M' || c == 'N' || c == 'O') {
                System.out.print(6);
            }else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                System.out.print(7);
            }else if (c == 'T' || c == 'U' || c == 'V') {
                System.out.print(8);
            }else if (c == '0') {
                System.out.print(0);
            }else if (c == '1') {
                System.out.print(1);
            }else if (c == '-') {
                System.out.print('-');
            }
        }

    }
}
