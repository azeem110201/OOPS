class Car {
    private Engine engine;

    Car() {
        this.engine = new Engine();
        this.engine.turnOnEngine();
    }

    public void running() {
        System.out.println("The car is running");
    }
}

class Engine {
    private boolean isOn;

    Engine() {
        this.isOn = false;
    }

    public void turnOnEngine() {
        this.isOn = true;
        System.out.println("Engine is turned on");
    }
}

class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.running();
    }

}
