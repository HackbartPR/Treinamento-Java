package ordenacaoset;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

/* Imprima:
Ordem Aleatoria;
Ordem de Inserção
Ordem Natural
Ordem Nome/Genero/TempoEpisodio*/

public class OrdenacaoSet {

    public static void main(String[] args) {
        Set<Serie> listSerie = new HashSet<>();        
        listSerie.add(new Serie("Got", "Fantasia", 60));
        listSerie.add(new Serie("Dark", "Drama", 60));
        listSerie.add(new Serie("That 70's show", "Comédia", 25));                
        
        System.out.println("\nImprima em ordem aleatoria:");
        System.out.println(listSerie);        
        
        Set<Serie> listSerie2 = new LinkedHashSet<>();
        listSerie2.add(new Serie("Got", "Fantasia", 60));
        listSerie2.add(new Serie("Dark", "Drama", 60));
        listSerie2.add(new Serie("That 70's show", "Comédia", 25));        
        
        System.out.println("\nImprima em ordem de inserção:");
        System.out.println(listSerie2);
        
        Set<Serie> listSerie3 = new TreeSet<>(listSerie2);
        System.out.println("\nImprima em ordem de inserção:");
        System.out.println(listSerie3);
        
        System.out.println("\nOrdem Nome/Genero/TempoEpisodio:");
        Set<Serie> listSerie4 = new TreeSet<>(new ComparatorFull());
        listSerie4.addAll(listSerie2);
        System.out.println(listSerie4);
        
        
    }
    
}
