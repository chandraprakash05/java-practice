package main.java.practice;

public class Methods1 {

    public static void main(String[] args) {
        // 500 ml water
        // 250 ml juice
        // 750 ml beer
        Bottle waterBottle = new Bottle();
        Bottle juiceBottle = new Bottle();
        Bottle beerBottle = new Bottle();

        // initialization through method
        waterBottle.setProperties(1, "water", "500ml");
        juiceBottle.setProperties(2, "juice","250ml");
//        beerBottle.setProperties(3, "beer","750ml");

        beerBottle.id = 3;
        beerBottle.type = "beer";
        beerBottle.capacity = "750ml";
        System.out.println("id = " + beerBottle.id + " ,type = " + beerBottle.type + " ,capacity = " + beerBottle.capacity);

        waterBottle.printProperties();
        juiceBottle.printProperties();
    }

}

class Bottle {
    int id;
    String type;
    String capacity;

    // Method signature contains returnType, methodName, (inputParameters) in the same order
    // void for empty or no return type
    // input parameters (like givenId) has scope inside the method itself (setProperties)
    // similarly all local variables are only accessible inside the method
    void setProperties(int givenId, String givenType, String givenCapacity) {
        id = givenId;
        type = givenType;
        capacity = givenCapacity;
    }

    void printProperties() {
        System.out.println("id = " + id + " ,type = " + type + " ,capacity = " + capacity);
    }
}