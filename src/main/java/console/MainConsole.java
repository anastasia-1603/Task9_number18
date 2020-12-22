package console;

import common.Logic;
import common.Utils;
import java.io.FileNotFoundException;
import java.util.*;

public class MainConsole
{
    public static void main(String[] args) throws FileNotFoundException
    {
        run(parseArgs(args));
    }

    public static InputArgs parseArgs(String[] args)
    {
        InputArgs inputArgs = new InputArgs();
        if (args.length > 0)
        {
            if (args[0].equals("help"))
            {
                inputArgs.help = true;
                return inputArgs;
            }
            else
            {
                inputArgs.inputFile = args[0];
                inputArgs.outputFile = args[1];
            }
        }
        else
        {
            inputArgs.help = true;
            inputArgs.error = true;
        }
        return inputArgs;
    }

    public static void run(InputArgs inputArgs) throws FileNotFoundException
    {
        if (inputArgs.help)
        {
            if (inputArgs.error)
            {
                System.err.println("Error! Enter <input file> <output file> or \"help\"");
            }
            else
            {
                System.out.println("Usage:");
                System.out.println("the program shows a list of numbers that will remain in place");
                System.out.println("if the original list is sorted in ascending order");
                System.out.println("   enter <input file> <output file>");
                System.out.println("   enter \"help\" for reference");
            }
            return;
        }
        List<Integer> inputList = Utils.readListFromFile(inputArgs.inputFile);
        if (inputList == null)
        {
            System.out.printf("Can't read file from %s", inputArgs.inputFile);
        }
        else
        {
            List<Integer> outputList = Logic.createNewList(inputList);
            Utils.writeListToFile(outputList, inputArgs.outputFile);
        }
    }
}
