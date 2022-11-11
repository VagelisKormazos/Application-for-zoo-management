package unipi.kormazos;

public class Mammals extends Animals{
    private int pregnancy;

    public Mammals(int code, String name, String sex, int age, double height, double weight, double food, double water, double feeding, int pregnancy) {
        super(code, name, sex, age, height, weight, food, water, feeding);
        this.pregnancy = pregnancy;
    }

    public int getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(int pregnancy) {
        this.pregnancy = pregnancy;
    }
}
