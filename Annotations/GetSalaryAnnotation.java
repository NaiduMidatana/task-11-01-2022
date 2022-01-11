package Annotations;
import java.lang.reflect.Method;
public class GetSalaryAnnotation {


			public static void main(String[] args) throws NoSuchMethodException, SecurityException {
				// TODO Auto-generated method stub
				CustomAnnotation ca = new CustomAnnotation();
				Method m = ca.getClass().getMethod("getSalary");
				Employee em = m.getAnnotation(Employee.class);
				
				System.out.println("Salary of the employee is = " + em.salary());
				
	}

}
