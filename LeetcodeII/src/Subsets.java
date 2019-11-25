import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    private void backtrack(List<List<Integer>> list, List<Integer> tempList,
                           int[] nums, int start){
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums,i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        Subsets sbs = new Subsets();
        List<List<Integer>> results = sbs.subsets(nums);
        for (int i = 0; i < results.size(); i++){
            for (int j = 0; j < results.get(i).size(); j++){
                System.out.print(results.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
