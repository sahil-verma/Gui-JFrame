/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
/**
 *
 * @author sahil
 */
public class FuelStation extends JFrame{
    private JLabel lblTitle, lblHundred, lblTen, lblOne,lblCentOne, lblCentTen, lblWest, lblEast1, lblEast2, lblSale, lblHundred1, lblTen1, lblOne1,lblCentOne1, lblCentTen1, lblLiters, lblValue, lblPricePerLiter, lblPresetAmount;
    private JPanel pnlNorth, pnlWest, pnlMainCenter, pnlUpperCenter,pnlUpperCenter1, pnlUpperCenter2, pnlUpperCenter3, pnlUpperCenter4, pnlLowerCenter, pnlMainEast, pnlUpperEast, pnlLowerEast, pnlSouthMain, pnlSouthUpper, pnlSouthUpper1, pnlSouthUpper2, pnlSouthLower;
    private JButton rdRegular, rdPlus, rdSupreme;
    private JTextField txtRegular, txtPlus, txtSupreme;
    private JSlider presetAmount;
    static final int FPS_MIN = 0;
    static final int FPS_MAX = 200;
    static final int FPS_INIT = 25;
    private ButtonGroup rdGroup;
    private JButton btnExit, btnStart;
    
    public FuelStation(){
       super("Pump");
       setLayout(new BorderLayout());
       setSize(450,600);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Font = new Font("Arial", Font.BOLD, 16); 
       //and use the name font in the prantheses of the setFont menthod to decrease the code
       lblTitle = new JLabel("SUNOCO");
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
       pnlMainCenter = new JPanel();
       pnlMainCenter.setLayout(new GridLayout(6,1));
       pnlMainCenter.setBorder(BorderFactory.createRaisedBevelBorder());
       add(pnlMainCenter, BorderLayout.CENTER);
       
       pnlUpperCenter = new JPanel();
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
       pnlUpperCenter.setLayout(new GridLayout(1,5));
       pnlUpperCenter.setBorder(BorderFactory.createRaisedBevelBorder());
       pnlMainCenter.add(pnlUpperCenter, BorderLayout.CENTER);
       pnlUpperCenter.add(lblHundred);
       pnlUpperCenter.add(lblTen);
       pnlUpperCenter.add(lblOne);
       pnlUpperCenter.add(lblCentTen);
       pnlUpperCenter.add(lblCentOne);
       
       pnlUpperCenter1 = new JPanel();
       lblSale = new JLabel("This Sale $");
       lblSale.setFont(new Font("Arial", Font.BOLD, 14));
       pnlUpperCenter1.setLayout(new FlowLayout());
       pnlMainCenter.add(pnlUpperCenter1, BorderLayout.CENTER);
       pnlUpperCenter1.add(lblSale);
       
       pnlUpperCenter2 = new JPanel();
       lblHundred1 = new JLabel("0");
       lblHundred1.setFont(new Font("Arial", Font.BOLD, 22));
       lblHundred1.setHorizontalAlignment(SwingConstants.CENTER);
       lblTen1 = new JLabel("9");
       lblTen1.setFont(new Font("Arial", Font.BOLD, 22));
       lblTen1.setHorizontalAlignment(SwingConstants.CENTER);
       lblOne1 = new JLabel("5");
       lblOne1.setFont(new Font("Arial", Font.BOLD, 22));
       lblOne1.setHorizontalAlignment(SwingConstants.CENTER);
       lblCentOne1 = new JLabel("9");
       lblCentOne1.setFont(new Font("Arial", Font.BOLD, 10));
       lblCentTen1 = new JLabel("9");
       lblCentTen1.setFont(new Font("Arial", Font.BOLD, 10));
       pnlUpperCenter2.setLayout(new GridLayout(1,5));
       pnlUpperCenter2.setBorder(BorderFactory.createRaisedBevelBorder());
       pnlMainCenter.add(pnlUpperCenter2, BorderLayout.CENTER);
       pnlUpperCenter2.add(lblHundred1);
       pnlUpperCenter2.add(lblTen1);
       pnlUpperCenter2.add(lblOne1);
       pnlUpperCenter2.add(lblCentTen1);
       pnlUpperCenter2.add(lblCentOne1);
       
       
       pnlUpperCenter3 = new JPanel();
       lblLiters = new JLabel("Liters");
       lblLiters.setFont(new Font("Arial", Font.BOLD, 14));
       pnlUpperCenter3.setLayout(new FlowLayout());
       pnlMainCenter.add(pnlUpperCenter3, BorderLayout.CENTER);
       pnlUpperCenter3.add(lblLiters);
       
       pnlUpperCenter4 = new JPanel();
       lblValue = new JLabel("0.00");
       lblValue.setFont(new Font("Arial", Font.BOLD, 14));
       pnlUpperCenter4.setLayout(new FlowLayout());
       pnlMainCenter.add(pnlUpperCenter4, BorderLayout.CENTER);
       pnlUpperCenter4.add(lblValue);
       
       pnlLowerCenter = new JPanel();
       lblPricePerLiter = new JLabel("Price Per Liter ");
       lblPricePerLiter.setFont(new Font("Arial", Font.BOLD, 14));
       pnlLowerCenter.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 0));
       pnlMainCenter.add(pnlLowerCenter, BorderLayout.CENTER);
       pnlLowerCenter.add(lblPricePerLiter);
       
       
       //create south panel
       pnlSouthMain = new JPanel();
       pnlSouthMain.setLayout(new GridLayout(4,1));
       pnlSouthMain.setBorder(BorderFactory.createRaisedBevelBorder());
       add(pnlSouthMain, BorderLayout.SOUTH);
       
       
       pnlSouthUpper = new JPanel();
       rdGroup = new ButtonGroup();
       txtRegular = new JTextField("99.05");
       txtRegular.setEnabled(false);
       txtRegular.setPreferredSize(new Dimension(100, 30));
       txtRegular.setHorizontalAlignment(SwingConstants.LEFT);
       txtPlus = new JTextField("109.5");
       txtPlus.setEnabled(false);
       txtPlus.setHorizontalAlignment(SwingConstants.LEFT);
       txtSupreme = new JTextField("119.05");
       txtSupreme.setEnabled(false);
       txtSupreme.setHorizontalAlignment(SwingConstants.LEFT);
       rdRegular = new JButton("Regular");
       rdRegular.setHorizontalAlignment(SwingConstants.CENTER);
       rdRegular.setSelected(true);
       rdPlus = new JButton("Plus");
       rdPlus.setHorizontalAlignment(SwingConstants.CENTER);
       rdSupreme = new JButton("Supreme");
       rdSupreme.setHorizontalAlignment(SwingConstants.CENTER);
       pnlSouthUpper.setLayout(new GridLayout(2,3));
       pnlSouthUpper.setBorder(BorderFactory.createRaisedBevelBorder());
       pnlSouthMain.add(pnlSouthUpper, BorderLayout.NORTH);
       rdGroup.add(rdRegular);
       rdGroup.add(rdPlus);
       rdGroup.add(rdSupreme);
       pnlSouthUpper.add(txtRegular);
       pnlSouthUpper.add(txtPlus);
       pnlSouthUpper.add(txtSupreme);
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
       
       pnlSouthUpper1 = new JPanel();
       lblPresetAmount = new JLabel("Preset Purchase Amount");
       lblPresetAmount.setFont(new Font("Arial", Font.BOLD, 14));
       lblHundred1.setHorizontalAlignment(SwingConstants.CENTER);
       pnlSouthUpper1.setLayout(new FlowLayout());
       pnlSouthUpper1.setBorder(BorderFactory.createRaisedBevelBorder());
       pnlSouthMain.add(pnlSouthUpper1, BorderLayout.NORTH);
       pnlSouthUpper1.add(lblPresetAmount);
       
       
       presetAmount = new JSlider(JSlider.HORIZONTAL,FPS_MIN, FPS_MAX, FPS_INIT);
       pnlSouthUpper2 = new JPanel();
       presetAmount.setMajorTickSpacing(25);
        presetAmount.setMinorTickSpacing(5);
        presetAmount.setPaintTicks(true);
        presetAmount.setPaintLabels(true);
       pnlSouthUpper2.setLayout(new GridLayout(1,1));
       pnlSouthUpper2.setBorder(BorderFactory.createRaisedBevelBorder());
       pnlSouthMain.add(pnlSouthUpper2, BorderLayout.NORTH);
       pnlSouthUpper2.add(presetAmount);
       
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
        new FuelStation();
        
    }//end main
}//end class
