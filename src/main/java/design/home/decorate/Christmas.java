package design.home.decorate;

public class Christmas extends Decoration {

    public Christmas(MyHomeImpl myHomeImpl){
        super(myHomeImpl);
    }

    @Override
    public void show() {
        setDecoration();
        super.show();
    }


    public void setDecoration(){
        ((OriginalHome) super.myHomeImpl).setName("圣诞节气氛的家");
    }
}
