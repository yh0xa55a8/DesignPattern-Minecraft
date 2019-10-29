package design.home.decorate;

public class Decoration implements MyHomeImpl {
    MyHomeImpl myHomeImpl;

    public Decoration(MyHomeImpl myHomeImpl){
        this.myHomeImpl =myHomeImpl;
    }

    @Override
    public void show() {
        myHomeImpl.show();
    }
}
