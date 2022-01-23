class Bike {
    private boolean isEngineOn;    // cannot be accessed outside the class
    

    // all public variables and methods can be accessed from anywhere
    public Bike() {                // default constructor
        this.isEngineOn = false;
    }

    public Bike(boolean isEngineOn) {     // parameterised constructor
        this.isEngineOn = isEngineOn;
    }

    //signature of method <access-modifier> return-type function-name <(function parameters)>

    public void turnOnEngine() {          
        this.isEngineOn = true;
        System.out.println("Engine is started");
    }

    public void runBike() {
        if (this.isEngineOn == true) {
            System.out.println("Bike is running");
        } else {
            System.out.print("First turning on the engine automatically...");
            turnOnEngine();
            System.out.println("Bike is running");
        }
    }

    public void turnOffEngine() {
        this.isEngineOn = false;
        System.out.println("Engine is turned off");
    }

    public void stopBike() {
        if (this.isEngineOn == false) {
            System.out.println("Engine is off");
            return;
        }
        System.out.println("Applying Brake to stop the bike");
        turnOffEngine();
    }
}

class Demo {
    public static void main(String[] args) {
        //creating object of type Bike 
        Bike b = new Bike();
        //calling the public methods runBike and stopBike
        b.runBike();
        b.stopBike();
    }
}