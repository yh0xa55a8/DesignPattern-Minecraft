package mine;

public abstract class UseToolsServiceMineralImpl implements UseToolsService {

    /**
     * 责任链模式
     */
    private UseToolsServiceMineralImpl next;

    public UseToolsServiceMineralImpl getNext() {

        return next;
    }

    public void setNext(UseToolsServiceMineralImpl next) {

        this.next = next;
    }

    public abstract boolean chooseMineral(String mineral);

    public abstract void useTrolleys(String size);

    /**
     * 策略模式抽象方法实现
     */
    public void mineKind(){

    }

    /**
     * 模板模式
     */
    public void TemplateMethod(){

        useDurability();
        generate();
    }

    public abstract void useDurability();

    public abstract void generate();
}
