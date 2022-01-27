interface RemoveNanValues{
    public void removeNanValues();
}

class CleaningData implements RemoveNanValues {
    public void removeNanValues() {
        System.out.println("Removing nan values");
    }

    public void removeOutliers() {
        System.out.println("Removing outliers");
    }
}

class Transformation {
    public void transformingData(CleaningData cd) {
        cd.removeNanValues();
        System.out.println("scaling and transforming data");
    }
}


class Correct {
    public static void main(String[] args) {
        CleaningData cd = new CleaningData();
        Transformation transformation = new Transformation();
        
        transformation.transformingData(cd);
    }    
}
