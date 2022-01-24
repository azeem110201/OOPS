class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int nums[]) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    public double add(double a, double b) {
        return a + b;

    }

    public double add(double a, double b, double c) {
        return a + b + c;

    }

    public double add(double nums[]) {
        double sum = 0;
        for (double i : nums) {
            sum += i;
        }
        return sum;
    }

    public String add(String a, String b) {
        return a + " " + b;

    }

}

class Overloading {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(3, 5));
        System.out.println(addition.add(3.6, 5.8));
        System.out.println(addition.add(3, 5, 8));
        System.out.println(addition.add(1.5, 5.7, 10.8));
        System.out.println(addition.add("Abdul", "Azeem"));
        System.out.println(addition.add(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(addition.add(new double[] { 1.1, 2.2, 3.3, 4.4, 5.5 }));
    }

}
