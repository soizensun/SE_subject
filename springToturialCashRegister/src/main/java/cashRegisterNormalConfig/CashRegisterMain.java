package cashRegisterNormalConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashRegisterMain {
    public static void main(String[] args) {

        // in usually we decare object in this main but spring can help
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


        CashRegister register = context.getBean("cashRegisterNormalConfig", CashRegister.class);


        register.recordPurchase(100);
        System.out.println(register.getTotal());
    }

}

