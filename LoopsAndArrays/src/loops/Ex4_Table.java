package loops;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */
import java.util.Scanner;

public class Ex4_Table {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int operator = 0;

        do {
            System.out.print("Digite o operador da tabuada que deseja visualizar: ");
            operator = scan.nextInt();
            
            if(operator < 0 || operator > 10) System.out.println("Digite um número entre 1 e 10");
            
        }while(operator < 0 || operator > 10);
        
        for(int i = 0; i <= 10; i++){
            int result = operator * i;
            System.out.printf("%d x %d = %d\n", operator, i, result);
        }                
    }
}
