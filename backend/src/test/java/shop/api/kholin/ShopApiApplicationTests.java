package shop.api.kholin;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import shop.api.kholin.service.impl.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CartServiceImplTest.class,
        CategoryServiceImplTest.class,
        OrderServiceImplTest.class,
        ProductInOrderServiceImplTest.class,
        ProductServiceImplTest.class,
        UserServiceImplTest.class
})
public class ShopApiApplicationTests {

}

