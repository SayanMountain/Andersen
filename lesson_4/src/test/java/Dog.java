public class Dog extends Animal{

    private String name;

    public Dog(String name) {
        this.name = name;
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
}

