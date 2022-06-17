
package arrays;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class Ex4_Matriz {
 
    public static void main(String[] args){
        Random random = new Random();
        
        int[][] table = new int[4][4];
        
        for(int row = 0; row < table.length; row++){
            
            for(int column = 0; column < table[row].length; column++){
                
                table[row][column] = random.nextInt(9);
                
            }                        
        }
        
        for(int row = 0; row < table.length; row++){
            
            for(int column = 0; column < table[row].length; column++){
                
                System.out.printf("Table[%d][%d]: %d\n", row, column, table[row][column]);
                
            }                        
        }
        
        
        
    }
}
