package co.edureka;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class After implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName()+" with "+ args.length+" parameteres completed @ "+ new Date());
	}
}
