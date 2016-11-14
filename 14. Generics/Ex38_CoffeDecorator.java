/**
 * Create a simple Decorator system by starting with basic coffee, then providing decorators of steamed milk,
 * foam, chocolate, caramel and whipped cream.
 */

class BasicCoffee {
    private String type;

    public BasicCoffee() {}
    public BasicCoffee(String type) { this.type = type; }
    public void setType(String type) { this.type = type; }
    public String getType() { return type; }
}

class CoffeeDecorator extends BasicCoffee {
    protected BasicCoffee basic;

    public CoffeeDecorator(BasicCoffee basic) { this.basic = basic; }

    @Override public void setType(String type) { basic.setType(type); }
    @Override public String getType() { return basic.getType(); }
}

class SteamedMilk extends CoffeeDecorator {
    public SteamedMilk(BasicCoffee basic) {
        super(basic);
        setType(getType() + " + steamed milk");
    }
}

class Foam extends CoffeeDecorator {
    public Foam(BasicCoffee basic) {
        super(basic);
        setType(getType() + " + foam");
    }
}

class Chocolate extends CoffeeDecorator {
    public Chocolate(BasicCoffee basic) {
        super(basic);
        setType(getType() + " + chocolate");
    }
}

class Caramel extends CoffeeDecorator {
    public Caramel(BasicCoffee basic) {
        super(basic);
        setType(getType() + " + caramel");
    }
}

class WhippedCream extends CoffeeDecorator {
    public WhippedCream(BasicCoffee basic) {
        super(basic);
        setType(getType() + " + whipped cream");
    }
}

class HotWater extends CoffeeDecorator {
    public HotWater(BasicCoffee basic) {
        super(basic);
        setType(getType() + " + hot water");
    }
}

public class Ex38_CoffeDecorator {
    public static void main(String[] args) {
        CoffeeDecorator capuccino = new SteamedMilk(new Foam(new BasicCoffee("espresso")));
        System.out.println("Capuccino contains: " + capuccino.getType());

        CoffeeDecorator latte = new SteamedMilk(new Foam(new BasicCoffee("coffe")));
        System.out.println("Latte contains: " + latte.getType());

        CoffeeDecorator americano = new HotWater(new BasicCoffee("espresso"));
        System.out.println("Americano contains: " + americano.getType());

        CoffeeDecorator macchiato = new Caramel(new SteamedMilk(new BasicCoffee("espresso")));
        System.out.println("Macchiato contains: " + macchiato.getType());
    }
}
