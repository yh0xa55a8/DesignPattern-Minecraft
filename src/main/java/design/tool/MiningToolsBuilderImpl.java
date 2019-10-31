package tool;

public class MiningToolsBuilderImpl implements MiningToolsBuilder{

    @Override
    public void buildName(String n) {
        miningTool.setName(n);
    }

    @Override
    public void buildDurability() {
        miningTool.setDurability(100);
    }

    @Override
    public MiningTool getResult() {
        return miningTool;
    }
}
