import java.util.Scanner;

class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mouse = 20;
        int keyboard = 40;
        int headphones = 50;
        int laptop_stand = 30;
        int quantity_mouse = 0;
        int quantity_keyboard = 0;
        int quantity_head = 0;
        int quantity_lap = 0;
        int choose = 0;
        int price = 0;
        int price2 = 0;
        int price3 = 0;
        int price4 = 0;
        int total = 0;
        int total2 = 0;
        int total3 = 0;
        int total4 = 0;
        double subtotal = 0;
        double discount = 0;
        while (choose != 5) {
            System.out.println("1. Mouse: $" + mouse);
            System.out.println("2. Keyboard: $" + keyboard);
            System.out.println("3. Headphones: $" + headphones);
            System.out.println("4. Laptop Stand: $" + laptop_stand);
            System.out.println("5. Checkout");
            System.out.print("Choose a product:");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("You selected: Mouse");
                    price += mouse;
                    System.out.println("Price: $" + price);
                    System.out.print("Enter quantity: ");
                    quantity_mouse += scanner.nextInt();
                    System.out.println("Added to cart!");
                    total = mouse * quantity_mouse;
                    System.out.println("Current total: $" + (total + total2 + total4 + total3));
                    break;
                case 2:
                    System.out.println("You selected: Keyboard");
                    price2 += keyboard;
                    System.out.println("Price: $" + price2);
                    System.out.print("Enter quantity: ");
                    quantity_keyboard += scanner.nextInt();
                    System.out.println("Added to cart!");
                    total2 = keyboard * quantity_keyboard;
                    System.out.println("Current total: $" + (total + total2 + total4 + total3));
                    break;
                case 3:
                    System.out.println("You selected: Headphones");
                    price3 += headphones;
                    System.out.println("Price: $" + price3);
                    System.out.print("Enter quantity: ");
                    quantity_head += scanner.nextInt();
                    System.out.println("Added to cart!");
                    total3 = headphones * quantity_head;
                    System.out.println("Current total: $" + (total + total2 + total4 + total3));
                    break;
                case 4:
                    System.out.println("You selected: Laptop Stand");
                    price4 += laptop_stand;
                    System.out.println("Price: $" + price4);
                    System.out.print("Enter quantity: ");
                    quantity_lap += scanner.nextInt();
                    System.out.println("Added to cart!");
                    total4 = laptop_stand * quantity_lap;
                    System.out.println("Current total: $" + (total + total2 + total4 + total3));
                    break;
            }
        }
        subtotal = total + total2 + total4 + total3;
        System.out.println("==== CHECKOUT ====");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println(" ");
        if (subtotal >= 100) {
            discount = (subtotal * 0.1);
            subtotal -= discount;
            System.out.println("Your discount: $" + discount);
            System.out.println("Final Total: $" + subtotal);

        }
        double payment = 0;
        while (payment < subtotal) {
            System.out.print("Enter payment amount: $");
            payment = scanner.nextDouble();
            if (payment < subtotal) {
                System.out.println("Insufficient payment amount");

                System.out.println("You still need pay: $" + (subtotal - payment));
                System.out.print("Enter payment amount: $");
                payment = scanner.nextDouble();
            }
        }
        System.out.println("========================");
        System.out.println("       SIMPLE STORE     ");
        System.out.println("========================");
        System.out.println("");
        System.out.println("Item purchased: " + (quantity_mouse + quantity_keyboard + quantity_head + quantity_lap));
        System.out.println("Subtotal: $" + (subtotal + discount));
        System.out.println("Discount: $" + (discount));
        System.out.println("Final Total: $" + subtotal);
        System.out.println("Payment: $" + payment);
        System.out.println("Change: $" + (payment - subtotal));
        System.out.println("=======================");
        System.out.println("Thank you for shopping!");
        System.out.println("=======================");
    }
}