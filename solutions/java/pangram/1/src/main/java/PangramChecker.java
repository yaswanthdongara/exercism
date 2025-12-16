import java.util.*;
public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        for(char c = 'a'; c <= 'z'; c++){
            if(!input.contains(String.valueOf(c))){
                return false;
            }
        
        }
        return true;
    }

}
