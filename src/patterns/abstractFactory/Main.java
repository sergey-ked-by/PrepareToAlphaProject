package patterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new AmericanCoffeeShop();
        CoffeeWithMilk coffee = coffeeShop.createCoffeeWithMilk();

        CoffeeShop coffeeShop1 = new ItalianCoffeeShop();
        CoffeeWithoutMilk coffeeWithoutMilk = coffeeShop1.createCoffeeWithoutMilk();

    }
}
