package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = {RoyaCD.class, SgtPeppers.class})
@ComponentScan(basePackages = "soundsystem")
public class Config {
}
