package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)con.getBean("triangle");
		t.draw();

	}

}
