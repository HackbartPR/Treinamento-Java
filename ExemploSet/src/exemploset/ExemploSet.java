/*Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça: 
  Criei um conjunto e adicione as notas = OK
  Confira se a nota 5.0 está no conjunto = OK
  Exiba a menor nota = OK
  Exiba a maior nota = OK
  Exiba a soma dos valores = OK
  Exiba a média das notas = OK
  Remova a nota 0 = OK
  Remova as notas menores que 7 e exiba a lista = OK
  Exiba todas as notas na ordem em que foram informados (LinkedHasSet)= OK
  Exiba todas as notas na ordem crescente (TreeSet);
  Apague todos os conjuntos;
  Confira se todos os conjuntos estão vazios;

 */
package exemploset;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
//import java.util.Arrays;

public class ExemploSet {

    public static void main(String[] args) {

        //Set<Double> notas = new HashSet<>(Arrays.asList(7f, 8.5f, 9.3f, 5f, 7f, 0f, 3.6f));        
        Set<Double> notas = new HashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println("\nCriei um conjunto e adicione as notas: ");
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está no conjunto: ");
        System.out.println(notas);
        System.out.printf(notas.contains(5d) ? "Sim\n" : "Não\n");

        System.out.println("\nExiba a menor nota: ");
        System.out.println(notas);
        System.out.println(Collections.min(notas));

        System.out.println("\nExiba a maior nota: ");
        System.out.println(notas);
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        System.out.println(notas);
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            double currentNumber = iterator.next();
            soma += currentNumber;
        }
        System.out.printf("%.2f\n", soma);

        System.out.println("\nExiba a média das notas: ");
        System.out.println(notas);
        double media = soma / notas.size();
        System.out.printf("%.2f\n", media);
        
        System.out.println("\nRemova a nota 0: ");
        System.out.println(notas);
        notas.remove(0d);
        System.out.println(notas);
        
        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        System.out.println(notas);
        Iterator<Double> iterator2 = notas.iterator();        
        while(iterator2.hasNext()){
            double currentNumber = iterator2.next();
            if(currentNumber < 7d) iterator2.remove();
        }
        System.out.println(notas);
        
        System.out.println("\nExiba todas as notas na ordem em que foram informados (LinkedHasSet): ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        
        System.out.println("\nExiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        
        System.out.println("\nApague todo o conjunto: ");
        notas.clear();
        System.out.println(notas);
        
        System.out.println("\nConfira se o conjunto está vazio: ");
        System.out.printf(notas.isEmpty() ? "Está vazio\n" : "Não está vazio\n");
    }

}
