public class LargestNumber {
    // uses selection sort method to sort the list smallest to biggest
    public static double getLargest(double[] a, double total){
        double temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a[(int) (total-1)];
    }
    public static void main(String[] args){

        double[] a ={150.00, 200.00, 154.98, 335.01, 475.12, 555.87, 216.38};

        // after list is sorted it minuses 1 from the total then prints the largest value in pounds
        System.out.println("The Largest Value is: £"+getLargest(a,7));

    }
}
