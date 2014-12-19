package spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuani21.spring.model.Product;
import com.zhuani21.spring.service.ProductService;

public class ProductServiceTest {

	@Test
	public void testAdd() {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		ProductService productService = (ProductService) act
				.getBean("productService");
		Product p = new Product();
		p.setProductName("香奈儿1");
		p.setPrice(9.9f);
		productService.save(p);
	}

	@Test
	public void testFind() {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		ProductService productService = (ProductService) act
				.getBean("productService");
		Product p = productService.find(1);
		System.out.println(p.getProductName());
	}
}
