package ordenacaoset;

import java.util.Comparator;

public class ComparatorFull implements Comparator<Serie>{
    
    @Override
    public int compare(Serie serie1, Serie serie2){
        int indexName = compareName(serie1, serie2);
        
        if(indexName == 0){
            int indexGender = compareGender(serie1, serie2);
            
            if(indexGender == 0) {
                
                int indexTime = compareTime(serie1, serie2);
                
                return indexTime;
            }
            
            return indexGender;
        }
        
        return indexName;
    }
    
    private int compareName(Serie first, Serie second){
        int indexName = first.getName().compareToIgnoreCase(second.getName());
        
        return indexName;
    }
    
    private int compareGender(Serie first, Serie second){
        int indexGender = first.getGender().compareToIgnoreCase(second.getGender());
        
        return indexGender;
    }
    
    private int compareTime(Serie first, Serie second){
        int indexTime = Integer.compare(first.getEpisodeTime(), second.getEpisodeTime());
        
        return indexTime;
    }
}
