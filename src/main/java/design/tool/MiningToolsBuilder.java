package tool;

public interface MiningToolsBuilder {
    MiningTool miningTool = new MiningTool();
    void buildName(String n);
    void buildDurability();
    MiningTool getResult();
}
