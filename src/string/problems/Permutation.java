package string.problems;

public class Permutation {
    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generatePermutation(str, 0, len);
    }
    public static void generatePermutation(String str, int start, int end)
    {
        if (start == end-1)
            System.out.println(str);
            else
            {
                for (int i = start; i < end; i++)
                {
                    str = swapString(str,start,i);
                    //Recursively calling function generatePermutation() for rest of the characters
                    generatePermutation(str,start+1,end);
                    //Backtracking and swapping the characters again.
                    str = swapString(str,start,i);
                }
            }

        }
    }



