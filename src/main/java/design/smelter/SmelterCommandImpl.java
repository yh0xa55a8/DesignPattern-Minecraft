package smelter;

import tool.*;
import java.util.HashMap;

public class SmelterCommandImpl extends SmelterCommand{
    public void forgeTools(HashMap<String, Integer> mine, MiningToolsCompositeImpl tools, String mineName){
        //矿石列表减少矿石
        int number  = mine.get(mineName);
        String toolName = "";
        switch (mineName){
            case "钻石矿石":
                number = number - 4;
                toolName = "钻石镐";
                break;
            case "铁矿":
                number = number - 6;
                toolName = "铁镐";
                break;
            case "铜矿":
                number = number - 8;
                toolName = "铜镐";
                break;
            case "铝矿":
                number = number - 10;
                toolName = "铝镐";
                break;
            default:
                break;
        }
        mine.put(mineName, number);

        //工具列表增添工具
        MiningToolsBuilder builder = new MiningToolsBuilderImpl();
        MiningToolsDirector director = new MiningToolsDirector(builder);
        MiningTool tool = director.construct(toolName);
        tools.add(tool);

        System.out.println("制造成功！");
    }
}