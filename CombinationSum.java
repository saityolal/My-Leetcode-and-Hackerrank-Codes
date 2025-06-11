import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); 
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break; 
            
            current.add(candidates[i]); 
            backtrack(candidates, target - candidates[i], i, current, result); 
            current.remove(current.size() - 1); 
        }
    }
}

/*ROOT (target=7, combination=[], start=0)  
│  
├── 2 (target=5, combination=[2], start=0)  
│   │  
│   ├── 2 (target=3, combination=[2,2], start=0)  
│   │   │  
│   │   ├── 2 (target=1, combination=[2,2,2] → ❌ INVALID)  
│   │   │  
│   │   ├── 3 (target=0, combination=[2,2,3] →  VALID)  
│   │   │  
│   │   └── 6/7 (target<0 → ❌ PRUNED)  
│   │  
│   ├── 3 (target=2, combination=[2,3], start=1)  
│   │   │  
│   │   └── 3 (target=-1 → ❌ INVALID)  
│   │  
│   └── 6/7 (target<0 → ❌ PRUNED)  
│  
├── 3 (target=4, combination=[3], start=1)  
│   │  
│   ├── 3 (target=1, combination=[3,3] → ❌ INVALID)  
│   │  
│   └── 6/7 (target<0 → ❌ PRUNED)  
│  
├── 6 (target=1, combination=[6] → ❌ INVALID)  
│  
└── 7 (target=0, combination=[7] → ✅ VALID)   */