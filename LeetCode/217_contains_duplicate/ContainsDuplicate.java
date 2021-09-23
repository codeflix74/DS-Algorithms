/*
Concept: Use of Set Data Structure
Solution: Maintain a set and add all elements on the set, the set size should not be equal to array size.
Time Complexity: O (n) time, n is number of elements in array
Space Complexity: O (k) space, k is the number of distinct elements in array
*/


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<>();
        int size = nums.length;
        for (int i = 0 ; i < size ; i++) {
            set.add (nums [i]);        
        }
        return set.size() != size;
    }
}
                          