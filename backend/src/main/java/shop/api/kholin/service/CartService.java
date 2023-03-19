package shop.api.kholin.service;

import shop.api.kholin.entity.Cart;
import shop.api.kholin.entity.ProductInOrder;
import shop.api.kholin.entity.User;

import java.util.Collection;


public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
