package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
 */
public class Ex3_BiggerAndAverage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float bigger = 0;
        float average = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %d número: ", i);
            float currentNumber = scan.nextFloat();

            if (i == 1) {
                bigger = currentNumber;
            } else {
                
                if (bigger < currentNumber) bigger = currentNumber;                    
                
            }
            
            average += currentNumber;
        }
        
        average /= 5;
        
        System.out.println("O maior número digitado foi: " + bigger);
        System.out.printf("A média entre eles é %.2f: ", average);
    }
}
