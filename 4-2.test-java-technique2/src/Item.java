public class Item {

    static private String name;
    static private int price;

    public Item(String name, int price){
        Item.name = name;
        Item.price = price;
    }

    public static String getName() {
        return name;
    }
    public static void setName(String name) {
        Item.name = name;
    }
    public static int getPrice() {
        return price;
    }
    public static void setPrice(int price) {
        Item.price = price;
    }
    

    
}
