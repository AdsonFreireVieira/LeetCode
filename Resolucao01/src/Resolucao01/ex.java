package Resolucao01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ex {

    public static int[] twoSum(int [] nums ,int target){

        Map<Integer,Integer> mapa = new HashMap<>();

        for(int i=0; i<nums.length;i++) {
            int complemento = target - nums[i];

            if (mapa.containsKey(complemento)) {
                return new int[]{
                        mapa.get(complemento), i};


            }
            mapa.put(nums[i], i);
        }
            throw  new IllegalArgumentException("nenhuma solucao encontrada");
    }


    public static void main(String[] args) {

        int nums []={3,4,6,7,8};
        int target = 14;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

}
