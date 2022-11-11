package unipi.kormazos;

public class Fishes extends  Animals{
    private int depth;

    public Fishes(int code, String name, String sex, int age, double height, double weight, double food, double water, double feeding, int depth) {
        super(code, name, sex, age, height, weight, food, water, feeding);
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
