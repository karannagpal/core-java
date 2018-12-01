//this is v2.0, the best version created by me
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

/**
 *
 * @author Karan
 */
public class Notepad002 implements ActionListener {
    JMenuBar mbar;
    JMenu file, edit, format, help;
    JMenuItem fnew, fopen, fclose, fsave;
    JMenuItem copy, paste, find;
    JMenuItem ucase, lcase, toggle, vowels, spaces;
    JMenuItem h;
    JTextArea ta;
    JFrame f;
    //Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
    int ind;
    String wholeText, findString;
    
    
    //constructor ahead
    public Notepad002()
    {
        f = new JFrame("Notepad");
        mbar = new JMenuBar();
        f.setJMenuBar(mbar);
        ta = new JTextArea();
        f.add(ta);
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        help = new JMenu("Help");
        
        
        // <file>
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
        // </file>
        
        
        // <edit>
        copy = new JMenuItem("Copy");
        copy.addActionListener(this);
        
        paste = new JMenuItem("Paste");
        paste.addActionListener(this);
        
        find = new JMenuItem("Find");
        find.addActionListener(this);
        
        edit.add(copy);
        edit.add(paste);
        edit.add(find);
        // </edit>
        
        
        // <format>
        ucase = new JMenuItem("Uppercase");
        ucase.addActionListener(this);
        
        lcase = new JMenuItem("Lowercase");
        lcase.addActionListener(this);
        
        toggle = new JMenuItem("Toggle case");
        toggle.addActionListener(this);
        
        vowels = new JMenuItem("Count vowels");
        vowels.addActionListener(this);
        
        spaces = new JMenuItem("Count spaces");
        spaces.addActionListener(this);
        
        format.add(ucase);
        format.add(lcase);
        format.add(toggle);
        format.add(vowels);
        format.add(spaces);
        // </format>
               
        
        // <help>
        h = new JMenuItem("Help Topics");
        h.addActionListener(this);
        
        help.add(h);
        // </help>
        
        // adding menu to menubar
        mbar.add(file);
        mbar.add(edit);
        mbar.add(format);
        mbar.add(help);
        
        f.setBounds(100, 100, 600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        JMenuItem m = (JMenuItem)ae.getSource();
        
        try
        {
            //file menu ========================================================
            if(m == fnew)
            {
                ta.setText("");
                System.out.println("File - new was clicked");
            }
            else if(m==fsave)
            {
                FileDialog fds = new FileDialog(f, "SAVE", FileDialog.SAVE);
                fds.setVisible(true);
                System.out.println("current dir for: " + fds.getDirectory());
                Writer w = new FileWriter(fds.getDirectory() + "\\" + fds.getFile());
                String str = ta.getText();
                w.write(str);
                w.close();
                f.setTitle(fds.getFile() + " - Notepad");
                
                System.out.println("Save menu item is clicked");
            }
            else if(m == fopen)
            {
                FileDialog fd = new FileDialog(f, "OPEN", FileDialog.LOAD);
                fd.setVisible(true);
                File file = new File(fd.getDirectory() + "\\" + fd.getFile());
                Reader r = new BufferedReader(new FileReader(file));
                char ch[] = new char[(int)file.length()];
                r.read(ch, 0, ch.length);
                String s = new String(ch);
                ta.setText(s);
                r.close();
                f.setTitle(fd.getFile() + " - Notepad");
                
                System.out.println("Open menu item is clicked");
            }
            else if(m == fclose)
            {
                ta.setText("Close menu item is clicked");
            }
            
            //edit menu ========================================================
            else if(m == copy)
            {
                ta.setText("Edit-Copy was clicked");
            }
            else if(m == paste)
            {
                ta.setText("Edit-paste was clicked");
            }
            else if(m == find)
            {
                //puck up whole text in text box
                wholeText = ta.getText();
                //new dialog box
                findString = JOptionPane.showInputDialog(f, "Find what?", "Find Title", JOptionPane.INFORMATION_MESSAGE);
                
                ind = wholeText.indexOf(findString);
                System.out.println("find operation");
            }
            
            //format menu ======================================================
            else if(m == ucase)
            {
                //convert text to ucase
                String str = ta.getText();
                String strUpper = str.toUpperCase();
                ta.setText(strUpper);
            }
            else if(m == lcase)
            {
                //convert text to lcase
                String str = ta.getText();
                String strLower = str.toLowerCase();
                ta.setText(strLower);
            }
            else if(m == toggle)
            {
                //toggle case
                String str = ta.getText();
                int l = str.length();
                char ch[] = str.toCharArray();
                
                for(int i = 0; i < l; i++)
                {
                    if(ch[i] >= 65 && ch[i] <= 90)
                    {
                        ch[i] = (char)(ch[i] + 32);
                    }
                    else if(ch[i] >= 97 && ch[i] <= 122)
                    {
                        ch[i] = (char)(ch[i] - 32);
                    }
                }
                String toggledText = new String(ch);
                ta.setText(toggledText);
                System.out.println("Toggle case");
            }
            else if(m == vowels)
            {
                //counting number of vowels
                String str = ta.getText();
                int l = str.length();
                int vowelCount = 0;
                char ch[] = str.toCharArray();
                for(int i = 0; i < l; i++)
                {
                    if(ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U')
                    {
                        vowelCount++;
                    }
                }
                
                JOptionPane.showMessageDialog(f, "total vowels: " + vowelCount);
                
                System.out.println("counting vowels: " + vowelCount + " found");
            }
            else if(m == spaces)
            {
                //counting number of spaces
                String str = ta.getText();
                int l = str.length();
                int spaceCount = 0;
                char ch[] = str.toCharArray();
                for(int i = 0; i < l; i++)
                {
                    if(ch[i] == ' ')
                    {
                        spaceCount++;
                    }
                }
                JOptionPane.showMessageDialog(f, "total spaces: " + spaceCount);
                
                System.out.println("counting spaces: " + spaceCount + " found");
            }
            
            
            //help menu ========================================================
            else if(m == h)
            {
                ta.setText("Need some help?");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String args[])
    {
        Notepad002 n = new Notepad002();
    }
}
