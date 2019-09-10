package cashRegisterJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CashRegisterConfig {

    @Bean
    public TaxCalculator cataxCalculator(){
        return new CATaxCalculator();
    }

    @Bean
    public TaxCalculator nytaxCalculator(){
        return new NYTaxCalculator();
    }

    @Bean
    public CashRegister cashRegister(){
        return new CashRegister("CA", cataxCalculator());
    }
}
