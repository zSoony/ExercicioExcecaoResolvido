package Model;

public class insuficientBalanceException extends IllegalArgumentException {

    public insuficientBalanceException(String msg) {
        super(msg);
    }
}
