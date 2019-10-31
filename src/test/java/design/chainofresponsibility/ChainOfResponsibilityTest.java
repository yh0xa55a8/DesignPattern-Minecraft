package design.chainofresponsibility;

import design.mine.backpack.BackpackFacadeImpl;
import design.mine.mine.*;
import org.junit.Test;

public class ChainOfResponsibilityTest {
    private BackpackFacadeImpl backpack = new BackpackFacadeImpl();

    @Test
    public void testMineralChain(){
        UseToolsServiceMineralImpl iron = new UseIronShovel(backpack);
        UseToolsServiceMineralImpl copper = new UseCopperShovel(backpack);
        UseToolsServiceMineralImpl aluminum = new UseAluminumShovel(backpack);
        iron.setNext(copper);
        copper.setNext(aluminum);
        iron.chooseMineral("铝矿区");
    }

    @Test
    public void testMineralChain2(){
        UseToolsServiceMineralImpl iron = new UseIronShovel(backpack);
        UseToolsServiceMineralImpl copper = new UseCopperShovel(backpack);
        UseToolsServiceMineralImpl aluminum = new UseAluminumShovel(backpack);
        iron.setNext(copper);
        copper.setNext(aluminum);
        iron.chooseMineral("铁矿区");
    }

    @Test
    public void testMineralChain3(){
        UseToolsServiceMineralImpl iron = new UseIronShovel(backpack);
        UseToolsServiceMineralImpl copper = new UseCopperShovel(backpack);
        UseToolsServiceMineralImpl aluminum = new UseAluminumShovel(backpack);
        iron.setNext(copper);
        copper.setNext(aluminum);
        iron.chooseMineral("铜矿区");
    }

    @Test
    public void testDiamondChain(){
        UseToolsServiceGemImpl diamond = new UseDiamondShovel(backpack);
        diamond.chooseMineral("钻石矿区");
    }
}
