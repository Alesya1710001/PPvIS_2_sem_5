package model;

public abstract class AbstractIncome {
    protected Money sum;
    protected Category category;

    public abstract void save();
}
