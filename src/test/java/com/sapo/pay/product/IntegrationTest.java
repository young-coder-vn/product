package com.sapo.pay.product;

import com.sapo.pay.product.ProductApp;
import com.sapo.pay.product.RedisTestContainerExtension;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = ProductApp.class)
@ExtendWith(RedisTestContainerExtension.class)
public @interface IntegrationTest {
}
