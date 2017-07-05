package Assignment2;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

/**
 * Global tank Form class to display gas sold and available
 */
public class GlobalTank extends JFrame{
    
    private JLabel lblTitle1, lblRegular1, lblPlus1, lblSupreme1,lblTitle2, lblRegular2, lblPlus2, lblSupreme2;
    private JTextField txtRegular1, txtPlus1, txtSupreme1, txtRegular2, txtPlus2, txtSupreme2;
    private JPanel pnlNorthMain, pnlUpperNorth, pnlLowerNorth, pnlSouthMain, pnlUpperSouth, pnlLowerSouth,pnlLowerSouth1;
    private JButton btnExit;
   
    //constructor
    public GlobalTank(){
        super("vghg");
        setLayout(new BorderLayout());
        setSize(600,500);
        
        //creating a north main panel
        pnlNorthMain = new JPanel();
        pnlNorthMain.setLayout(new BorderLayout());
        //setting the empty border to have the entire pannel in the middle
        pnlNorthMain.setBorder(new EmptyBorder(60, 80, 0, 80));
        
        add(pnlNorthMain, BorderLayout.NORTH);
        
        //creating a north upper panel
        pnlUpperNorth = new JPanel();
        lblTitle1 = new JLabel("Gas SOLD (Litres)");
        lblTitle1.setFont(new Font("Arial", Font.BOLD, 16));
        pnlNorthMain.add(pnlUpperNorth, BorderLayout.NORTH);
        pnlUpperNorth.add(lblTitle1);
        
        //creating a north lower panel
        pnlLowerNorth = new JPanel();
        lblRegular1 = new JLabel("Regular:");
        lblRegular1.setFont(new Font("Arial", Font.BOLD, 14));
        lblPlus1 = new JLabel("Plus:");
        lblPlus1.setFont(new Font("Arial", Font.BOLD, 14));
        lblSupreme1 = new JLabel("Supreme:");
        lblSupreme1.setFont(new Font("Arial", Font.BOLD, 14));
        txtRegular1 = new JTextField();
        txtRegular1.setFont(new Font("Arial", Font.BOLD, 14));
        txtPlus1 = new JTextField();
        txtPlus1.setFont(new Font("Arial", Font.BOLD, 14));
        txtSupreme1 = new JTextField();
        txtSupreme1.setFont(new Font("Arial", Font.BOLD, 14));
        pnlLowerNorth.setLayout(new GridLayout(3,2, 0, 15));
        pnlNorthMain.add(pnlLowerNorth, BorderLayout.SOUTH);
        pnlLowerNorth.add(lblRegular1);
        pnlLowerNorth.add(txtRegular1);
        pnlLowerNorth.add(lblPlus1);
        pnlLowerNorth.add(txtPlus1);
        pnlLowerNorth.add(lblSupreme1);
        pnlLowerNorth.add(txtSupreme1);
        
        //creating a south main panel
        pnlSouthMain = new JPanel();
        pnlSouthMain.setLayout(new BorderLayout());
        pnlSouthMain.setBorder(new EmptyBorder(0, 80, 60, 80));
        add(pnlSouthMain, BorderLayout.SOUTH);
        
        ////creating a south upper panel
        pnlUpperSouth = new JPanel();
        lblTitle2 = new JLabel("Gas AVAILABLE (Litres)");
        lblTitle2.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitle2.setHorizontalAlignment(SwingConstants.LEFT);
        pnlSouthMain.add(pnlUpperSouth, BorderLayout.NORTH);
        pnlUpperSouth.add(lblTitle2);
        
        //creating a south lower panel
        pnlLowerSouth = new JPanel();
        lblRegular2 = new JLabel("Regular:");
        lblRegular2.setFont(new Font("Arial", Font.BOLD, 14));
        lblPlus2 = new JLabel("Plus:");
        lblPlus2.setFont(new Font("Arial", Font.BOLD, 14));
        lblSupreme2 = new JLabel("Supreme:");
        lblSupreme2.setFont(new Font("Arial", Font.BOLD, 14));
        txtRegular2 = new JTextField();
        txtRegular2.setFont(new Font("Arial", Font.BOLD, 14));
        txtPlus2 = new JTextField();
        txtPlus2.setFont(new Font("Arial", Font.BOLD, 14));
        txtSupreme2 = new JTextField();
        txtSupreme2.setFont(new Font("Arial", Font.BOLD, 14));
        pnlLowerSouth.setLayout(new GridLayout(3,2, 0, 15));
        pnlSouthMain.add(pnlLowerSouth, BorderLayout.CENTER);
        pnlLowerSouth.add(lblRegular2);
        pnlLowerSouth.add(txtRegular2);
        pnlLowerSouth.add(lblPlus2);
        pnlLowerSouth.add(txtPlus2);
        pnlLowerSouth.add(lblSupreme2);
        pnlLowerSouth.add(txtSupreme2);
        
        //creating a another south lower panel
        pnlLowerSouth1 = new JPanel();
        btnExit = new JButton("Exit");
        //add listner to exit the form
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
        pnlSouthMain.add(pnlLowerSouth1, BorderLayout.SOUTH);
        pnlLowerSouth1.add(btnExit);
        setVisible(true);
    }//end of constructor
    
    
    public static void main(String[] args){
        new GlobalTank();
        
    }//end main
}//end of class
