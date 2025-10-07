public   class Product {
    private int id;
    private int quantity;
    private String name;
    private double price;
    private static int count;

    public Product(int id , int quantity , String name , double price){
            this.name=name;
            this.quantity=quantity;
            this.price=price;
            this.id=++count;
    }

    public String getName(){
        return  name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void showDetails(){
        System.out.println("ID: " + id + " | Name: " + name +
                " | Quantity: " + quantity +
                " | Price: ₹" + price);
    }

    public void reduceQuantity(int amount){
            if (amount>0 && amount<=quantity){
                quantity -= amount;
            }else {
                System.out.println("out of stock");
            }
    }
}
