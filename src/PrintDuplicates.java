public class PrintDuplicates {
    public static void main(String[] args) {

        int arr[] = {4,5,6,4,9,4,2,5,10,2,4,5};

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;

            // skip already checked elements
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyChecked = true;
                    break;
                }
            }
     
            if (alreadyChecked)
            {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }

            if (counter > 0) {
                System.out.println("duplicate number is " + arr[i]
                        + " and is found " + (counter + 1) + " times");
            }
        }
    }
}
