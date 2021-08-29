package patterns.factory;

public abstract class Coffee {
    public void makeCoffee(){
        //ads
    }
    public void pourIntoCup(){
        //ads
    }
}

class ItalianStyleAmericano extends Coffee {}
class ItalianStyleCappuccino extends Coffee {}
class ItalianStyleCaffeLatte extends Coffee {}
class ItalianStyleEspresso extends Coffee {}

class AmericanStyleAmericano extends Coffee {}
class AmericanStyleCappuccino extends Coffee {}
class AmericanStyleCaffeLatte extends Coffee {}
class AmericanStyleEspresso extends Coffee {}
