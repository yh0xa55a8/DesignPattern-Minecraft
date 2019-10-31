
package design.observer;

import design.mine.backpack.BackpackFacadeImpl;
import design.mine.smelter.SmelterObserverImpl;
import org.junit.Test;


import design.task.observer.Daily;
import design.task.observer.DailyObserver;
import design.task.observer.WeekObserver;


public class ObserverTest {
    @Test
    public void test(){
        Daily daily=new Daily();

        DailyObserver dailyObserver = new DailyObserver(daily);
        WeekObserver weekObserver =new WeekObserver(daily);
        daily.setState(1);


        dailyObserver.show();
        weekObserver.show();

        daily.updateState();

        dailyObserver.show();
        weekObserver.show();

    }
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





