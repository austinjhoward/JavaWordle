import java.util.ArrayList;
import java.lang.Integer;

public class CheckPositionsTesting {

public static void main(String args[]){

//Write two 5 letter words (all lowercase)
//compile and run.
//the output should be 0 for the letters that will be gray, 1 for yellow and 2 for green 
        String word = "madam";
        String hiddenWord = "mound";
        ArrayList<Integer> positions = new ArrayList<Integer>();
        ArrayList<Integer> indexesMatching = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++)
        {
            if(word.charAt(i) == hiddenWord.charAt(i))
            {
                positions.add(2);
                indexesMatching.add(i);
            }
            else 
            {
                positions.add(0);
            }
        }
        
       
      for(int i = 0; i < 5; i++)
       {
           if(positions.get(i) != 2)
           {
               Boolean exists = false;
               for(int j = 0; j < 5; j++)
               {
                   if(!indexesMatching.contains(j))
                   {
                   if(word.charAt(i) == hiddenWord.charAt(j) && !exists)
                   {
                       exists = true;
                       positions.set(i,1);
                       indexesMatching.add(j);
                   }
                   }
               }
               
           }
       }
        
        System.out.println(positions);
}
}
