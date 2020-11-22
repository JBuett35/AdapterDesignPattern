/** Created by James Buettner on Wednesday, November 18, 2020 for CSC 422. */

import java.util.ArrayList;

public class ImmutableList implements ImmutableListInterface {
    private ArrayList<Integer> list;
    public ImmutableList(int[] nums) {
        list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
            list.add(nums[i]);
    }

    public ImmutableList(ImmutableListInterface list2) {
        list = new ArrayList<Integer>();
        for(int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i));
        }
    }
    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public ImmutableListInterface concat(ImmutableListInterface list2) {
        int[] nums = new int[list.size()+ list2.size()];
        int i = 0;

        for(i = 0; i < size(); i++) {
            nums[i] = list.get(i);
        }

        for(int j = 0; j < list2.size(); j++, i++)
            nums[i] = list2.get(j);

        return new ImmutableList(nums);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}