class ShoppingCart {
    private final String cartId;
    private final double[] prices;
    private int itemCount;

    public ShoppingCart(String cartId, int capacity) {
        this.cartId = cartId;
        this.prices = new double[Math.max(0, capacity)];
        this.itemCount = 0;
    }

    public void addItem(double price) {
        if (price > 0 && itemCount < prices.length) {
            prices[itemCount] = price;
            itemCount++;
        } else if (itemCount >= prices.length) {
            System.out.println("Cart is full");
        } else {
            System.out.println("Invalid price");
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getCartId() {
        return cartId;
    }
}

class ShoppingCartManager {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Cart ID: " + cart.getCartId());
        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}