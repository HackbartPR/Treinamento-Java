package firstexerciciolist;

public class Months {    
    private String name;
    private Float temperature;
    
    //CONSTRUCTOR
    public Months(String name, Float temperature){
        this.name = name;
        this.temperature = temperature;
    }
    
    //GETTERS
    public String getName(){
        return this.name;
    }
    
    public Float getTemperature(){
        return this.temperature;
    }
    
    @Override
    public String toString(){
        return "{ name='" + this.name + ", temperature=" + this.temperature + "}";
    }
}
