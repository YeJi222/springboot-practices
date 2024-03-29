package ex03;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ex03.component.MyComponent;

/**
 * SpringBoot Test Integration
 * 
 * Error:
 * SpringBoot Test Integration(SpringBootTest) 에서는
 * @Configuration을 달고 잇는 설정 클래스는 자동으로 스캔하지 못한다 
 * 
 */
@SpringBootTest
public class MyApplicationTest {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
