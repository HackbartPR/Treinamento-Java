
package loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex5_Factorial {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int result = 1;
        
        System.out.print("Digite um número inteiro para encontrar seu fatorial: ");
        int operator = scan.nextInt();
        
        for(int i = operator; i >= 1; i--){
            result *= i;
        }
        
        System.out.printf("O fatorial de %d é: %d\n", operator, result);
    }
}
