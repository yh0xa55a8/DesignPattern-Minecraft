package backpack;

import tool.*;
import java.util.HashMap;

public class BackpackFacadeImpl implements BackpackFacade{
    private HashMap<String, Integer> mineralList = new HashMap<>();
    private MiningToolsCompositeImpl toolList;

    //构造背包，给初始矿石
    public BackpackFacadeImpl(){
        mineralList.put("钻石矿石", 4);
        mineralList.put("铁矿", 6);
        mineralList.put("铜矿", 8);
        mineralList.put("铝矿", 10);
        toolList = new MiningToolsCompositeImpl();
    }

    public HashMap<String, Integer> getMineralList(){
        return mineralList;
    }

    public MiningToolsCompositeImpl getToolList(){
        return toolList;
    }

    @Override
    public void addTool(MiningTool t) {
        toolList.add(t);
    }

    @Override
    public void removeTool(int index) {
        toolList.remove(index);
    }

    @Override
    public void addMineral(String name, int num) {
        int count  = mineralList.get(name);
        count = count + num;
        mineralList.put(name, count);
    }

    @Override
    public void removeMineral(String name, int num) {
        int count = mineralList.get(name);
        count = count - num;
        mineralList.put(name, count);
    }

}
