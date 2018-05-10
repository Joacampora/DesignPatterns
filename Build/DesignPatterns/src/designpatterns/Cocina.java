package designpatterns;

class Cocina {
    private PizzaBuilder pizzaBuilder;
 
    public void setPizzaBuilder(PizzaBuilder pb){
        pizzaBuilder = pb;
    }
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
 
    public void construirPizza() {
       pizzaBuilder.buildSabor();
       pizzaBuilder.buildMasa();
       pizzaBuilder.buildSalsa();
       pizzaBuilder.buildRelleno();
    }
}