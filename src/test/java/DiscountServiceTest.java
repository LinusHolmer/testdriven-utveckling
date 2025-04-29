import com.linusholmer.testdrivenutveckling.DiscountService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DiscountServiceTest {

    @Test
    void applyDiscountWhen500(){

        DiscountService discountService = new DiscountService();
        double sum = 500;
        double discount = 10;

        discountService.discount = discount;
        discountService.sum = sum;

        System.out.println(discountService.applyDiscount());

        assertEquals(450, discountService.applyDiscount());

    }

    @Test
    void doNotApplyDiscountWhenUnder500() {
        DiscountService discountService = new DiscountService();
        double sum = 499;
        double discount = 0;

        discountService.sum = sum;
        discountService.discount = discount;

        assertEquals(499, discountService.applyDiscount());

    }
}
