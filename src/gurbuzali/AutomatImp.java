package gurbuzali;

public class AutomatImp implements IAutomat{

    private double balance = 0;
    private final double kola = 0.15;
    private final double fanta = 0.2;
    private final double gazoz = 0.3;

    public AutomatImp(double balance){
        this.balance = balance;
    }

    public String shopping(int product){
        if (product == 0 && balance >= 0.15) {
            balance -= kola;
            return "kola";
        }
        if (product == 1 && balance >= 0.2) {
            balance -= fanta;
            return "fanta";
        }
        if (product == 2 && balance >= 0.3) {
            balance -= gazoz;
            return "gazoz";
        }
        return "product not found";
    }

    public double getBalance() {
        return balance;
    }
}
