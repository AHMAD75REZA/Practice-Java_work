// A recursive solution for subset sum
// problem
class GFG {
 
    // Returns true if there is a subset
    // of set[] with sum equal to given sum
    static boolean isSubsetSum(int set[],
                               int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
 
        // If last element is greater than
        // sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);
 
        /* else, check if sum can be obtained
        by any of the following
            (a) including the last element
            (b) excluding the last element */
        return isSubsetSum(set, n - 1, sum)
            || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }
 
    /* Driver code */
    public static void main(String args[])
    {
        int set[] = { 1, 2, 5, 6,8 };
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("1,2,6"
                               + " 1,8");
        else
            System.out.println("No subset with"
                               + " given sum");
    }
}
 
/* This code is contributed by Rajat Mishra */