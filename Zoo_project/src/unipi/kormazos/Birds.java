package unipi.kormazos;

public class Birds extends Animals {
    private int fly;

    public Birds(int code, String name, String sex, int age, double height, double weight, double food, double water, double feeding, int fly) {
        super(code, name, sex, age, height, weight, food, water, feeding);
        this.fly = fly;
    }

    public int getFly() {
        return fly;
    }

    public void setFly(int fly) {
        this.fly = fly;
    }
}
