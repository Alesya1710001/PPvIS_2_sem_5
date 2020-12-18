package model;

import java.util.Arrays;

public class BudgetManager extends View{

     private Settings settings;

    private Account[] users;
    private Account currentUser;

    public void addUser(Credentials user){};
    public boolean signIn(String login, String password){return true;};
    public void logOut(){};
    public void changeSettings(){};

    private void convertCurrency(){};
    private void changeLanguage(){};

    @Override
    public void view(){};

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Account[] getUsers() {
        return users;
    }

    public void setUsers(Account[] users) {
        this.users = users;
    }

    public Account getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Account currentUser) {
        this.currentUser = currentUser;
    }
}
