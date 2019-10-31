package tool;

import java.util.ArrayList;

public class MiningToolsCompositeImpl implements MiningToolsComposite {
    private ArrayList<MiningTool> miningToolsList = new ArrayList<>();

    public ArrayList<MiningTool> getMiningToolsList(){
        return miningToolsList;
    }

    @Override
    public void add(MiningTool t) {
        miningToolsList.add(t);
    }

    @Override
    public void remove(int index) {
        miningToolsList.remove(index);
    }
}
