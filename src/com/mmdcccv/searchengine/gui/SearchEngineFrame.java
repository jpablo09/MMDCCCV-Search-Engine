package com.mmdcccv.searchengine.gui;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SearchEngineFrame implements GuiConstants
{

   //Constants

   private final String FRAME_TITLE = "MMDCCCV Search Engine";
   private final Dimension FRAME_DIM = new Dimension(800, 600);
   //Fields
   private JFrame frame;
   private JPanel panel;

   //Default no-arg constructor
   public SearchEngineFrame()
   {
      initFrame();
   }

   //Constructor helper method for initializing default SearchEngineFrame
   private void initFrame() throws HeadlessException
   {
      //Initialize frame to default application startup state
      frame = new JFrame();
      frame.setTitle(FRAME_TITLE);
      frame.setSize(FRAME_DIM);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      panel = new JPanel();
      frame.setContentPane(panel);
      panel.setBackground(GuiConstants.FRAME_BG_COLOR);
      panel.setForeground(GuiConstants.TEXT_COLOR);
      frame.setVisible(true);
   }
}
