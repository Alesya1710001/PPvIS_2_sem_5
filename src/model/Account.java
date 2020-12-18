package model;

import java.util.Arrays;

public class Account extends View {
    private Credentials credentials;
    private Expenditure[] expenditure;
    private Income[] income;
    private Category[] categories;

    public void addExpenditure(Expenditure expenditure){};
    public void addIncome(Income income){};
    public void addCategory(Category category){};
    public void viewCurrentBudget(){};
    public Expenditure[] getExpenditure(){return expenditure;};
    public Income[] getIncome(){return income;};
    public Category[] getCategories(){return categories;};

    public void save(){};

    @Override
    public void view(){ };


    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public void setExpenditure(Expenditure[] expenditure) {
        this.expenditure = expenditure;
    }

    public void setIncome(Income[] income) {
        this.income = income;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }
}
