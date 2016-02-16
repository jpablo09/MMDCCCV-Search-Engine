package com.mmdcccv.searchengine.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class SearchEngineFrame implements GuiConstants
{

   //Constants
   private final String FRAME_TITLE = "MMDCCCV Search Engine";
   private final Dimension FRAME_DIM = new Dimension(800, 600);
   //Fields
   private JFrame frame;
   private JScrollPane searchTablePane;
   
   //our layout will probably change:
   private ScrollPaneLayout scrollPaneLayout;
   

   
   //Default no-arg constructor
   public SearchEngineFrame()
   {
      initFrame();
           
      
   }

   //Constructor helper method for initializing default SearchEngineFrame
   private void initFrame() throws HeadlessException
   {
       
      
      //Initialize frame to default application startup state
      frame = new mmdccvFrame();
      frame.setTitle(FRAME_TITLE);
      frame.setSize(FRAME_DIM);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //searchTablePane = new SearchTable();
      //frame.setContentPane(searchTablePane);
      //scrollPaneLayout = new ScrollPaneLayout();
      //frame.setLayout(scrollPaneLayout);
      //searchTablePane.setBackground(GuiConstants.FRAME_BG_COLOR);
      //searchTablePane.setForeground(GuiConstants.TEXT_COLOR);
      frame.setVisible(true);
   }
}
