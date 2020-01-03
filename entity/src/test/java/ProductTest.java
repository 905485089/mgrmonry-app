import com.uek.mgrmoney.entity.Product;
import com.uek.mgrmoney.enumeration.ProductStatus;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

public class ProductTest {
    private static Logger logger = Logger.getLogger(Product.class);
    @Test
    public void createProduct(){
        Product product = new Product();
        product.setId("T001");
        product.setName("月光贷");
        product.setStartAmount(BigDecimal.valueOf(1000));
        product.setStatus(ProductStatus.LOCKED);
        product.setCreateAt(new Date());
        product.setCreateUser("ls");
        logger.info(product);
    }
}
