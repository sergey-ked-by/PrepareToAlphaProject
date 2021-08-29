package patterns.abstractFactory;

public class ItalianCoffeeShop implements CoffeeShop{
    @Override
    public CoffeeWithMilk createCoffeeWithMilk() {
        return new ItalianCoffeeWithMilk();
    }

    @Override
    public CoffeeWithoutMilk createCoffeeWithoutMilk() {
        return new ItalianCoffeeWithoutMilk();
    }
}
