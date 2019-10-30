package design.task;


//proxy
public class TaskProxy implements TaskInterface {


    private Task task;

    @Override
    public void show() {

        if(task==null){
            task =new Task();
        }
        task.show();
    }



}
