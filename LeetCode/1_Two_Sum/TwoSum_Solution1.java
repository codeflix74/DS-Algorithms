/*
    Concepts: Using of Map data structure
    Solution: Maitain a map (let's say variable hash) with key as the number in nums and index as the value for the key.
    In second iteration, check for every nums [ i ] if the key = (target - nums [ i ]) is present in hash or not.
    If such key is present, check that the key have to be located in different index. If found return the indices as i and
    hash.get(target - nums [ i ])
    Time Complexity: O (n), where n is the size of array num
    Space Complexity : O (k), where k is number of distinct elements in array
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int [2];
        HashMap <Integer, Integer> hash = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            hash.put (nums [ i ], i);
        }
        for (int i = 0 ; i < nums.length ; i++) {
            if (hash.containsKey(target - nums [ i ]) && i != hash.get (target - nums [ i ])) {
                ans [ 0 ] = i;
                ans [ 1 ] = hash.get(target - nums [ i ]);
                return ans;
            }
        }
        return null;
    }
}