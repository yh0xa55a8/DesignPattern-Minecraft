package design.home.decorate;

public class SpringFestival extends Decoration {

    public SpringFestival(MyHomeImpl myHomeImpl){
        super(myHomeImpl);
    }

    @Override
    public void show() {
        setDecoration();
        super.show();
    }


    public void setDecoration(){
        ((OriginalHome) super.myHomeImpl).setName("春节气氛的家");
    }
}
