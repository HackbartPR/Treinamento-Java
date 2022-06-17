package loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float grade;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            grade = scan.nextFloat();

        } while (grade < 0 || grade > 10);
    }
}
