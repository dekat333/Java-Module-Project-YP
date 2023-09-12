//import java.util.Scanner;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

//import java.Input.Input;
public class Main {

    public static void main(String[] args) {

        double summa=0;

        //boolean a1;
       // double price1=0;

        List<String> menu1 = new ArrayList<String>();

        Prod p = new Prod();
        int n=Input.human();

       while (true){
           String nameb = Input.name();
           if (nameb.equalsIgnoreCase("Завершить")) {
               break;
           }
            p.price = Input.inp();

           menu1 = Calc.menu(nameb);
          summa= Calc.calculator(p.price);
           System.out.println("Товар добавлен");
           System.out.println("Хотите ли добавить еще один товар?");
            ///////

        }
        System.out.print("Добавленные товары: ");
        System.out.println(menu1.toString().replace("[", "").replace("]", ""));

        summa = summa/n;
        System.out.print("Необходимо оплатить: ");
        System.out.printf("%.2f",summa);
        Form.sum(summa);
    }
}
class Prod {
    String name = ""; // Название блюда
    double price = 0; // Цена блюда
}