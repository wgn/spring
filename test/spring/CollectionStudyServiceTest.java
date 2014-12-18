package spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuani21.spring.service.CollectionStudyService;

public class CollectionStudyServiceTest {
	@SuppressWarnings("resource")
	@Test
	public void test() {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		CollectionStudyService collectionStudy = (CollectionStudyService) act
				.getBean("collectionStudy");
		collectionStudy.p();
	}
}
