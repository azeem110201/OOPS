class CleaningData {
    // public CleaningData(String dataset){ 



        // if we add CleaningData constructor,
        // then Transformation class will not get executed because CleaningData need one
        // argument which Transformation data is not giving. So modification has to be
        // done  
        

    // }
    public void removeNanValues() {
        System.out.println("Removing nan values");
    }
}

class Transformation extends CleaningData {
    public void transformingData() {
        System.out.println("scaling and transforming data");
    }
}

class InCorrect {
    public static void main(String[] args) {
        Transformation transformation = new Transformation();
        transformation.removeNanValues();
        transformation.transformingData();
    }

}
