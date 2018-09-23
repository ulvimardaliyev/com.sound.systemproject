package soundsystem;

import org.springframework.stereotype.Component;

@Component("R")
public class RoyaCD implements CompactDisc {
    public void play() {
        System.out.println("Seninem");
    }
}
