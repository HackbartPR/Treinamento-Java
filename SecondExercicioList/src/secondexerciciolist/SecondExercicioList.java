/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

package secondexerciciolist;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class SecondExercicioList {
    
    public static void main(String[] args) {
        List<Question> listQuestion = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Responda todo o questionário apenas com a letra 's' para sim e 'n' para não!");
        
        System.out.print("Telefonou para a vítima? [s] ou [n]");
        String firstAnswer = scan.next();
        
        System.out.print("Esteve no local do crime? [s] ou [n]");
        String secondAnswer = scan.next();
        
        System.out.print("Mora perto da vítima? [s] ou [n]");
        String thirdAnswer = scan.next();
        
        System.out.print("Devia para a vítima? [s] ou [n]");
        String fourthAnswer = scan.next();
        
        System.out.print("Já trabalhou com a vítima? [s] ou [n]");
        String fifthAnswer = scan.next();
        
        listQuestion.add(new Question("Telefonou para a vítima? ", getAnswer(firstAnswer.toLowerCase())));
        listQuestion.add(new Question("Esteve no local do crime? ", getAnswer(secondAnswer.toLowerCase())));
        listQuestion.add(new Question("Mora perto da vítima? ", getAnswer(thirdAnswer.toLowerCase())));
        listQuestion.add(new Question("Devia para a vítima? ", getAnswer(fourthAnswer.toLowerCase())));
        listQuestion.add(new Question("Já trabalhou com a vítima? ", getAnswer(fifthAnswer.toLowerCase())));

        int howManyTrueAnswer = summaryAnswers(listQuestion);
        
        finalVerdict(howManyTrueAnswer);
    }
    
    private static boolean getAnswer(String answer){ 
        
        if(answer.contains("s"))return true;
                
        return false;
    }
    
    private static int summaryAnswers(List<Question> list){                
        Iterator<Question> iterator = list.iterator();
        int count = 0;
        
        while(iterator.hasNext()){
            boolean currentAnswer = iterator.next().getAnswer();
            
            if(currentAnswer) count++;                        
        }
        
        return count;
    }
    
    private static void finalVerdict(int trueAnswer){
        switch(trueAnswer){
            case 1:
                System.out.println(">> SUSPEITO <<");
                break;
            case 2:
                System.out.println(">> SUSPEITO <<");
                break;
            case 3:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 4:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 5:
                System.out.println(">> ASSASINO <<");
                break;
            default:
                System.out.println(">> INOCENTE <<");
                break;
        }
    }
}
