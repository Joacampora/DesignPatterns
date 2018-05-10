package designpatterns;

class PicantePizzaBuilder extends PizzaBuilder {
    public PicantePizzaBuilder(){super.pizza = new Pizza();}
    public void buildSabor(){
        pizza.setSabor("picante");
    }
    public void buildMasa(){
        pizza.setMasa("cocida");
    }
    public void buildSalsa(){
        pizza.setSalsa("picante");
    }
    public void buildRelleno(){
        pizza.setRelleno("pimienta+salchichón");
    }
}