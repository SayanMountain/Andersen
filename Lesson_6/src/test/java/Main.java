import java.util.Arrays;

public class Main {

    public static boolean check_len(String[][] arr) throws MyArraySizeException {
        int y = 0;
        int x = 0;
        while(y < arr.length){
            x = 0;
            while( x < arr[y].length) {
                x++;
            }
            y++;
        }
        if (y != 4 || x != 4)
            throw new MyArraySizeException("Массив не равен 4 элеметнам!");
        return (y != 4 || x != 4);
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] massiv = new String[][]{{"2", "2", "2", "2"},
                                           {"2", "2", "2", "2"},
                                           {"2", "2", "2", "2"},
                                           {"2", "2", "2", "2"}};
        check_len(massiv);

        int res = 0;
        for (int y = 0; y < massiv.length; y++) {
            for (int x = 0; x < massiv[y].length; x++) {
                try
                {
                    res += Integer.valueOf(massiv[y][x]);
                }
                catch (NumberFormatException e)
                {
                    throw new MyArrayDataException("В массиве, в ячейке [" + y + "]["+x+ "] ошибка - не удалось перевести из String в Integer " + massiv[y][x]);
                }
            }
        }
        System.out.println(res);
    }
}


//public class Exception {
//    public static void main(String[] args) {
//        char ch = '9';
//        String str = "145";
//        int i1 = Character.getNumericValue(ch);
//        int i2 = Integer.valueOf(str);
//        System.out.println(i1);
//        System.out.println(str);
//    }
//}
