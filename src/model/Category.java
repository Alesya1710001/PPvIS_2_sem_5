package model;

public class Category extends View{

    private double percentage;

    private String name;

    public void calculatePercentage(){};

    @Override
    public void view(){};

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  }
