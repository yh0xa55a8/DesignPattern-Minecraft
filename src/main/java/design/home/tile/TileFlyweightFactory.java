package design.home.tile;

import java.util.HashMap;

public class TileFlyweightFactory {

    private HashMap<Property,TileFlyweightInterface> tiles=new HashMap<>();

    //@getTile:查询property实例是不是哈希表的键，如果不是，使用property实例生成TileFlyweight实例并将键值对加入哈希表
    public TileFlyweightInterface getTile(Property property){
        TileFlyweightInterface tileFlyweight = tiles.get(property);

        if(tileFlyweight!=null){
            property.show();
            System.out.println("样式的地板已经有了，被成功获取");
        }
        else{
            tileFlyweight =new TileFlyweight(property);
            tiles.put(property,tileFlyweight);
        }

        return tileFlyweight;
    }









}
