import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.CartPage;
import page_object.HeaderPage;
import page_object.HomePage;
import page_object.ProductPage;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import static constans.Colors.BLUE;
import static constans.Messages.COUPON_IS_APPLIED;
import static constans.Messages.COUPON_IS_NOT_APPLIED;
import static constans.Products.CAP;
import static constans.Products.HOODIE;

@Slf4j
public class CouponTest {

    private final WebDriver driver = LocalDriverManager.getInstance();

    HeaderPage header = new HeaderPage();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @BeforeEach
    public void init() {

        log.info("Step 1: user go to the Online shop page");
        driver.get(PropertiesReader.getProperties().getProperty("home.page"));

    }

    @Test
    public void applyCouponCode() {

        log.info("Step 2: User select product by product name: " + CAP);
        homePage.clickOnProduct(CAP);

        log.info("Step 3: User click to Add to cart button");
        productPage.addProductToCart();

        log.info("Step 4: User click to View cart button");
        productPage.viewCart();

        log.info("Step 5: User add coupon code in Coupon code field");
        cartPage.enterCoupon("additional_discount_2");

        log.info("Step 6: User click to Apply coupon button");
        cartPage.applyCoupon();

        log.info("Step 7: Coupon code not valid");
        cartPage.checkErrorMessage(COUPON_IS_NOT_APPLIED);

        System.out.println();


    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}