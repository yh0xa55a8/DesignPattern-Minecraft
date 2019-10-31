package smelter;

import tool.MiningToolsCompositeImpl;

import java.util.HashMap;

abstract class SmelterCommand {
    // 锻造工具
    abstract void forgeTools(HashMap<String, Integer> mine, MiningToolsCompositeImpl tools, String mineName);
}