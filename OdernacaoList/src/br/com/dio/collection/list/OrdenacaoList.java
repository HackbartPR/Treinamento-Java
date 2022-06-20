package br.com.dio.collection.list;

/*DADA AS SEGUINTES INFORMAÇÕES SOBRE GATOS, CRIE UMA LISTA E ORDENE ESTA LSITA EXIBINDO (NOME-IDADE-COR)
    
  GATO 01 = NOME: JON, IDADE: 18, COR: PRETO;
  GATO 02 = NOME: SIMBA, IDADE: 06, COR: TIGRADO;
  GATO 03 = NOME: JON, IDADE: 12, COR: AMARELO;
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
import java.util.Comparator;


public class OrdenacaoList {
    
    public static void main(String[] args){
        
        List<Cat> listCat = new ArrayList<>(){{
            add(new Cat("Jon", 18, "Preto"));
            add(new Cat("Simba", 06, "Tigrado"));
            add(new Cat("Jon", 12, "Amarelo"));
            
        }};
        
        System.out.println("\nImprima na ordem de Inserção:");
        System.out.println(listCat);
        
        System.out.println("\nImprima na ordem aleatória:");
        Collections.shuffle(listCat);
        System.out.println(listCat);
        
        System.out.println("\nImprima na ordem natural:");
        Collections.sort(listCat);
        System.out.println(listCat);
        
        System.out.println("\nImprima na ordem de idade:");
        listCat.sort(new ComparatorAge());
        System.out.println(listCat);
        
        System.out.println("\nImprima na ordem natural das cores:");
        listCat.sort(new ComparatorColor());
        System.out.println(listCat);
        
        System.out.println("\nImprima em ordem com o grau de prioridade nome, idade e cor:");
        listCat.sort(new ComparatorNameAgeColor());
        System.out.println(listCat);
    }
    
}

//CLASSE GATOS
class Cat implements Comparable<Cat>{
    //VARIÁVEIS DE AMBIENTE
    private String name;
    private Integer age;
    private String color;
    
    //CONSTRUTOR
    public Cat(String name, Integer age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    //GETTER
    public String getName(){
        return this.name;
    }
    
    public Integer getAge(){
        return this.age;
    }
    
    public String getColor(){
        return this.color;
    }
    
    @Override
    public String toString(){
      return "{" + "name='" + this.name + '\'' + ", age=" + this.age + ", color='" + this.color + '\'' + '}'; 
    }
    
    @Override
    public int compareTo(Cat cat){
        return this.getName().compareToIgnoreCase(cat.getName());
    }
    
}


class ComparatorAge implements Comparator<Cat> {
    
    @Override
    public int compare(Cat first, Cat second){
        return Integer.compare(first.getAge(), second.getAge());
    }    
}

class ComparatorColor implements Comparator<Cat>{
    
    @Override
    public int compare(Cat first, Cat second){
        return first.getColor().compareToIgnoreCase(second.getColor());
    }
}

class ComparatorNameAgeColor implements Comparator<Cat> {
    @Override
    public int compare(Cat first, Cat second) {        
        int nameIndex = compareName(first, second);
        
        if( nameIndex == 0){
            
            int ageIndex = compareAge(first, second);
            if (ageIndex == 0){
                
                int colorIndex = compareColor(first, second);                
                return colorIndex;
            }
            
            return ageIndex;
        }
        
        return nameIndex;                                
    }
    
    private int compareName (Cat first, Cat second) {
        int nameIndex = first.getName().compareToIgnoreCase(second.getName());
        
        return nameIndex;
    }
    
    private int compareAge (Cat first, Cat second) {
        int ageIndex = Integer.compare(first.getAge(), second.getAge());
        
        return ageIndex;
    }
    
    private int compareColor (Cat first, Cat second) {
        int colorIndex = first.getColor().compareToIgnoreCase(second.getColor());
        
        return colorIndex;
    }
}

