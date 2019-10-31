package design.strategy;

import design.mine.backpack.BackpackFacadeImpl;
import design.mine.mine.*;
import org.junit.Test;

public class StrategyTest {

    private BackpackFacadeImpl backpack = new BackpackFacadeImpl();
    @Test
    public void testIronStrategy(){
        Mine mine = new Mine();
        UseToolsService strategyService = new UseIronShovel(backpack);
        mine.setStrategy(strategyService);
        mine.mineKind();
    }

    @Test
    public void testCopperStrategy(){
        Mine mine = new Mine();
        UseToolsService strategyService = new UseCopperShovel(backpack);
        mine.setStrategy(strategyService);
        mine.mineKind();
    }

    @Test
    public void testAlStrategy(){
        Mine mine = new Mine();
        UseToolsService strategyService = new UseAluminumShovel(backpack);
        mine.setStrategy(strategyService);
        mine.mineKind();
    }

    @Test
    public void testDiamondStrategy(){
        Mine mine = new Mine();
        UseToolsService strategyService = new UseDiamondShovel(backpack);
        mine.setStrategy(strategyService);
        mine.mineKind();
    }
}
