import java.util.Scanner;

public class Input {


    public static int human () {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Привет! Я – калькулятор счета");
        while (true) {
            System.out.println("На скольких человек необходимо разделить счет?");
            String str = input.next();
            n = 0;
            try {
                n = Integer.parseInt(str);
                if (n == 1) {
                    System.out.println("Ошибка, Вы ввели 1");
                } else {
                    if (n < 1) {
                        System.out.println("Вы ввели отрицательное число!");
                    } else {
                        if (n == 0) {
                            System.out.println("Ошибка, Вы ввели 0");
                        } else {
                            System.out.println("Спасибо!");
                            break;
                        }
                    }


                }

            } catch (NumberFormatException ne) {
                System.out.println("Ошибка, введите число");
            }
        }
        return n;
    }




            public static String name() {
                Scanner input = new Scanner(System.in);
                Prod p = new Prod();

                System.out.println("Введите название блюда и нажмите Enter. Если ввод закончен, введите \"Завершить\"");

                p.name = input.next();

                return p.name;
            }
        public static double inp() {
            Scanner input = new Scanner(System.in);
            double price1 = 0;
            while (true) {
                System.out.println("Введите цену блюда");
                String str1 = input.next();
                try {
                    price1 = Double.parseDouble(str1);
                    if (price1 < 0) {
                        System.out.println("Вы ввели отрицательное число!");
                    } else {
                        break;
                    }
                } catch (NumberFormatException ne) {
                    System.out.println("Ошибка, введите число");
                }
            }
            return price1;
        }

    }
