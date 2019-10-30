package design.observer;

import design.task.observer.Daily;
import design.task.observer.DailyObserver;
import design.task.observer.WeekObserver;
import org.junit.Test;

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
}
