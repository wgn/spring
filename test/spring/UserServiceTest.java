package spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuani21.spring.model.User;
import com.zhuani21.spring.service.UserService;

public class UserServiceTest {

	@Test
	public void test() {
		BeanFactory beanFactory = null;

		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService) act.getBean("userService");
		User u = new User();
		u.setUsername("admin");
		u.setPassword("1234");
		userService.add(u);
		
		act.destroy();
	}

}
