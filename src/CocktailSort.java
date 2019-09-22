public class CocktailSort {

    public static int [] sort (int [] array) {
        int[] newArray = array;
        int left = 0; // left element
        int right = array.length - 1; // right element

        do {
            //left to right
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array [i+1];
                    array[i+1] = temp;
                }
            }
            right--; // decrease right
            //right to left
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    int temp2 = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp2;

                }
            }
            left++; // increase left

        }
        while (left <= right);
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 8, 1, 0, 6, 4, 6, 7,10,-1,0,-6};
        array = sort(array);
        for (int i : array) System.out.print(i + " ");
    }
}
