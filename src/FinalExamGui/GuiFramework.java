/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExamGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.HashSet;
import javax.swing.border.Border;

/**
 *
 * @author sahil
 */
public class GuiFramework extends JFrame{
    private JLabel lblTitle,lblFirst, lblSecond, lblThird, lblFourth,lblFifth, lblItem1,lblItem2,lblItem3,lblItem4;
    private JTextField txt1, txt2, txt3, txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16;
    private JPanel pnlNorth, pnlCenterUpper, pnlCenterLower, pnlCenterMain, pnlSouthMain, pnlSouthUpper, pnlSouthLower;
    private JButton btnClear, btnAdd, btnExit, btnSubmit;
    private JComboBox<String> myCombo1, myCombo2, myCombo3;
    private static final String[] data = {"Select", "First", "Second", "Third"};
    
    public GuiFramework(){
        super("FinalExam");
        setLayout(new BorderLayout());
        setSize(600,380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create north panel
        pnlNorth = new JPanel();
        lblTitle = new JLabel("ACME");
        add(lblTitle);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 26));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        pnlNorth.setLayout(new BorderLayout());
        pnlNorth.setBorder(BorderFactory.createRaisedBevelBorder());
        add(pnlNorth, BorderLayout.NORTH);
        pnlNorth.add(lblTitle);
        
           
        pnlCenterMain = new JPanel();
        pnlCenterMain.setLayout(new BorderLayout());
        pnlCenterMain.setBorder(BorderFactory.createRaisedBevelBorder());
        add(pnlCenterMain, BorderLayout.CENTER);
        
        pnlCenterUpper = new JPanel();
        lblFirst = new JLabel("First");
        lblFirst.setHorizontalAlignment(SwingConstants.CENTER);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        lblFirst.setBorder(border);
        lblSecond = new JLabel("Second");
        lblSecond.setBorder(border);
        lblSecond.setHorizontalAlignment(SwingConstants.CENTER);
        lblThird = new JLabel("Third");
        lblThird.setHorizontalAlignment(SwingConstants.CENTER);
        lblThird.setBorder(border);
        lblFourth = new JLabel("Fourth");
        lblFourth.setBorder(border);
        lblFourth.setHorizontalAlignment(SwingConstants.CENTER);
        lblFifth = new JLabel("Fifth");
        lblFifth.setBorder(border);
        lblFifth.setHorizontalAlignment(SwingConstants.CENTER);
        myCombo1 = new JComboBox<String>(data);
        myCombo2 = new JComboBox<String>(data);
        myCombo3 = new JComboBox<String>(data);
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        txt4 = new JTextField();
        txt5 = new JTextField();
        txt6 = new JTextField();
        txt7 = new JTextField();
        txt8 = new JTextField();
        txt9 = new JTextField();
        txt10 = new JTextField();
        txt11 = new JTextField();
        txt12 = new JTextField();
        pnlCenterUpper.setLayout(new GridLayout(4,5));
        pnlCenterUpper.setBorder(BorderFactory.createRaisedBevelBorder());
        pnlCenterMain.add(pnlCenterUpper, BorderLayout.NORTH);
        pnlCenterUpper.add(lblFirst);
        pnlCenterUpper.add(lblSecond);
        pnlCenterUpper.add(lblThird);
        pnlCenterUpper.add(lblFourth);
        pnlCenterUpper.add(lblFifth);
        pnlCenterUpper.add(myCombo1);
        pnlCenterUpper.add(txt1);
        pnlCenterUpper.add(txt2);
        pnlCenterUpper.add(txt3);
        pnlCenterUpper.add(txt4);
        pnlCenterUpper.add(myCombo2);
        pnlCenterUpper.add(txt5);
        pnlCenterUpper.add(txt6);
        pnlCenterUpper.add(txt7);
        pnlCenterUpper.add(txt8);
        pnlCenterUpper.add(myCombo3);
        pnlCenterUpper.add(txt9);
        pnlCenterUpper.add(txt10);
        pnlCenterUpper.add(txt11);
        pnlCenterUpper.add(txt12);
        
        
        pnlCenterLower = new JPanel();
        btnClear = new JButton("Clear");
        btnAdd = new JButton("Add");
        pnlCenterLower.setLayout(new FlowLayout());
        pnlCenterLower.setBorder(BorderFactory.createRaisedBevelBorder());
        pnlCenterMain.add(pnlCenterLower, BorderLayout.CENTER);
        pnlCenterLower.add(btnClear);
        pnlCenterLower.add(btnAdd);
        
        
        
        //create south panel
       pnlSouthMain = new JPanel();
       pnlSouthMain.setLayout(new BorderLayout());
       pnlSouthMain.setBorder(BorderFactory.createRaisedBevelBorder());
       add(pnlSouthMain, BorderLayout.SOUTH);
       
       
       pnlSouthUpper = new JPanel();
       lblItem1 = new JLabel("Item 1:");
       lblItem1.setBorder(border);
       lblItem1.setHorizontalAlignment(SwingConstants.RIGHT);
       lblItem2 = new JLabel("Item 2:");
       lblItem2.setBorder(border);
       lblItem2.setHorizontalAlignment(SwingConstants.RIGHT);
       lblItem3 = new JLabel("Item 3:");
       lblItem3.setBorder(border);
       lblItem3.setHorizontalAlignment(SwingConstants.RIGHT);
       lblItem4 = new JLabel("Item 4:");
       lblItem4.setBorder(border);
       lblItem4.setHorizontalAlignment(SwingConstants.RIGHT);
       txt13 = new JTextField();
       txt14 = new JTextField();
       txt15 = new JTextField();
       txt16 = new JTextField();
       pnlSouthUpper.setLayout(new GridLayout(4,2));
       pnlSouthUpper.setBorder(BorderFactory.createTitledBorder("Items"));
       pnlSouthMain.add(pnlSouthUpper, BorderLayout.NORTH);
       pnlSouthUpper.add(lblItem1);
       pnlSouthUpper.add(txt13);
       pnlSouthUpper.add(lblItem2);
       pnlSouthUpper.add(txt14);
       pnlSouthUpper.add(lblItem3);
       pnlSouthUpper.add(txt15);
       pnlSouthUpper.add(lblItem4);
       pnlSouthUpper.add(txt16);
       pnlSouthLower = new JPanel();
       pnlSouthLower.setLayout(new FlowLayout());
       btnExit = new JButton("Exit");
       btnExit.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent event){
                    if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit?", JOptionPane.YES_NO_OPTION)==0)
                    {
                        System.exit(0);
                    }
                }
            }
       );
       btnSubmit = new JButton("Submit");
       pnlSouthLower.setBorder(BorderFactory.createRaisedBevelBorder());
       pnlSouthMain.add(pnlSouthLower, BorderLayout.SOUTH);
       pnlSouthLower.add(btnExit);  
       pnlSouthLower.add(btnSubmit); 
        
        setVisible(true);
    }//END OF CONSTRUCTOR
    
    
    public static void main(String[] args){
        
        new GuiFramework();
        
    }//end main
}//end class
