package th.ku.emailtemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateTest {

    @Test
    void testEvaluateOneVariable(){
        Template template = new Template("Hello, ${name}");
        template.set("name", "millizen");

        String emailBody = template.evaluate();
        assertEquals("Hello, millizen", emailBody);
    }

    @Test
    void testEvaluateDifferentVariable() {
        Template template = new Template("hi!, ${name}");
        template.set("name", "milliamp");

        String emailBody = template.evaluate();
        assertEquals("hi!, milliamp", emailBody);
    }


}
