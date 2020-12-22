package gui.actionListeners;

import common.Logic;
import common.Utils;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ButtonExecuteListener implements ActionListener
{
    JTextField inputDataField;
    JTextField outputDataField;

    public ButtonExecuteListener(JTextField inputDataField, JTextField outputDataField)
    {
        this.inputDataField = inputDataField;
        this.outputDataField = outputDataField;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String inputData = inputDataField.getText();
        List<Integer> inputList = Utils.toListIntegers(inputData);
        List<Integer> outputList = Logic.createNewList(inputList);
        outputDataField.setText(Utils.toString(outputList));
    }
}
