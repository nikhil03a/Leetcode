class Solution {
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0,new ArrayList());
        return ans;
    }
    public void backtrack(int[] nums, int i, List<Integer> temp){
        if(i==nums.length){
            List<Integer> curr_ans = new ArrayList();
            curr_ans.addAll(temp);
            ans.add(curr_ans);
            return;
        }
        temp.add(nums[i]);
        backtrack(nums,i+1,temp);
        temp.remove(temp.size()-1);
        backtrack(nums,i+1,temp);
    }
}
