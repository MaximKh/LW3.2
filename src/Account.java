public class Account {
    String fio;
    int initialAmount;
    int rate;

    public Account(String fullName, int inAmout, int rate){
        this.fio = fullName;
        this.initialAmount = inAmout;
        this.rate = rate;
    }

    public int calculating(int days){
        return this.initialAmount + this.initialAmount * this.rate / 100 * days / 365;
    }

    public void print(){
        System.out.println("FIO-" + this.fio + "; Initial Amount- " + this.initialAmount + "; Rate-" + this.rate + ";");
    }
}
