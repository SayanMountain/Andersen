public class lesson_1 {
    public static void main (String [] argc) {
        PrintThreeWords temp = new PrintThreeWords();
        temp.print_three_names ();

        CheckSumSign temp4 = new CheckSumSign();
        temp4.check_neg_or_pos ();

        PrintColor temp2 = new PrintColor();
        temp2.check_color ();

        CompareNumbers temp3 = new CompareNumbers();
        temp3.check_num ();
    }
}


//**   new - выделение памяти под новый объект
//**  temp - название объекта конкретного класса
//**     . - обращение к методу