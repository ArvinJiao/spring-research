package star.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CupAspect {
	
	Logger log = LoggerFactory.getLogger(CupAspect.class);
	
	@Pointcut("execution(* star.spring.aop.CupService.drink(..))")
	public void pointCutMethod(){
		log.info("pointCutMethod.............");
	}
	
	@Before("pointCutMethod()")
	public void doBefore(){
		log.info("doBefore.......");
	}
	
	@AfterReturning(pointcut = "pointCutMethod()", returning="result")
	public void doAfterReturing(String result){
		log.info("result:"+result);
		log.info("doAfterReturing..........");
	}
	
    //声明例外通知  
    @AfterThrowing(pointcut = "pointCutMethod()", throwing = "e")  
    public void doAfterThrowing(Exception e) {  
        System.out.println("例外通知");  
        System.out.println(e.getMessage());  
    }  
  
    //声明最终通知  
    @After("pointCutMethod()")  
    public void doAfter() {  
        System.out.println("最终通知");  
    }  
  
    //声明环绕通知  
    @Around("pointCutMethod()")  
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
        System.out.println("进入方法---环绕通知");  
        Object o = pjp.proceed();  
        System.out.println("退出方法---环绕通知");  
        return o;  
    }

}
