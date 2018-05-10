package designpatterns;

class HawaiPizzaBuilder extends PizzaBuilder {
    public HawaiPizzaBuilder(){
        super.pizza = new Pizza();
    }
     public void buildSabor(){
        pizza.setSabor("Hawaiano");
    }
    public void buildMasa(){
        pizza.setMasa("suave");
    }
    public void buildSalsa(){
        pizza.setSalsa("dulce");
    }
    public void buildRelleno(){
        pizza.setRelleno("piña+salami");
    }
}