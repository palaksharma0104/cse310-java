public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
    this.quantity = 1; // Default quantity to 1
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}

public class ShoppingCart {
  private List<Product> items;

  public ShoppingCart() {
    this.items = new ArrayList<>();
  }

  public void addToCart(Product product, int quantity) {
    if (product != null && quantity > 0) {
      product.setQuantity(quantity);
      items.add(product);
    }
  }

  public void removeFromCart(Product product) {
    items.remove(product);
  }

  public double getTotalPrice() {
    double total = 0;
    for (Product item : items) {
      total += item.getPrice() * item.getQuantity();
    }
    return total;
  }

  public void printCart() {
    System.out.println("Shopping Cart:");
    System.out.println("  Name\t\tPrice\tQuantity");
    System.out.println("-------------------------");
    for (Product item : items) {
      System.out.println("  " + item.getName() + "\t\t" + item.getPrice() + "\t" + item.getQuantity());
    }
    System.out.println("-------------------------");
    System.out.println("Total Price: $" + getTotalPrice());
  }
}
