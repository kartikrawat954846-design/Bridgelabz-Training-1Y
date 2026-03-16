class Product {
    String productName;   // instance variable
    double price;         // instance variable
    static int totalProducts = 0; // class variable

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment shared count
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 45000);
        Product p2 = new Product("Phone", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}