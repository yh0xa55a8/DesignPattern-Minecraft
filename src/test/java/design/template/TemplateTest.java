package design.template;

import design.mine.backpack.BackpackFacadeImpl;
import design.mine.mine.*;
import org.junit.Test;

public class TemplateTest {

    private BackpackFacadeImpl backpack = new BackpackFacadeImpl();
    @Test
    public void testGemTemplate(){
        UseToolsServiceGemImpl gemTm = new UseDiamondShovel(backpack);
        gemTm.TemplateMethod();
    }

    @Test
    public void testMineralIronTemplate(){
        UseToolsServiceMineralImpl mineralIronTm = new UseIronShovel(backpack);
        mineralIronTm.TemplateMethod();
    }

    @Test
    public void testMineralCopperTemplate(){
        UseToolsServiceMineralImpl mineralCopperTm = new UseCopperShovel(backpack);
        mineralCopperTm.TemplateMethod();
    }

    @Test
    public void testMineralAluminumTemplate(){
        UseToolsServiceMineralImpl mineralAlTm = new UseAluminumShovel(backpack);
        mineralAlTm.TemplateMethod();
    }
}
