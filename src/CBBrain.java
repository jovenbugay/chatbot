
import java.util.ArrayList;


public class CBBrain {
    static ArrayList a = new ArrayList();
    static ArrayList b = new ArrayList();
    public String[] knowledgebase = {"name","age", "comprog"};
    public String[] responses = {"My name is Gulapa, the flying eagle", 
                                "I am 43 days old", "confidential"};
    public int loopcount = 0;
    public int newcount = 0;
    
    public String analyzeChat (String message){
        
        for (Object x : a){
            
            if(message.contains(String.valueOf(x))){
                String out = String.valueOf(b.get(newcount));
                
               return out;
            }
            newcount ++;
            
        }
        for (String y : knowledgebase){
            
            if (message.contains(y)){
                String out = responses[loopcount];
                
                return out;
            }
            loopcount++;
        }
    return "I can't understand";
    }
    public String newWord (String message){
        CBBrain.a.add(message);
        
        return "(" + message + ")" + " has been added. What should I response into that?";
    }
    public String newReply (String message){
        CBBrain.b.add(message);
        return "(" + message + ")" + " has been learned";
    }
}