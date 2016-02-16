/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mmdcccv.searchengine.gui;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author jpablo09
 */
public class mmdccvFrame extends JFrame {
    
    private JLabel label = new JLabel("Search Entry ");
    private JTextField text = new JTextField(20);
    private JButton button = new JButton("Search"); 
    
    private JRadioButton r1 = new JRadioButton("search all terms");
    private JRadioButton r2 = new JRadioButton("search any term");
    private JRadioButton r3 = new JRadioButton("search extact terms");
    
    
    
    public mmdccvFrame(){
        
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,20));
        
        p1.add(label);
        p1.add(text);
        p1.add(button);
        add(p1);
        
        JPanel p2 = new JPanel(new GridLayout(3,1));
        
        p2.add(r1);
        p2.add(r2);
        p2.add(r3);
        add(p2);
        
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p3.add(new SearchTable());
        add(p3);
        
        JPanel p4 = new JPanel(new BorderLayout());
        p4.add(p1,BorderLayout.NORTH);
        p4.add(p2,BorderLayout.WEST);
        p4.add(p3, BorderLayout.SOUTH);
        add(p4);
        
        
       
        
    }
    
    /*public void searchPanel(){
        
        mmdccvFrame frame = new mmdccvFrame();
        
        frame.setTitle("MMDCCV SEARCH ENGINE");
        frame.setSize(450,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
    }*/
    
}
