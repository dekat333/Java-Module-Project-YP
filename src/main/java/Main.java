import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws Exception{

        Prod p = new Prod();
        String menu = "";
        double summa;
        boolean a1;//вспомогательная переменная для проверки
        Scanner input = new Scanner(System.in);
        summa = 0;
        a1 = true;
        int n = 0;
        System.out.println("Привет! Я – калькулятор счета");

        while (true) { // Запускаем бесконечный цикл
            System.out.println("На скольких человек необходимо разделить счет?");
            n = input.nextInt(); // Получаем количество человек

            if (n==1) {
                System.out.println("Ошибка, Вы ввели 1");
            } else {
                if (n<1) {
                    System.out.println("Вы ввели отрицательное число!");
                }
                else {
                    System.out.println("Спасибо!");
                    break;
                }
            }
        }

        while (a1) {
            System.out.println("Введите название блюда и нажмите Enter. Если ввод закончен, введите \"Завершить\"");
            p.name = input.next();
            //System.out.println(p.name);
            if (p.name.equalsIgnoreCase("Завершить")) {
                a1=false;
                break;
            }
            System.out.println("Введите цену блюда");
            p.price = input.nextDouble ();
            menu = menu + "\n" + p.name;
            summa = summa + p.price;
            System.out.println("Товар добавлен");
            //  p.name = "";
            System.out.println("Хотите ли добавить еще один товар?");
        }
        System.out.print("Добавленные товары: ");
        System.out.println(menu);
        summa = summa/n;
        System.out.print("Необходимо оплатить: ");
        int x = (int) summa%100/10;
        int y = (int) summa%10;
        System.out.printf("%.2f",summa);
        if (summa == 1||(y==1 && x!=1)){
            System.out.print(" рубль");
        }else{
            if ((y==2||y==3||y==4)&&x!=1){
                System.out.print(" рубля");
            }else{
                System.out.print(" рублей");
            }
        }
    }

}
class Prod {
    String name = ""; // Название блюда
    double price = 0; // Цена блюда
}