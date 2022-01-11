package Annotations;

	import static java.lang.annotation.ElementType.METHOD;
	import static java.lang.annotation.RetentionPolicy.RUNTIME;

	import java.lang.annotation.Documented;

	import java.lang.annotation.Retention;
	import java.lang.annotation.Target;

	@Documented
	@Retention(RUNTIME)
	@Target(METHOD)
	
	/**
	 * @author Dell
	 *
	 */
	public @interface Employee {
		
		int salary() default 10000;
	

	}

	
