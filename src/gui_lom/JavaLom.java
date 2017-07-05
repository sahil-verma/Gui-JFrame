/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_lom;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
/**
 *
 * @author sahil
 */
public class JavaLom extends JFrame{
    private JLabel lblTitle, lblHundred, lblTen, lblOne,lblCentOne, lblCentTen, lblWest, lblEast1, lblEast2;
    private JPanel pnlNorth, pnlWest, pnlCenter, pnlMainEast, pnlUpperEast, pnlLowerEast, pnlSouthMain, pnlSouthUpper, pnlSouthLower;
    private JRadioButton rdRegular, rdPlus, rdSupreme;
    private ButtonGroup rdGroup;
    private JButton btnExit, btnStart;
    
    public JavaLom(){
       super("Pump");
       setLayout(new BorderLayout());
       setSize(300,250);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Font = new Font("Arial", Font.BOLD, 16); 
       //and use the name font in the prantheses of the setFont menthod to decrease the code
       lblTitle = new JLabel("ESSO");
       add(lblTitle);
       lblTitle.setFont(new Font("Arial", Font.BOLD, 26));
       lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
       //lblTitle.setVerticalAlignment(SwingConstants.TOP);
       
       //create a north region panel
       pnlNorth = new JPanel();
       pnlNorth.add(lblTitle);
       add(pnlNorth, BorderLayout.NORTH);
       pnlNorth.setBorder(BorderFactory.createRaisedBevelBorder());
       
       //create a west region panel
       pnlWest = new JPanel();
       lblWest = new JLabel();
       pnlWest.add(lblWest);
       add(pnlWest, BorderLayout.WEST);
       pnlWest.setBorder(BorderFactory.createRaisedBevelBorder());
       
       //create a east region panel
       pnlMainEast = new JPanel();
       pnlMainEast.setLayout(new BorderLayout());
       pnlMainEast.setBorder(BorderFactory.createRaisedBevelBorder());
       add(pnlMainEast, BorderLayout.EAST);
       
       pnlUpperEast = new JPanel();
       lblEast1 = new JLabel("107.9");
       lblEast1.setFont(new Font("Arial", Font.BOLD, 16));
       lblEast1.setHorizontalAlignment(SwingConstants.CENTER);
       pnlMainEast.add(pnlUpperEast, BorderLayout.NORTH);
       pnlUpperEast.add(lblEast1);
       
       pnlLowerEast = new JPanel();
       lblEast2 = new JLabel("R");
       lblEast2.setFont(new Font("Arial", Font.BOLD, 24));
       lblEast2.setHorizontalAlignment(SwingConstants.CENTER);
       pnlMainEast.add(pnlLowerEast, BorderLayout.SOUTH);
       pnlLowerEast.add(lblEast2);
       
       
       //create a center region panel
       pnlCenter = new JPanel();
       lblHundred = new JLabel("1");
       lblHundred.setFont(new Font("Arial", Font.BOLD, 22));
       lblHundred.setHorizontalAlignment(SwingConstants.CENTER);
       lblTen = new JLabel("3");
       lblTen.setFont(new Font("Arial", Font.BOLD, 22));
       lblTen.setHorizontalAlignment(SwingConstants.CENTER);
       lblOne = new JLabel("5");
       lblOne.setFont(new Font("Arial", Font.BOLD, 22));
       lblOne.setHorizontalAlignment(SwingConstants.CENTER);
       lblCentOne = new JLabel("8");
       lblCentOne.setFont(new Font("Arial", Font.BOLD, 10));
       lblCentTen = new JLabel("1");
       lblCentTen.setFont(new Font("Arial", Font.BOLD, 10));
       pnlCenter.setLayout(new GridLayout(1,3));
       pnlCenter.setBorder(BorderFactory.createRaisedBevelBorder());
       add(pnlCenter, BorderLayout.CENTER);
       pnlCenter.add(lblHundred);
       pnlCenter.add(lblTen);
       pnlCenter.add(lblOne);
       pnlCenter.add(lblCentTen);
       pnlCenter.add(lblCentOne);
      
       
       //create south panel
       pnlSouthMain = new JPanel();
       pnlSouthMain.setLayout(new BorderLayout());
       pnlSouthMain.setBorder(BorderFactory.createRaisedBevelBorder());
       add(pnlSouthMain, BorderLayout.SOUTH);
       
       
       pnlSouthUpper = new JPanel();
       rdGroup = new ButtonGroup();
       rdRegular = new JRadioButton("Regular");
       rdRegular.setHorizontalAlignment(SwingConstants.CENTER);
       rdRegular.setSelected(true);
       rdPlus = new JRadioButton("Plus");
       rdPlus.setHorizontalAlignment(SwingConstants.CENTER);
       rdSupreme = new JRadioButton("Supreme");
       rdSupreme.setHorizontalAlignment(SwingConstants.CENTER);
       pnlSouthUpper.setLayout(new GridLayout(1,3));
       pnlSouthUpper.setBorder(BorderFactory.createRaisedBevelBorder());
       pnlSouthMain.add(pnlSouthUpper, BorderLayout.NORTH);
       rdGroup.add(rdRegular);
       rdGroup.add(rdPlus);
       rdGroup.add(rdSupreme);
       pnlSouthUpper.add(rdRegular);
       pnlSouthUpper.add(rdPlus);
       pnlSouthUpper.add(rdSupreme);
       
       rdRegular.addItemListener(
        new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent event){
               lblEast2.setText("R");
               lblEast1.setText("107.9");
           }
        });//end of radioButtonOne listner
       
       rdPlus.addItemListener(
        new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent event){
               lblEast2.setText("P");
               lblEast1.setText("120.9");
           }
        });//end of radioButtonOne listner
       
       rdSupreme.addItemListener(
        new ItemListener(){
           @Override
           public void itemStateChanged(ItemEvent event){
               lblEast2.setText("S");
               lblEast1.setText("127.9");
           }
        });//end of radioButtonOne listner
       
       pnlSouthLower = new JPanel();
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
       btnStart = new JButton("Start");
       btnStart.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent event){
                    if(JOptionPane.showConfirmDialog(null, "Are you sure you want to fill the fuel?", "Exit?", JOptionPane.YES_NO_OPTION)==1)
                    {
                        System.exit(0);
                    }
                    else{
                        int fuel = Integer.parseInt(JOptionPane.showInputDialog(" How much liters you want to fill ?"));
                        if(fuel>0){
                        lblHundred.setText("0");
                        lblTen.setText("0");
                        lblOne.setText("0");
                        lblCentOne.setText("0");
                        lblCentTen.setText("0");
                        }
                    }
                }
            }
       );
       pnlSouthLower.setLayout(new FlowLayout());
       pnlSouthLower.setBorder(BorderFactory.createRaisedBevelBorder());
       pnlSouthMain.add(pnlSouthLower, BorderLayout.SOUTH);
       pnlSouthLower.add(btnStart);  
       pnlSouthLower.add(btnExit);    
       
       setVisible(true);
       
       
    }//end constructor
    
    public static void main(String[] args){
        new JavaLom();
        
    }//end main
}//end class
