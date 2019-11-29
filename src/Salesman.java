public class Salesman implements IBank {

    private IBank iBank;

    public Salesman(IBank iBank) {
        this.iBank = iBank;
    }

    @Override
    public void apply() {
        System.out.println("协助办理开户");
        iBank.apply();
        System.out.println("业务完毕");
    }
}
