package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int r = array1.length;
        int j = array2.length;

        System.out.println("Lowest difference between two array: " + minimumDiff(array1, array2, r, j));
    }

    static int minimumDiff(int[] array1, int[] array2, int r, int j) {

        Arrays.sort(array1);
        Arrays.sort(array2);

        int a1 = 0;
        int a2 = 0;

        int result = Integer.MAX_VALUE;

        while (a1 < r && a2 < j) {

            if (array1[a1] < array2[a2])
                a1++;
            else
                a2++;
        }

        return a1;
    }
}