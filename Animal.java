package ru.geekbrains.J1Homework5;

public abstract class Animal {//не можем создать экземпляр суперкласса, потоу абстрактный
    protected String name;
    private double averageRun ;
    private double averageJump;
    private double averageSwim;
    private String kindOfAnimal;
    protected int age;
    private static final int currentYear = 2018;

    protected Animal(String name, int age, double averageRun, double averageJump, double averageSwim, String kindOfAnimal) {
        this.name = name;
        this.age = age;
        this.averageRun = averageRun;
        this.averageJump = averageJump;
        this.averageSwim = averageSwim;
        this.kindOfAnimal = kindOfAnimal;
    }

    private static double parameter(double average) {
        double persent = Math.random()*2;
        if (persent <0.8){
            persent = 0.8;
        } else if (persent >1.2){
            persent = 1.2;
        }
    return average*Math.floor(persent*100)/100;//
    }

    protected int getAge() {
        return currentYear - age;
    }

    protected String startRunning(int height) {
        if (parameter(averageRun) == 0 || height == 0) return "\n" + kindOfAnimal + ": " + name + " не стал(а) бежать";
        else if (averageRun >= height) return "\n" + kindOfAnimal + ": " + name + " пробежал(а) " + height + " метров.";
        return "\n" + kindOfAnimal + ": " + name + " пробежал(а) " + parameter(averageRun) + " метров и остановился(лась), дистанция в " + height + " метров не пройдена";
    }

    protected String startJumping(int height) {
        if (averageJump == 0 || height == 0) return "\n" + kindOfAnimal + ": " + name + " не стал(а) прыгать";
        else if (averageJump >= height)
            return "\n" + kindOfAnimal + ": " + name + " перепрыгнул(а) препятствие высотой " + height + " метров.";
        return "\n" + kindOfAnimal + ": " + name + " прыгнул(а) на " + averageJump + " метров и не смог(ла) перепрыгнуть препятствие высотой " + height + " метров.";
    }

    protected String startSwimming(int height) {
        if (parameter(averageSwim) == 0 || height == 0) return "\n" + kindOfAnimal + ": " + name + " не стал(а) плыть";
        else if (parameter(averageSwim) >= height) return "\n" + kindOfAnimal + ": " + name + " проплыл(а) " + height + " метров.";
        return "\n" + kindOfAnimal + ": " + name + " проплыл(а) " + parameter(averageSwim) + " метров и остановился(лась) , дистанция в " + height + " метров не пройдена";
    }
}

