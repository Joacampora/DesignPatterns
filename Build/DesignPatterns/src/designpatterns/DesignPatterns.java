package designpatterns;
/*
 * @Joacampora
 */
public class DesignPatterns {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        HawaiPizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
        PicantePizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
 
        cocina.setPizzaBuilder( hawai_pizzabuilder );
        cocina.construirPizza();
 
        Pizza pizza = cocina.getPizza();
        
        System.out.println(pizza.sabor);
    }
    
}
