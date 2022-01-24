import sorting.Sorting;

class selectionSort {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        double[] nums = sort.selectionSort(new double[]{88,66,102,32,41,23,5,69,66});
        for (double i : nums) {
            System.out.print(i + " ");
        }
    }
    
}
