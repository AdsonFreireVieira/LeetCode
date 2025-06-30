package Resolucao01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (mapa.containsKey(complemento)) {
                return new int[]{mapa.get(complemento), i};
            }
            mapa.put(nums[i], i);
        }

        throw new IllegalArgumentException("Nenhuma solução encontrada");
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Exemplo 1: " + Arrays.toString(twoSum(nums1, target1))); // [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Exemplo 2: " + Arrays.toString(twoSum(nums2, target2)));

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Exemplo 3: " + Arrays.toString(twoSum(nums3, target3)));
    }
}