package ru.vsu.cs.course1.tree;

import java.util.ArrayList;

public class Solution {
    public static String getThreesomes(SimpleBinaryTree<Integer> tree, int S){
        ArrayList<Integer> list = SimpleBinaryTree.getArray(tree.root, new ArrayList<>());
        String solution = "";
        for (int firstIndex = 0; firstIndex < list.size(); firstIndex++)
        {
            for (int secondIndex = 0; secondIndex < list.size(); secondIndex++)
            {
                int thirdNumber = S - list.get(firstIndex) - list.get(secondIndex);

                boolean isNum = tree.findValue(thirdNumber);

                if (isNum){
                    solution += String.valueOf(list.get(firstIndex)) + " " + String.valueOf(list.get(secondIndex)) + " " + String.valueOf(thirdNumber) + ", ";
                }
            }
        }
        return solution;
    }
}
