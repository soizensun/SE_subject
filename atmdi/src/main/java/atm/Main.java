package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ATMSimulator atmSimulator = context.getBean("ATMSimulator", ATMSimulator.class);

        atmSimulator.run();


//        DataSource dataSource = new DataSource("customers.txt");
//        Bank bank = new Bank(dataSource);
//        ATM atm = new ATM(bank);
//        ATMSimulator atmSimulator = new ATMSimulator(atm);
//        atmSimulator.run();

    }
}
