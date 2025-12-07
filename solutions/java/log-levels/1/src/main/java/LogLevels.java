public class LogLevels {
    
    public static String message(String logLine) {
        if(logLine.contains("ERROR")){
            int index = logLine.indexOf("ERROR");
            String s2 = logLine.substring(index + 7);
            s2 = s2.trim();
            return s2;
        }
        else if(logLine.contains("INFO")){
            int index = logLine.indexOf("INFO");
            String s2 = logLine.substring(index + 6);
            s2 = s2.trim();  
            return s2;
        }
        else{
            int index = logLine.indexOf("WARNING");
            String s2 = logLine.substring(index + 9);
            s2 = s2.trim(); 
            return s2;
        }
        
    }

    public static String logLevel(String logLine) {
       if(logLine.contains("ERROR")){
            int i1 = logLine.indexOf("ERROR");
            String s2 = logLine.substring(i1,6);
            return s2.toLowerCase();
       }
        else if(logLine.contains("INFO")){
            int i1 = logLine.indexOf("INFO");
            String s2 = logLine.substring(i1,5);
            return s2.toLowerCase();
        }
        else{
            int i1 = logLine.indexOf("WARNING");
            String s2 = logLine.substring(i1,8);
            return s2.toLowerCase();
        }
    }

    public static String reformat(String logLine) {
        if(logLine.contains("ERROR")){
            String s2 = message(logLine);
            return s2+" (error)";
        }
        else if(logLine.contains("INFO")){
            String s2 = message(logLine);
            return s2+" (info)";
        }
        else{
            String s2 = message(logLine);
            return s2+" (warning)";
        }
    }
}
