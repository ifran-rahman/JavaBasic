package com.company;

abstract class car {
    car() {
        System.out.println("car is created");
    }

    abstract void run();

    void speedup() {
        System.out.println("speed is up");
    }

}

class toyota extends car {
    void run() {
        System.out.println("Toyota is running  smoothly");
    }
}

class Main {
    public static void main(String args[]) {
        car obj = new toyota();
        obj.run();
        obj.speedup();
    }
}
