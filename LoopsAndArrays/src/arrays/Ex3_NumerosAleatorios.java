
package arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {
    
    public static void main(String[] args){
        Random random = new Random();
        
        int[] list = new int[20];
        
        for(int i = 0; i < list.length; i++){
            int randomNumber = random.nextInt(100);
            
            list[i] = randomNumber;
        }
        
        System.out.println("Números gerados:");
        for(int i = 0; i < list.length; i++){
            System.out.printf("List[%d] = %d\n", i, list[i]);                    
        }
        
        System.out.println("\nSeus Sucessores:");
        for(int i = 0; i < list.length; i++){
            int nextNumber = list[i]+1;
            System.out.printf("List[%d] = %d\n", i, nextNumber);                    
        }
        
    }
    
}
