package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic
{
    public static List<Integer> createNewList(List<Integer> inputList)
    {
        if (inputList == null)
        {
            return null;
        }
        List<Integer> sortedList = new ArrayList<>(inputList);
        Collections.sort(sortedList);
        List<Integer> outputList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++)
        {
            if (inputList.get(i).equals(sortedList.get(i)))
            {
                outputList.add(inputList.get(i));
            }
        }
        return outputList;
    }
}
