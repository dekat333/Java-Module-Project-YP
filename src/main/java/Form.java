public class Form {
    public static void sum(double summa) {
        int x = (int) summa % 100 / 10;
        int y = (int) summa % 10;
        if (summa == 1 || (y == 1 && x != 1)) {
            System.out.print(" рубль");
        } else {
            if ((y == 2 || y == 3 || y == 4) && x != 1) {
                System.out.print(" рубля");
            } else {
                System.out.print(" рублей");
            }
        }
    }
}