public class Main {

    public static void main(String[] args) {
	    Account a1 = new Account("Ivanov Vasya", 1000, 20);
        PrivAccount a2 = new PrivAccount("Petrov Andrey", 5000, 10, 50);
        a1.print();
        System.out.println("Balance of 180 day:" + a1.calculating(180));
        a2.print();
        System.out.println("Balance of 180 day:" + a2.calculating(180));
        System.out.println("Max amount:" + a2.maxAmount());
    }
}
