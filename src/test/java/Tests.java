import common.Logic;
import common.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Tests
{
    @Test
    public void test1() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input1.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Integer[] expectedArray = {3};
        List<Integer> expectedList = Arrays.asList(expectedArray);
        Assert.assertEquals(expectedList, outputList);
    }

    @Test
    public void test2() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input2.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Integer[] expectedArray = {-3, 8};
        List<Integer> expectedList = Arrays.asList(expectedArray);
        Assert.assertEquals(expectedList, outputList);
    }

    @Test
    public void test3() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input3.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Integer[] expectedArray = {0, 0, 0, 0, 0, 0};
        List<Integer> expectedList = Arrays.asList(expectedArray);
        Assert.assertEquals(expectedList, outputList);
    }

    @Test
    public void test4() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input4.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Integer[] expectedArray = {};
        List<Integer> expectedList = Arrays.asList(expectedArray);
        Assert.assertEquals(expectedList, outputList);
    }

    @Test
    public void test5() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input5.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Assert.assertEquals(null, outputList);
    }

    @Test
    public void test6() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input6.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Integer[] expectedArray = {1000, 4565};
        List<Integer> expectedList = Arrays.asList(expectedArray);
        Assert.assertEquals(expectedList, outputList);
    }

    @Test
    public void test7() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input7.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Integer[] expectedArray = {56700};
        List<Integer> expectedList = Arrays.asList(expectedArray);
        Assert.assertEquals(expectedList, outputList);
    }

    @Test
    public void test8() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input8.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Integer[] expectedArray = {0, 0, 0, 2, 3, 10};
        List<Integer> expectedList = Arrays.asList(expectedArray);
        Assert.assertEquals(expectedList, outputList);
    }

    @Test
    public void test9() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input9.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Assert.assertEquals(null, outputList);
    }

    @Test
    public void test10() throws FileNotFoundException
    {
        List<Integer> inputList = Utils.readListFromFile("tests\\input10.txt");
        List<Integer> outputList = Logic.createNewList(inputList);
        Integer[] expectedArray = {};
        List<Integer> expectedList = Arrays.asList(expectedArray);
        Assert.assertEquals(expectedList, outputList);
    }
}
