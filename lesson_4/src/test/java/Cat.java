public class Cat extends Animal{

    private String name;
    private boolean fullness;
    private int eatLimit = 15;

    public Cat(String name, int eatLimit) {
        this.name = name;
        this.fullness = false; // bullean
        this.eatLimit = eatLimit;
    }

    @Override
    void run(int obstacleLen) {
        System.out.println(name + "пробежал " + obstacleLen + " метров");
    }

    @Override
    void swim(int obstacleLen) {

        int max = 10;
        if (obstacleLen < 0)
            throw new IllegalArgumentException("Отрицательные значения недопустимы");
        else if(obstacleLen > max)
            throw new IllegalArgumentException("Собака не может плыть больше 10 метров");
        else
            System.out.println(name + "проплыл " + obstacleLen + " метров");
    }

    void eat(Plat plat) {
        if(eatLimit <= plat.getMealQuantity()){
            fullness = true;
            System.out.println("Кот поел " + plat.getMeal().getMealName());
        }
        else
            System.out.println("кот не начинает есть, поскольку еды мало");
    }
}
