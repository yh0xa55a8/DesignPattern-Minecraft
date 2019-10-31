package mine;

public abstract class UseToolsServiceGemImpl implements UseToolsService{

    public abstract void chooseMineral(String mineral);

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
