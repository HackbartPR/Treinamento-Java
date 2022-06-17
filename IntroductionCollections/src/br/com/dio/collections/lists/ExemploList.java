package br.com.dio.collections.lists;

// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

/*
    Crie uma lista e adicione as sete notas - FEITO
    Exiba a posição da nota 5.0 - FEITO
    Adicione na lista a nota 8.0 na posição 4 - FEITO
    Substitua a nota 5.0 pela nota 6.0 - FEITO
    Confira se a nota 5.0 está na lista - FEITO
    Exiba a terceira nota adicionada - FEITO
    Exiba a menor nota - FEITO
    Exiba a maior nota - FEITO
    Exiba a soma dos valores - FEITO
    Exiba a média das notas - FEITO
    Remova a nota 0 - FEITO
    Remova a nota da posição 0 - FEITO
    Remova as notas menores que 7 e exiba a lista - FEITO
    Apague toda a lista - FEITO
    Confira se a lista está vazia - FEITO
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {

    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione 7 notas: ");
        List<Float> listaNotas = new ArrayList<>();
        listaNotas.add(7f);
        listaNotas.add(8.5f);
        listaNotas.add(9.3f);
        listaNotas.add(5f);
        listaNotas.add(7f);
        listaNotas.add(0f);
        listaNotas.add(3.6f);
        System.out.println(listaNotas);

        System.out.println("\nExiba a posição da nota 5.0: ");
        System.out.println(listaNotas);
        System.out.println(listaNotas.indexOf(5f));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        System.out.println(listaNotas);
        listaNotas.add(4, 8f);
        System.out.println(listaNotas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        System.out.println(listaNotas);
        listaNotas.set(3, 6f);
        System.out.println(listaNotas);

        System.out.println("\nConfira se a nota 5.0 está na lista: ");
        System.out.println(listaNotas);
        System.out.println(listaNotas.contains(5f));

        System.out.println("\nExiba a terceira nota adicionada: ");
        System.out.println(listaNotas);
        System.out.println(listaNotas.get(2));

        System.out.println("\nExiba a menor nota: ");
        System.out.println(listaNotas);
        System.out.println(Collections.min(listaNotas));

        System.out.println("\nExiba a maior nota: ");
        System.out.println(listaNotas);
        System.out.println(Collections.max(listaNotas));

        System.out.println("\nExiba a soma dos valores: ");
        System.out.println(listaNotas);
        Iterator<Float> iterator = listaNotas.iterator();
        float soma = 0f;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.printf("%.2f\n", soma);

        System.out.println("\nExiba a média das notas: ");
        System.out.println(listaNotas);
        float media = soma / listaNotas.size();
        System.out.printf("%.2f\n", media);

        System.out.println("\nRemova a nota 0: ");
        System.out.println(listaNotas);
        listaNotas.remove(0f);
        System.out.println(listaNotas);

        System.out.println("\nRemova a nota da posição 0: ");
        System.out.println(listaNotas);
        listaNotas.remove(0);
        System.out.println(listaNotas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        System.out.println(listaNotas);
        Iterator<Float> iterator2 = listaNotas.iterator();
        while (iterator2.hasNext()) {
            Float next = iterator2.next();
            if (next < 7) {
                iterator2.remove();
            }
        }
        System.out.println(listaNotas);

        System.out.println("\nApague toda a lista: ");
        System.out.println(listaNotas);
        listaNotas.clear();
        System.out.println(listaNotas);
        
        System.out.println("\nConfira se a lista está vazia: ");
        System.out.println(listaNotas);
        System.out.println(listaNotas.isEmpty());
        
    }
}
