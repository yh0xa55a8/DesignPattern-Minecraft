package design.flyweight;

import design.home.tile.*;
import org.junit.Before;
import org.junit.Test;

public class FlyweightTest {



    @Test
    public void test(){



        TileFlyweightFactory factory =new TileFlyweightFactory();
        Property property1 = new Property("波纹","黄色");
        Property property2 = new Property("横纹","红色");
        TileFlyweightImpl flyweight01 = factory.getTile(property1);
        TileFlyweightImpl flyweight02 = factory.getTile(property1);
        TileFlyweightImpl flyweight03 = factory.getTile(property1);
        TileFlyweightImpl flyweight11 = factory.getTile(property2);
        TileFlyweightImpl flyweight12 = factory.getTile(property2);
        TileFlyweightImpl flyweight13 = factory.getTile(property2);

        flyweight01.decorate(new Tile("木质",0,0));
        flyweight02.decorate(new Tile("木质",0,1));
        flyweight03.decorate(new Tile("木质",0,2));
        flyweight11.decorate(new Tile("木质",1,0));
        flyweight12.decorate(new Tile("木质",1,1));
        flyweight13.decorate(new Tile("木质",1,2));
        Tile tile= new Tile("木质",3,3);

        Property property3 = new Property(null,null);
        TileFlyweightImpl flyweight =factory.getTile(property3);

        flyweight.show(tile);

    }

}
