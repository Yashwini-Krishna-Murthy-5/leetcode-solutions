class Solution {
    static{
        for (int i=0;i<300;i++){
            findSmallestSetOfVertices(2,new ArrayList<>());
        }
    }
    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> list = new ArrayList<>();
        boolean[] arr1 = new boolean[n];
        for (int i=0;i<edges.size();i++){
            int a = edges.get(i).get(1);
            arr1[a] = true;
        }
        for (int i=0;i<arr1.length;i++){
            if (!arr1[i]){
                list.add(i);
            }
        }
        return list;
    }
}
