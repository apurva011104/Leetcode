class Solution {
    public void subsets(int s, int sum, int target, int []nums, List<List<Integer>> answer, List<Integer> list){
        if(sum==target){
            answer.add(new ArrayList<>(list));
            return;
        }
        if(sum>target)  return;
        for(int i=s;i<nums.length;i++){
            list.add(nums[i]);
            sum+=nums[i];
            subsets(i,sum,target,nums,answer,list);
            sum-=nums[i];
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer  = new ArrayList<>();
        subsets(0,0,target,candidates,answer,new ArrayList<>());
        return answer;

    }
    
}
