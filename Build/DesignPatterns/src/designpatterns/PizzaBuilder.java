package designpatterns;

abstract class PizzaBuilder {
    Pizza pizza;
    
    public Pizza getPizza() { return pizza; }
    
    public abstract void buildSabor();
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}