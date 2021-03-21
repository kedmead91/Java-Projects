public class SelectionSort {
    // uses selection sort to swap numbers in the list until the biggest is at index 0
    public static void selectionSort(double[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[index]){
                    index = j;//searching for highest index
                }
            }
            double largestNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = largestNumber;
        }
    }

    public static void main(String[] a){

        // takes the array and prints it to the console biggest first

        double[] arr1 = {150.00, 200.00, 154.98, 335.01, 475.12, 555.87, 216.38};

        selectionSort(arr1);//sorting array using selection sort
        System.out.println("Sorted List Largest to Smallest: ");
        for(double i:arr1){
            System.out.print(i+" ");



        }
    }

    }

