
public class PrivAccount extends Account {
    int percent;

    public PrivAccount(String fullName, int inAmout, int rate, int percent) {
        super(fullName, inAmout, rate);
        this.percent = percent;
    }

    public int maxAmount(){
        return this.initialAmount + this.initialAmount * this.percent / 100;
    }

    public void print(){
        System.out.println("FIO-" + this.fio + "; Initial Amount- " + this.initialAmount + "; Rate-" + this.rate + "; Percent-" + this.percent + ";");
    }
}
