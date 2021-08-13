public class Main {

    public static void main(String[] args) {
        Box<Orange> box_oranges = new Box<Orange>();
        Box<Apple> box_apples = new Box<Apple>();


        Orange orange = new Orange(2);
        Apple apple = new Apple(5);

        box_oranges.add(orange);
        box_apples.add(apple);

//        box_oranges.pourOver();
//        box_apples.pourOver();
    }
}
