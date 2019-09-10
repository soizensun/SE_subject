package cashRegisterConfigAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashRegisterMain {
    public static void main(String[] args) {

        // in usually we decare object in this main but spring can help
        ApplicationContext context = new ClassPathXmlApplicationContext("configAnnotationCR.xml");

        CashRegister register = context.getBean(CashRegister.class);

        register.recordPurchase(100);
        System.out.println(register.getTotal());
    }

}

