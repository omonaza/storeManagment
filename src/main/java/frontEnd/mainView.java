package frontEnd;

import backEnd.domain.producs.clothes;
import backEnd.domain.producs.groceries;
import backEnd.domain.producs.product;
import backEnd.domain.store.store;
import backEnd.domain.users.adminUser;
import backEnd.domain.users.buyerUser;
import backEnd.domain.users.user;

public class mainView {
    public static void main(String[] args) {


        user adminUser = new adminUser("user1", "qwerty", "User1 User1", "user1@mystore.com");
        user buyerUser = new buyerUser("user2", "qwerty", "User2 User2", "user2@mystore.com");
        System.out.println(adminUser);
        System.out.println(buyerUser);

        store someStore = new store();

        product rice = new groceries("0001", "rice", 0.10, 0.20, 0.10, 20.0);
        product shirts = new clothes("0002", "Shirts", 25.0, 35.0, "L", "Banana");
        product hat = new clothes("0003", "Hat", 15.0, 45.0, "M", "Papaya");

        System.out.println("I am adding products!");
        someStore.addProduct(rice);
        someStore.addProduct(shirts);
        someStore.addProduct(hat);

        System.out.println("I am searchin for product  0001");
        System.out.println(someStore.getProduct("0001"));


        System.out.println("List of products!");
        System.out.println(someStore.ListProduct());


        System.out.println("Updating product 0002");
        product shirtNew = new clothes("0002", "Shirts", 30.0, 35.0, "S", "Banana");
        someStore.updateProduct(shirtNew);

        System.out.println("List of products!");
        System.out.println(someStore.ListProduct());


    }
}