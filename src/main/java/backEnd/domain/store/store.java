package backEnd.domain.store;

import backEnd.domain.producs.product;
import backEnd.domain.users.user;
import backEnd.interfaces.productControls;
import backEnd.interfaces.userControls;

import java.util.ArrayList;

public class store implements productControls, userControls {

    ArrayList<product> products = new ArrayList<product>();
    ArrayList<user> users = new ArrayList<user>();

    public store(){

    }

    public void addProduct(product Product) {
        products.add(Product);

    }

    public void deleteProduct(product Product) {
        products.remove(Product);

    }

    public void updateProduct(product UpdatedProduct) {
        // find product by productNumber
        // update its fields
        // save it
        product oldProduct = getProduct(UpdatedProduct.getProductNumber());
        products.remove(oldProduct);
        products.add(UpdatedProduct);

    }

    public ArrayList<product> ListProduct() {
        return products;
    }

    public ArrayList<product> ListProduct(String type) {
        return null;
    }

    public product getProduct(String productNumber) {
        product p = null;
        for (product Product: products) {
            if (Product.getProductNumber().equals(productNumber))
                p = Product;
        }
        return p;

    }

    public void register(user user) {

    }

    public boolean login(String username, String password) {
        return false;
    }
}
