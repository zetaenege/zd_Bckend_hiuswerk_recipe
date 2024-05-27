

public class Ingredient {

    private double amount;
    private String name;
    private String unit;

    public Ingredient (){

    }

    public Ingredient (double amount, String name, String unit){}


    public double getAmount(){
        return amount;
    }

    public String getName(){
        return name;
    }

    public String getUnit(){
        return unit;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }



}
