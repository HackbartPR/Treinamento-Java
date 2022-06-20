/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/


package firstexerciciolist;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class FirstExercicioList {

    public static void main(String[] args) {        
        List<Months> listMonths = new ArrayList<>();

        listMonths.add(new Months("Janeiro", randomTemperature()));
        listMonths.add(new Months("Fevereiro", randomTemperature()));
        listMonths.add(new Months("Março", randomTemperature()));
        listMonths.add(new Months("Maio", randomTemperature()));
        listMonths.add(new Months("Abril", randomTemperature()));
        listMonths.add(new Months("Junho", randomTemperature()));
        
        //IMPRIMIR TODA A LISTA COM OS VALORES INSERIDOS
        System.out.println(listMonths);

        Float average = averageTemperature(listMonths);
        
        //IMPRIMIR A MEDIA DA TEMPERATURA ENCONTRADA
        System.out.println(average);

        List<Months> listMonthsUpTemp = new ArrayList<>();
        listMonthsUpTemp.addAll(monthsTemperatureAbove(listMonths, average));

        //IMPRIMIR OS MESES QUE POSSUEM A TEMPERATURA MAIOR OU IGUAL A MEDIA ENCONTRADA
        System.out.println(listMonthsUpTemp);
    }

    private static Float randomTemperature() {
        Random random = new Random();

        return random.nextFloat(45);
    }

    private static Float averageTemperature(List<Months> list) {
        Float average = 0f;

        for (Months month : list) {
            average += month.getTemperature();
        }

        average /= list.size();

        return average;
    }

    private static List<Months> monthsTemperatureAbove(List<Months> list, Float average) {
        List<Months> resultList = new ArrayList<>();
        Iterator<Months> iterator = list.iterator();

        while (iterator.hasNext()) {
            Months nextMonth = iterator.next();            
            Float nextTemperature = nextMonth.getTemperature();
            String nextName = nextMonth.getName();

            if (nextTemperature >= average) {
                resultList.add(new Months(nextName, nextTemperature));
            }
        }

        return resultList;
    }
}
