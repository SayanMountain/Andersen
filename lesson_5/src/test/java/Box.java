import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> array;
    private T fruit;

    void add(T elem) {
        array.add(elem);
    }


    public ArrayList<T> getArray() {
        return array;
    }

    public int getWeight() {
        int res = 0;
        for(int i = 0; i < array.size(); i++) {
            res += array.get(i).getFruitWeight();
        }
        System.out.println("Количество фруктов: " + res);
        return (array.size() * res);
    }

    public boolean compare(Box o2) {
        if(getWeight() == o2.getWeight())
            return true;
        else
            return false;
    }

//    public void pourOver(Box<T> o2){
//       if(o2.getArray().size() != 0)
//           throw new IllegalArgumentException("Нельзя пересыпать в непустую коробку");
////       for(int i = 0; i < array; i++){
//           o2.getArray().addAll(array);
////       }
//    }
}
