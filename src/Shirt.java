public class Shirt{
    public int shirtID = 1;
    public String description = "-Nike-";
    public char colorCode = 'U';
    public double price = 15.0;
    public int quantityInStock = 0;

    public void displayShirtInInformation(){
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stok: " + quantityInStock);
    }
}