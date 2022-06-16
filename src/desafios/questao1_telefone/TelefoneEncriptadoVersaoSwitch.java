package desafios.questao1_telefone;

import java.util.Scanner;

public class TelefoneEncriptadoVersaoSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a expressão: ");
        String expressao = scan.next().toUpperCase();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            switch(c) {
                case'A': case 'B': case 'C':
                    System.out.print(2);
                    break;
                case 'D': case 'E': case 'F':
                    System.out.print(3);
                    break;
                case 'G': case 'H': case'I':
                    System.out.print(4);
                    break;
                case 'J': case 'K': case 'L':
                    System.out.print(5);
                    break;
                case 'M' : case 'N': case 'O':
                    System.out.print(6);
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    System.out.print(7);
                    break;
                case 'T': case 'U': case 'V':
                    System.out.print(8);
                case '0':
                    System.out.print(0);
                    break;
                case '1':
                    System.out.print(1);
                    break;
                case '-':
                    System.out.print('-');
                    break;
                default:
                    System.out.print("");
            }
        }
    }
}
