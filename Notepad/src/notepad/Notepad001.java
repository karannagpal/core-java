/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.datatransfer.*;

/**
 *
 * @author HP
 */
public class Notepad001 implements ActionListener {
    JMenuBar mbar;
    JMenu file, edit, help;
    JMenuItem fnew, fopen, fclose, fsave;
    JMenuItem copy, paste;
    JMenuItem h;
    JTextArea ta;
    JFrame f;
    //Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
    
    
    //constructor ahead
    public Notepad001()
    {
        f = new JFrame("Notepad");
        mbar = new JMenuBar();
        f.setJMenuBar(mbar);
        ta = new JTextArea();
        f.add(ta);
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        fnew = new JMenuItem("New");
        fnew.addActionListener(this);
        
        fopen = new JMenuItem("Open");
        fopen.addActionListener(this);
        
        fclose = new JMenuItem("Close");
        fclose.addActionListener(this);
        
        fsave = new JMenuItem("Save");
        fsave.addActionListener(this);
        
        file.add(fnew);
        file.add(fopen);
        file.add(fsave);
        file.add(fclose);
        
        copy = new JMenuItem("Copy");
        copy.addActionListener(this);
        
        paste = new JMenuItem("Paste");
        paste.addActionListener(this);
        
        edit.add(copy);
        edit.add(paste);
        
        h = new JMenuItem("Help Topics");
        h.addActionListener(this);
        
        help.add(h);
        
        mbar.add(file);
        mbar.add(edit);
        mbar.add(help);
        
        f.setBounds(100, 100, 600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        JMenuItem m = (JMenuItem)ae.getSource();
        
        if(m == fnew)
        {
            ta.setText("file-new is clicked");
        }
        else if(m==fsave)
        {
            ta.setText("Save menu item is clicked");
        }
        else if(m == fopen)
        {
            ta.setText("Open menu item is clicked");
        }
        else if(m == fclose)
        {
            ta.setText("Close menu item is clicked");
        }
        
        else if(m == copy)
        {
            ta.setText("Edit-Copy was clicked");
        }
        else if(m == paste)
        {
            ta.setText("Edit-paste was clicked");
        }
        
        else if(m == h)
        {
            ta.setText("Need some help?");
        }
    }
    
    
    public static void main(String args[])
    {
        Notepad001 n = new Notepad001();
    }
    
}
