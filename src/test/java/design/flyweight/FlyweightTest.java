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
        //新建一种地板样式，加入HashMap
        TileFlyweightInterface flyweight01 = factory.getTile(property1);
        TileFlyweightInterface flyweight02 = factory.getTile(property1);
        TileFlyweightInterface flyweight03 = factory.getTile(property1);
        TileFlyweightInterface flyweight11 = factory.getTile(property2);
        TileFlyweightInterface flyweight12 = factory.getTile(property2);
        TileFlyweightInterface flyweight13 = factory.getTile(property2);
        //使用HashMap中的"样式"实例创建"地板"实例
        flyweight01.decorate(new Tile("木质",0,0));
        flyweight02.decorate(new Tile("木质",0,1));
        flyweight02.decorate(new Tile("铜质",0,1));
        flyweight03.decorate(new Tile("木质",0,2));
        flyweight11.decorate(new Tile("木质",1,0));
        flyweight12.decorate(new Tile("木质",1,1));
        flyweight13.decorate(new Tile("木质",1,2));
        //赋予"地板"实例详细信息

        Tile tile= new Tile("木质",3,3);

        Property property3 = new Property(null,null);
        TileFlyweightInterface flyweight =factory.getTile(property3);

        flyweight.show(tile);

    }

}
