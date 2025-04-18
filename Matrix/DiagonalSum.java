public class DiagonalSum {
// // TimeComplexity O(n^2)
//     public static void printDiagonalSum(int matrix[][]) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == j) {
//                     sum += matrix[i][j];
//                 }
//                 if(i+j == n-1) {
//                     sum += matrix[i][j];
//                 }
//             }
//         }
//         System.out.println(sum);
//     }

// -----------------------------------------------------------------------------------------------------------

// TimeComplexity O(n)
    public static void printDiagonalSum(int matrix[][]) {
        int n = matrix.length;
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += matrix[i][i];

            if(i != n-1-i)
                sum += matrix[i][n-i-1];
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printDiagonalSum(matrix);
    }
}

// condition
// primaryDiagonal = i==j
// secondaryDiagonal = i+j=n-1