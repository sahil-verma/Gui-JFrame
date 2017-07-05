package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // needed for handling the events

public class GuiEvents_1 extends JFrame {

    private JLabel labelOne, labelTwo;
    private JTextField textFieldOne;
    // check boxes
    private JCheckBox checkBoxOne, checkBoxTwo;
    // radio buttons
    private JRadioButton radioButtonOne, radioButtonTwo;
    // radio button group
    private ButtonGroup radioButtonGroup;
    //drop down menu
    private JComboBox<String> myCombo;
    // button
    private JButton buttonOne;

    public GuiEvents_1() {
        super("Events");
        setLayout(new FlowLayout());
        labelOne = new JLabel("Name: ");
        labelTwo = new JLabel("Font Style: ");

        add(labelOne);


        textFieldOne = new JTextField(10);
        add(textFieldOne);

        add(labelTwo);
        radioButtonOne = new JRadioButton("Arial", true);
        radioButtonTwo = new JRadioButton("Times New Roman", false);
        add(radioButtonOne);
        add(radioButtonTwo);

        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButtonOne);
        radioButtonGroup.add(radioButtonTwo);


        checkBoxOne = new JCheckBox("Bold");
        checkBoxTwo = new JCheckBox("Italics");
        add(checkBoxOne);
        add(checkBoxTwo);


        myCombo = new JComboBox<String>(new String[]{ "12", "14", "16", "18", "20" });
        myCombo.setMaximumRowCount(5);
        add(myCombo);

        buttonOne = new JButton("Exit");
        add(buttonOne);


        // add listeners for the components
        textFieldOne.addActionListener(new TextBoxHandler());
        buttonOne.addActionListener(new ButtonHandler());
        radioButtonOne.addItemListener(
        new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent event){
               textFieldOne.setFont(new Font("Arial", textFieldOne.getFont().getStyle(), textFieldOne.getFont().getSize()));
           }
        });//end of radioButtonOne listner
        
        radioButtonTwo.addItemListener(
        new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent event){
               textFieldOne.setFont(new Font("Times New Roman", textFieldOne.getFont().getStyle(), textFieldOne.getFont().getSize()));
           }
        });
        
        //dropdown listner
        myCombo.addItemListener(
        new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent event){
                textFieldOne.setFont(new Font( textFieldOne.getFont().getFamily(), textFieldOne.getFont().getStyle(), Integer.parseInt(myCombo.getSelectedItem().toString())));
                textFieldOne.setSize(new Dimension(textFieldOne.getWidth(),Integer.parseInt(myCombo.getSelectedItem().toString()) + 4));
               
           }
        });
        
        //button listner
        buttonOne.addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                if(JOptionPane.showConfirmDialog(
                null,
                        "Are you sure you want to Exit?",
                        "Exit System?",
                        JOptionPane.YES_NO_OPTION)==0)
                {
                    System.exit(0);
                }
                
                
            }
        
        });
        
        //checkBOx LIssstner
        checkBoxOne.addItemListener(new checkBoxFont());
        checkBoxTwo.addItemListener(new checkBoxFont());
        
    }//end of constructor
    //pricvate inner class
    private  class checkBoxFont implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent event){
            
            if(checkBoxOne.isSelected() && checkBoxTwo.isSelected()){
                textFieldOne.setFont(new Font(textFieldOne.getFont().getFamily(), Font.ITALIC + Font.BOLD, textFieldOne.getFont().getSize()));
            }
            else if(checkBoxOne.isSelected())//if bold
            {
                textFieldOne.setFont(new Font(textFieldOne.getFont().getFamily(), Font.BOLD, textFieldOne.getFont().getSize()));
            }
            else if(checkBoxTwo.isSelected()){
                textFieldOne.setFont(new Font(textFieldOne.getFont().getFamily(), Font.ITALIC, textFieldOne.getFont().getSize()));
            }
            else{
                textFieldOne.setFont(new Font(textFieldOne.getFont().getFamily(), Font.PLAIN, textFieldOne.getFont().getSize()));
            }
               
        }
    }
    
    private class TextBoxHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            //output
            JOptionPane.showMessageDialog(null, "Enter pressed!");
        }
    }
    
    //pricvate inner class
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            //output
            JOptionPane.showMessageDialog(null, "Enter pressed!");
        }
        
    }
    
    //pricvate inner class
    private class radioButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            //output
            labelOne.setText((radioButtonOne.isSelected()) ? radioButtonOne.getText() : radioButtonTwo.getText());
        }
    }


    public static void main(String [] args) {

        GuiEvents_1 gui = new GuiEvents_1();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(215, 180);
        gui.setVisible(true);

    }


}

