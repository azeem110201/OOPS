class Correct {
    public void washingWhiteClothes(){
        washing();
        System.out.println("Adding white clothes");
        finalSteps();
    }

    public void washingColoredClothes(){
        washing();
        System.out.println("Adding colored clothes");
        finalSteps();
    }

    public void washing(){
        System.out.println("Starting the machine...");
        System.out.println("Pourning some water...");
        System.out.println("Adding detergent...");
    }

    public void finalSteps(){
        System.out.println("Drying clothes");
        System.out.println("Switching off the machine");
    }
}
