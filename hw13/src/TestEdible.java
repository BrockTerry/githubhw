/**
 * Objective: Add classes that either implement edible or not depending on if they can be eaten
 * Algorithm: properly implement edible when necessary
 *Input and Output:
 * Created by: Brock Terry
 * Date:6/25/23
 */



public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange(), new Fish(), new Watermelon()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            } else {
                System.out.println("Object is not edible");
            }
        }
    }
}

class Animal{

}

class Chicken extends Animal implements Edible{
    public String howToEat() {
        return "Chicken: Fry it";
    }
}

class Tiger extends Animal{

}

class Fish extends Animal implements Edible{
    public String howToEat(){
        return "Fish: Remove scales and fry";
    }

}

class Watermelon extends Fruit{
    public String howToEat(){
        return "Watermelon: Cut into cubes";
    }
}

abstract class Fruit implements Edible{

}

class Apple extends Fruit  {
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit{
    public String howToEat(){
        return "Orange: Make orange juice";
    }
}