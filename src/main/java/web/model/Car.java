package web.model;

public class Car {
    private String mark;
    private String model;
    private int speed;
    public Car(){
    }

    public Car(String mark, String model, int speed) {
        this.mark = mark;
        this.model = model;
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
