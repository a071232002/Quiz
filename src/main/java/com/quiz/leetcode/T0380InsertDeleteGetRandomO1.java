package com.quiz.leetcode;

import java.util.*;

public class T0380InsertDeleteGetRandomO1 {

    class RandomizedSet {

        List<Integer> list = new ArrayList<>();
        Random randomPick = new Random();

        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (list.contains(val)) {
                return false;
            }
            return list.add(val);
        }

        public boolean remove(int val) {
            if (!list.contains(val)) {
                return false;
            }
            list.remove((Integer) val);
            return true;
        }

        public int getRandom() {
            return list.get(randomPick.nextInt(list.size()));
        }
    }

    //indexMap improve
    class RandomizedSet2 {

        Map<Integer, Integer> indexMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Random randomPick = new Random();

        public RandomizedSet2() {

        }

        public boolean insert(int val) {
            if (indexMap.containsKey(val)) {
                return false;
            }
            indexMap.put(val, list.size());
            return list.add(val);
        }

        public boolean remove(int val) {
            if (!indexMap.containsKey(val)) {
                return false;
            }
            //將endVal替換到input val位置 => 更新endVal indexMap, list永遠只移除endIndex
            int index = indexMap.get(val);
            if (index < list.size() - 1) {
                Collections.swap(list, index, list.size() - 1);
                indexMap.put(list.get(index), index);
                //int lastVal = list.get(list.size() - 1);
                //list.set(index, lastVal);
                //indexMap.put(lastVal, index);
            }

            indexMap.remove(val);
            list.remove(list.size() - 1);
            return true;
        }

        public int getRandom() {
            return list.get(randomPick.nextInt(list.size()));
        }
    }
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
