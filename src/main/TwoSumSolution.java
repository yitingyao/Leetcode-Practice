package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    // Defines a method to find two numbers such that they add up to a specific target.
    public int[] twoSum(int[] nums, int target) {
        // Initializes a HashMap 'complements' to store indices of numbers as values and their complements (target - number) as keys.
        // Utilizing a Hashmap allows for constant time lookup of the complements, as it requires
        // only a single loop to search through the array.
        Map<Integer, Integer> complements = new HashMap<>();
        // Iterates through each number in the array to find two numbers that sum up to the target.
        for (int i = 0; i < nums.length; i++) {
            // Retrieves the index of a number that can be added to nums[i] to reach the target.
            // The method uses the Integer wrapper class instead of the primitive type int because HashMaps
            // do not support primitives and return null if the key is not found. Using Integer allows for
            // the possibility of a null return from get().
            Integer complementIndex = complements.get(nums[i]);

            // If such a complement is found in the map, it indicates that a previous number in the array
            // can be added to nums[i] to reach the target. Returns the indices of complement and
            // the array value in the current iteration.
            if (complementIndex != null) {
                return new int[]{complementIndex, i};
            }

            // Stores the index of the current number in the map using the complement (target -
            // current number) as the key.
            // This ensures that when a matching number is encountered later, the correct indices
            // can be quickly retrieved.
            complements.put(target - nums[i], i);


        }

        // Returns the original number array if no valid number combination is found that adds up to the target.
        // This line will not be executed if the input guarantees a solution.
        return nums;
    }
}