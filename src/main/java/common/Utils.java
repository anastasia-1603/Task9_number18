package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Utils
{
    public static List<Integer> readListFromFile(String filename) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File(filename));
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        try
        {
            while (scanner.hasNext())
            {
                list.add(scanner.nextInt());
            }
        }
        catch (Exception e)
        {
            list = null;
        }
        return list;
    }

    public static void writeListToFile(List<Integer> list, String filename) throws FileNotFoundException
    {
        writeLineToFile(toString(list), filename);
    }

    public static void writeLineToFile(String line, String filename) throws FileNotFoundException
    {
        try (PrintWriter out = new PrintWriter(filename))
        {
            out.println(line);
        }
    }

    public static List<Integer> toListIntegers(String line)
    {
        Scanner scanner = new Scanner(line);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext())
        {
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static String toString(List<Integer> list)
    {
        int[] array = toIntArray(list);
        return toString(array);
    }

    public static int[] toIntArray(List<Integer> list)
    {
        Integer[] arr = list.toArray(new Integer[0]);
        return toPrimitive(arr);
    }

    public static int[] toPrimitive(Integer[] arr)
    {
        if (arr == null)
        {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i];
        }
        return result;
    }

    public static String toString(int[] arr)
    {
        if (arr == null)
        {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
        {
            if (i != 0)
            {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arr[i]);
        }
        return stringBuilder.toString();
    }
}
