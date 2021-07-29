class PrintColor {
    public static void check_color () {
        int value = 0;

        if(value <= 0)
            System.out.println("Красный");
        else if(value <= 100)
            System.out.println("Желтый");
        else if(value > 100)
            System.out.println("Зеленый");
    }
}
