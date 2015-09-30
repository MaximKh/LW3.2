public class Account {
    String fio;
    int initialAmount;
    int rate;

    public void account(String fullName, int inAmout, int rate){
        this.fio = fullName;
        this.initialAmount = inAmout;
        this.rate = rate;
    }
}
