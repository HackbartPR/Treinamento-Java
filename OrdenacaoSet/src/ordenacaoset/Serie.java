package ordenacaoset;


public class Serie implements Comparable<Serie>{
    private String name;
    private String gender;
    private int episodeTime;
    
    public Serie(String name, String gender, int episodeTime){
        this.name = name;
        this.gender = gender;
        this.episodeTime = episodeTime;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public Integer getEpisodeTime(){
        return this.episodeTime;
    }
    
    @Override
    public String toString() {
        return "{" + "name='" + name + "', gender='" + gender + "', episodeTime=" + episodeTime + '}';
    }
    
    public int compareTo(Serie serie){
        return this.getName().compareToIgnoreCase(serie.getName());
    }        
}
