public class Plat{

    private int mealQuantity;
    private Meal meal;

    public Meal getMeal() {
        return meal;
    }

    public int getMealQuantity() {
        return mealQuantity;
    }

    public Plat(int mealQuantity) {
        if(mealQuantity < 0) {
            throw new IllegalArgumentException("Отрицательное количество еды недопустимо");
        }
        else    this.mealQuantity = mealQuantity;
    }

    public void addMeal(Meal meal){
        if (meal.getMealInPlat() > mealQuantity)
            throw new IllegalArgumentException("Еда ("+ meal.getMealName()+") не влезает на тарелку");
        else this.meal = meal;
    }
}
