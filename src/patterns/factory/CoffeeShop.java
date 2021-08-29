package patterns.factory;

public abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Your coffee!");
        return coffee;
    }
    protected abstract Coffee createCoffee(CoffeeType type);
}
