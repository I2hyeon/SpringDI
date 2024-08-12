package ex04.quiz;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    
    public static void main(String[] args) {
        
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("autowired-context.xml");
        
        Computer cp = ctx.getBean("computer", Computer.class);
        cp.computerInfo(); // void 타입이라 호출만 가능함
        
    }

}
