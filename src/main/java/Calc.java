import java.util.ArrayList;
import java.util.List;

public class Calc {
    static List<String> menu = new ArrayList<>();
    static double summa = 0;
    public static List<String> menu(String nameb) {
        menu.add(nameb);
        return (menu);
    }
    public static Double calculator(Double summa1){

        summa = summa + summa1;
        return (summa);
    }
}

