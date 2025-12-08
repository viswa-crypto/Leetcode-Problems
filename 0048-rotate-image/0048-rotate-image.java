class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        int arr[][] = new int[n][n];
        int x = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = matrix[n-1-j][x];
            }
            x++;
        }
        for(int i=0;i<n;i++)
        {
            matrix[i] = Arrays.copyOf(arr[i],arr[i].length);
        }
    }
}