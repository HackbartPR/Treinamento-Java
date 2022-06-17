package arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String[] list = new String[6];        
        int amountConsonant = 0;                
        
        for(int i = 0; i <= 5; i++){
            System.out.printf("Digite o %dº caractere simples: ", (i+1));
            
            String currentLetter = scan.next();
            
            if(!(currentLetter.equalsIgnoreCase("a") || 
               currentLetter.equalsIgnoreCase("e") || 
               currentLetter.equalsIgnoreCase("i") || 
               currentLetter.equalsIgnoreCase("o") || 
               currentLetter.equalsIgnoreCase("u"))){
                
                amountConsonant++;
            }
            
            list[i] = currentLetter;
        }
        
        System.out.println("\nTodas as Consoantes: ");
        for (String letter : list) {
            
            if(!(letter.equalsIgnoreCase("a") || 
               letter.equalsIgnoreCase("e") || 
               letter.equalsIgnoreCase("i") || 
               letter.equalsIgnoreCase("o") || 
               letter.equalsIgnoreCase("u"))){
                
                System.out.print(letter + " ");
            }
        }
        
        System.out.printf("\nO array possui %d consoantes", amountConsonant);
    }
}
