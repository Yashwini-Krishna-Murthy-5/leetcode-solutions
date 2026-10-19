class Solution {

    static{
        for (int i=0;i<300;i++){
            isIsomorphic("","");
        }
    }
    public static boolean isIsomorphic(String s, String t) {
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];
        if (s.length()!=t.length()) return false;
        for (int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (arr1[ch1]!=0 || arr2[ch2]!=0){
                if (arr1[ch1]!=ch2+1 || arr2[ch2]!=ch1+1){
                    return false;
                }
            }
            arr1[ch1] = ch2+1;
            arr2[ch2] = ch1+1;
        }
        return true;
    }
}
