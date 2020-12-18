package model;

public class Diagram {

    private Category expenditure;
    private double incomesSum;
    private double balance;

    private void calculateIncomesAmount(){}
    private void calculateBalance(){}

    public void view(){}

    public Category getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Category expenditure) {
        this.expenditure = expenditure;
    }

    public double getIncomesSum() {
        return incomesSum;
    }

    public void setIncomesSum(double incomesSum) {
        this.incomesSum = incomesSum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
