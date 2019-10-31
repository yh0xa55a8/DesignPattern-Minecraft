package design.mine.trolley;

public abstract class Trolley {
    protected Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public abstract String getSize();

}
