public abstract class Animal {

    abstract void run(int obstacleLen);

    abstract void swim(int obstacleLen);


    public static void main (String [] argc)
    {
        Dog dog = new Dog("Бобик");
        Plat plat = new Plat(100);
        plat.addMeal(new Meal("рис", 100));

        dog.swim(10);
        dog.run(150);

        Cat cat = new Cat("Tom", 5);
        cat.run(5);
        cat.swim(10);
        cat.eat(plat);
    }
 }
