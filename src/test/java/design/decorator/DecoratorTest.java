package design.decorator;

import design.home.decorate.*;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void test(){
        MyHomeImpl home = new OriginalHome();
        home.show();
        MyHomeImpl home2 =new SpringFestival(home);
        home2.show();
        MyHomeImpl home1 =new Christmas(home);
        home1.show();
        home1 =new SpringFestival(home);
        home.show();
        home1.show();
    }
}
