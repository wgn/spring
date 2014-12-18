package spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuani21.spring.model.User;
import com.zhuani21.spring.service.LoginService;

public class LoginServiceTest {

	@Test
	public void test() {
		BeanFactory bf = null;

		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		LoginService loginService = (LoginService) act.getBean("loginService");

		loginService.checkUser(new User());

		act.destroy();
	}
}
