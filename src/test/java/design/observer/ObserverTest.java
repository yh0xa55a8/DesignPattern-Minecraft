package design.observer;

import design.mine.backpack.BackpackFacadeImpl;
import design.mine.smelter.SmelterObserverImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverTest {
    private BackpackFacadeImpl backpackFacade = new BackpackFacadeImpl();

    @Test
    public void judgeMineListTest() {
        SmelterObserverImpl smelterObserver = new SmelterObserverImpl(backpackFacade);
        smelterObserver.judgeMineList(backpackFacade.getMineralList(), "铁矿");
    }

    @Test
    public void operateTest() {
        SmelterObserverImpl smelterObserver = new SmelterObserverImpl(backpackFacade);
        smelterObserver.operate("铁矿");
    }
}