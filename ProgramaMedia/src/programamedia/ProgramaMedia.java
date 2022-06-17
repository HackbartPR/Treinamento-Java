package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Primeira nota: ");
        float num1 = input.nextFloat();
        System.out.print("Segunda nota: ");
        float num2 = input.nextFloat();
        float result = (num1 + num2) / 2;
        
        System.out.println("A média foi: " + result);
        
        if(result > 9){
            System.out.println("Parabéns");
        }
        
    }
    
}
