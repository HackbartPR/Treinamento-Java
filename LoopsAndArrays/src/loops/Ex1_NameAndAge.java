package loops;

/*
 * FAÇA UM PROGRAMA QUE LEIA CONJUNTO DE DOIS VALORES,
 * O PRIMEIRO REPRESENTANDO O NOME DO ALUNO E O SEGUNDO REPRESENTANDO SUA IDADE
 * PARA FINALIZAR O PROGRAMA, DIGITE O VALOR 0 NO NOME
 */
import java.util.Scanner;

public class Ex1_NameAndAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        do {
            System.out.print("Digite um nome: ");
            name = scan.next();

            if (!name.equals("0")) {
                System.out.print("Digite a idade do " + name + ": ");
                age = scan.nextInt();
            }

        } while (!name.equals("0"));
    }
}
