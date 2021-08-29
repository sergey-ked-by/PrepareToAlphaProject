package patterns.abstractFactory;

public class AmericanCoffeeShop implements CoffeeShop{
    @Override
    public CoffeeWithMilk createCoffeeWithMilk() {
        return new AmericanCoffeeWithMilk();
    }

    @Override
    public CoffeeWithoutMilk createCoffeeWithoutMilk() {
        return new AmericanCoffeeWithoutMilk();
    }
}
