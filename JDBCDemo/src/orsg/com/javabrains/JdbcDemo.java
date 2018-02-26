package orsg.com.javabrains;

import org.com.javabrains.dao.JdbcDaoImpl;
import org.com.javabrains.dao.SimpleJdbcDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import orsg.com.javabrains.model.Circle;

public class JdbcDemo {

	public static void main(String[] args) {
		System.out.println("main class");
		// TODO Auto-generated method stub
		//Circle circle=null;
		//int x =1;
		ApplicationContext ctx =new ClassPathXmlApplicationContext("Spring.xml");
		//JdbcDaoImpl dao=ctx.getBean("JdbcDaoImpl",JdbcDaoImpl.class);
		
		//JdbcDaoImpl dao=ctx.getBean(JdbcDaoImpl.class);
		
		SimpleJdbcDaoImpl dao=ctx.getBean(SimpleJdbcDaoImpl.class);
		
		//Circle circle=dao.getCircle(1);
		//System.out.println("book name="+circle.getName());
		//System.out.println("book price="+circle.getPrice());
		
		//System.out.println(dao.getCircleName(2));
		//System.out.println(dao.getCircleId("sec"));
		//System.out.println(dao.getCircleName());
		//System.out.println("constructor called");
		//dao.insertCircle(new Circle(6,"jaguar",6,5));
		//dao.createTrianleTable();
		dao.createRectangleTable();
		
		
		
		
		

	}

}
