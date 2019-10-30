package design.task;

//proxy
public class Task implements TaskInterface {


    @Override
    public void show() {

        System.out.println("我要开始访问了");

    }
}
