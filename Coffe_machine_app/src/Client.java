public class Client {
    private double cash = 100;

    public double add_cash(double payment){
        this.cash = this.cash + payment;
        return this.cash;
    }

    public double decrease_cash(double payment){
        this.cash = this.cash - payment;
        return this.cash;
    }

    public double getCash() {
        return this.cash;
    }

    public void show_cash(){
        System.out.println("Account balance: " + this.getCash());
    }
}
