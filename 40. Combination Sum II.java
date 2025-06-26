class Solution {
    public void sum(int[] arr, int ind, int target, List<List<Integer>> list, List<Integer> li){
        if(target==0){
            list.add(new ArrayList<>(li));
            return;
        }
        for(int i=ind; i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;
        
            li.add(arr[i]);
            sum(arr,i+1,target-arr[i],list,li);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> li=new ArrayList<>();
        sum(candidates,0,target,ans,li);
        return ans;
    }
}
