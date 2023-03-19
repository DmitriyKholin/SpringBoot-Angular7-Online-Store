package shop.api.kholin.service;

import shop.api.kholin.entity.ProductInOrder;
import shop.api.kholin.entity.User;


public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
