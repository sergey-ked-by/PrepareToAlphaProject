package patterns.abstractFactory;

public interface CoffeeShop {
    CoffeeWithMilk createCoffeeWithMilk();
    CoffeeWithoutMilk createCoffeeWithoutMilk();
}
