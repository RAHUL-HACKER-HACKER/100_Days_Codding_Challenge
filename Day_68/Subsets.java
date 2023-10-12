class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //to make all duplicates together
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        //call the subset creation method
        subsetCreation(0, nums, res, list);
        //return;
        return res;
    }
    public void subsetCreation(int index, int[] arr, List<List<Integer>> res, List<Integer> list){
        res.add(new ArrayList<>(list));
        for(int i = index;i < arr.length;i++){
           
            if(i != index && arr[i] == arr[i - 1]) continue;
            list.add(arr[i]);
            subsetCreation(i + 1, arr, res, list);
            list.remove(list.size() - 1);
        }
    }
}