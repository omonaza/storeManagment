package backEnd.interfaces;

import backEnd.domain.producs.product;

import java.util.ArrayList;

public interface productControls {
    public void addProduct(product Product);

    public void deleteProduct(product Product);

    public void updateProduct(product UpdatedProduct);

    public ArrayList<product> ListProduct();

    public ArrayList<product> ListProduct(String type);

    public product getProduct(String productNumber);
}
