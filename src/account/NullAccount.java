package account;

public class NullAccount extends Account{

    public NullAccount() {
        super("NULL ACCOUNT", -1, null, -1);
    }

    @Override
    public Boolean deposit(double depositAmount) {
        System.out.println("Cannot deposit into a null account");
        return false;
    }

    @Override
    public Boolean withdraw(double withdrawAmount) {
        System.out.println("Cannot withdraw from a null account");
        return false;
    }
}
