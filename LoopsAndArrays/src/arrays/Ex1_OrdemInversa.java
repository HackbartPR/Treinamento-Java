
package arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
  
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};       
        
        for(int i = array.length -1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
    
}
