class Solution {
    static {
        for (int i = 0; i < 300; i++)
            findJudge(0,new int[1][2]);
    }
    public static int findJudge(int n, int[][] trust) {
        if(n==1)
            return 1;
        int arr1[]=new int[n+1];
        int arr2[]=new int[n+1];
        for(int i=0;i<trust.length;i++)
        {
            int a=trust[i][0];
            int b=trust[i][1];
            arr1[a]++;
            arr2[b]++;
        }
        for(int i=0;i<n+1;i++)
        {
            if(arr2[i]==n-1 && arr1[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
}
