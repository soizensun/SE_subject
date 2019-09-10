package atmDiJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        ATMSimulator atmSimulator = context.getBean(ATMSimulator.class);

        atmSimulator.run();


//        DataSource dataSource = new DataSource("customers.txt");
//        Bank bank = new Bank(dataSource);
//        ATM atmNormalConfig = new ATM(bank);
//        ATMSimulator atmSimulator = new ATMSimulator(atmNormalConfig);
//        atmSimulator.run();

    }
}
