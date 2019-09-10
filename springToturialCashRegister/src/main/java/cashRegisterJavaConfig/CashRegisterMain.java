package cashRegisterJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashRegisterMain {
    public static void main(String[] args) {

        // in usually we decare object in this main but spring can help
        ApplicationContext context = new AnnotationConfigApplicationContext(CashRegisterConfig.class);


        CashRegister register = context.getBean(CashRegister.class);


        register.recordPurchase(200);
        System.out.println(register.getTotal());
    }

}

