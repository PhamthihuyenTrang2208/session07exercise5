package exercise05;

public class Product {
    private String name;
    private String id;
    private double price;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void  setId(String id){
        this.id = id;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Giá: " + price;
    }

}
