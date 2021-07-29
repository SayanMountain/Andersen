public class CheckSumSign {
    public static void check_neg_or_pos () {
        int a = 1935;
        int b = 4;
        int sum = a + b;
        if(sum >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }
}
