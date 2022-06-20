package secondexerciciolist;


public class Question {
    
    private String description;
    private Boolean answer;
    
    //CONSTRUCTOR
    public Question (String description, Boolean answer){
        this.description = description;
        this.answer = answer;
    }
    
    //GETTERS
    public String getDescription(){
        return this.description;
    }
    
    public Boolean getAnswer(){
        return this.answer;
    }
    
    @Override
    public String toString(){
        return "{description='" + this.description + "', answer=" + this.answer + "}";
    }
        
}
