package kata.eigth_kyu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class KeepUpTheHoop {

    private static final Logger LOGGER = Logger.getLogger( KeepUpTheHoop.class.getName() );


    public static String hoopCount(int n){

        if(n>=10 && n>=0){
            LOGGER.log(Level.INFO, "Text Return: %s".formatted("Great, now move on to tricks"), "");
            return "Great, now move on to tricks";
        } else {
            LOGGER.log(Level.INFO, "Text Return: %s".formatted("Keep at it until you get it"), "");
            return "Keep at it until you get it";
        }

    }

    public static void main(String[] args) {
        hoopCount(7);
    }
}
