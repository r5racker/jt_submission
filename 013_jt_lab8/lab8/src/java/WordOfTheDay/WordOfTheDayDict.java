/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordOfTheDay;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author user1
 */
public class WordOfTheDayDict {
    
    static HashMap<String,String> dwMap=new HashMap<String,String>();
    static void initDict(){
        dwMap.put("Monday","innovation");
        dwMap.put("Tuesday","Creativity");
        dwMap.put("Wednesday","transition");
        dwMap.put("Thursday","motivation");
        dwMap.put("Friday","fearless");
        dwMap.put("Saturday","courageous");
        dwMap.put("Sunday","Consistancy");
    }
    public static String wordOfTheDay(String inputDay){
        initDict();
        return(dwMap.get(inputDay));
    }
    public static Set<String> daysOfWeekSet(){
        initDict();
        return dwMap.keySet();
    }
}
