package com.mmdcccv.searchengine.gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

// Will serve as table to hold list of indexed files in a table with their
// File URLs listed as well
public class SearchTable extends JScrollPane implements GuiConstants
{

   //Constants
   private final Dimension TABLE_DIM = new Dimension(600, 400);
   private final String[] COLUMN_NAMES =
   {
      "File Name",
      "Directory"
   };
   //Fields
   private JTable searchTable;
   private DefaultTableModel tblModel = new DefaultTableModel(5, 2);
   //Phony data (for now)
   Object[][] files =
   {
      {
         "One.txt", "C:\\folder"
      },
      {
         "Two.txt", "C:\\folder"
      },
      {
         "Three.txt", "C:\\folder"
      },
      {
         "Four.txt", "C:\\folder"
      },
      {
         "Five.txt", "C:\\folder"
      }
   };

   // Default no-arg constructor
   public SearchTable()
   {
      initComponent();
   }

   // constructor helper method for initializing default SearchTable component
   private void initComponent()
   {
      initializePanel();
      initSearchTable();
      addToPanel();
   }

   // constructor helper method submethod
   private void initializePanel()
   {
      this.setPreferredSize(TABLE_DIM);
      this.setBackground(GuiConstants.FRAME_BG_COLOR);
      this.setForeground(GuiConstants.TEXT_COLOR);
   }

   // constructor helper method submethod
   private void addToPanel()
   {
      this.add(searchTable);
      this.setViewportView(searchTable);
   }

   // constructor helper method submethod
   private void initSearchTable()
   {
      searchTable = new JTable(files, COLUMN_NAMES);
      searchTable.setBackground(GuiConstants.TEXT_FIELD_BG_COLOR);
      searchTable.setForeground(GuiConstants.TEXT_COLOR);
      searchTable.setGridColor(GuiConstants.TEXT_COLOR);
      searchTable.getTableHeader().setBackground(GuiConstants.FRAME_BG_COLOR);
      searchTable.getTableHeader().setForeground(GuiConstants.TEXT_COLOR);
      searchTable.setRowHeight(20);
      searchTable.setPreferredSize(TABLE_DIM);
   }
}
