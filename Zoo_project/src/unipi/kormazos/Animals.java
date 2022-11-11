package unipi.kormazos;

import java.io.Serializable;

public class Animals extends MainClass implements Serializable {
    private int code;
    private String name;
    private String sex;
    private int age;
    private double height;
    private double weight;
    private double food;
    private double water;
    private double feeding;

    public Animals(int code, String name, String sex, int age, double height, double weight, double food, double water, double feeding) {
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.food = food;
        this.water = water;
        this.feeding = feeding;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getWater() {
        return water;
    }

    public double getFeeding() {
        return feeding;
    }

    public void setFeeding(double feeding) {
        this.feeding = feeding;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", food=" + food +
                ", water=" + water +
                ", feeding=" + feeding +
                '}';
    }

}
