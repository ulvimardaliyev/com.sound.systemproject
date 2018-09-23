package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by User on 23-Sep-18.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        CompactDisc compactDisc = applicationContext.getBean(  CompactDisc.class);
        compactDisc.play();
    }
}
