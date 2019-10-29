package design.home.tile;

import java.util.HashMap;

public class TileFlyweightFactory {

    private HashMap<Property,TileFlyweightImpl> tiles=new HashMap<>();

    public TileFlyweightImpl getTile(Property property){
        TileFlyweightImpl tileFlyweight = tiles.get(property);

        if(tileFlyweight!=null){
            property.show();
            System.out.println("的地板已经有了，被成功获取");
        }
        else{
            tileFlyweight =new TileFlyweight(property);
            tiles.put(property,tileFlyweight);
        }

        return tileFlyweight;
    }









}
