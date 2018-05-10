package designpatterns;

public class Pizza {
    private String masa = "";
    private String salsa = "";
    private String relleno = "";
    public String sabor = "";
 
    public void setSabor(String sabor){
        this.sabor = sabor; 
    }
    public void setMasa(String masa){
        this.masa = masa; 
    }
    public void setSalsa(String salsa){
        this.salsa = salsa;
    }
    public void setRelleno(String relleno){
        this.relleno = relleno;
    }
}