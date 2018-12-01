package placementcell;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    int rno;
    int cid;
    
    public Test(int a, int b)
    {
        initComponents();
        getContentPane().setBackground(Color.yellow);
        setSize(720, 540);
        
        rno = a;
        cid = b;
        
        display();
    }
    
    void display()
    {
        //code;
        try
        {
            MyConnection obj = new MyConnection();
            String q = "select * from tbquestions where cid=?";
            PreparedStatement pst = obj.db.prepareStatement(q);
            
            pst.setInt(1, cid);
            
            ResultSet rs = pst.executeQuery();
            
            ArrayList<Question> cArray = new ArrayList<>();
            JRadioButton op1 = null, op2 = null, op3 = null, op4 = null;
            JLabel lop1 = null;
            int x = 20, y = 30, w = 500, h = 50;
            ButtonGroup b = null;
            
            while(rs.next())
            {
                b = new ButtonGroup();
                final Question c = new Question();
                
                c.setId(rs.getInt("id"));
                c.setQues(rs.getString("qname"));
                c.setOpt1(rs.getString("option1"));
                c.setOpt2(rs.getString("option2"));
                c.setOpt3(rs.getString("option3"));
                c.setOpt4(rs.getString("option4"));
                c.setCans(rs.getInt("canswer"));
                
                op1 = new JRadioButton(c.getOpt1());
                op2 = new JRadioButton(c.getOpt2());
                op3 = new JRadioButton(c.getOpt3());
                op4 = new JRadioButton(c.getOpt4());
                
                lop1 = new JLabel();
                lop1.setText(c.getQues());
                lop1.setBounds(x, y, w, h);
                
                y += 30;
                op1.setBounds(x, y, w, h);
                y += 30;
                op2.setBounds(x, y, w, h);
                y += 30;
                op3.setBounds(x, y, w, h);
                y += 30;
                op4.setBounds(x, y, w, h);
                y += 50;
                
                b.add(op1);
                b.add(op2);
                b.add(op3);
                b.add(op4);
                
                add(lop1);
                add(op1);
                add(op2);
                add(op3);
                add(op4);
                
                cArray.add(c);
                
                //by default uans is -1
                c.setUans(-1);
                
                //adding action listeners to each option of MCQ
                op1.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        c.setUans(1);
                    }
                });
                op2.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        c.setUans(2);
                    }
                });
                op3.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        c.setUans(3);
                    }
                });
                op4.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        c.setUans(4);
                    }
                });
                
            }
            
            
            JButton bsubmit = new JButton("Submit");
            bsubmit.setBounds(x, y+40, w, h);
            add(bsubmit);
            int a[] = new int[cArray.size()];
            bsubmit.addActionListener(new ActionListener() {
                
                public void actionPerformed(ActionEvent e) {
                    
                    int cans=0,inans=0,unatt=0;
                    
                    //traversing all questions
                    for(int i=0; i < cArray.size(); i++)
                    {
                        Question ca = null;
                        ca = (Question)cArray.get(i);
                        
                        
                        if(ca.getUans() == -1)
                        {
                            unatt++;
                        }
                        else if(ca.getUans() == ca.getCans())
                        {
                            cans++;
                        }
                        else
                        {
                            inans++;
                        }
                        
                        try
                        {
                            MyConnection obj1 = new MyConnection();
                            String q1 = "insert into tbresult(rno, cid, qid, uanswer, canswer, test_date) values(?,?,?,?,?,?)";
                            PreparedStatement pst1 = obj1.db.prepareStatement(q1);
                            
                            pst1.setInt(1, rno);
                            pst1.setInt(2, cid);
                            pst1.setInt(3, ca.getId());
                            pst1.setInt(4, ca.getUans());
                            pst1.setInt(5, ca.getCans());
                            Date d = new Date();
                            pst1.setString(6, ""+d);
                            pst1.executeUpdate();
                            
                            System.out.println("response recorded in tb");
                        }
                        catch(Exception ex)
                        {
                            System.out.println("Error from Test[block1]: " + ex.getMessage());
                        }
                       //System.out.println("Qname is " + ca.getQues() + " & answer is " + ca.getCans());
                    } //end of for loop
                    
                    
                    //entering details of test attempt
                    try
                    {
                        MyConnection obj2 = new MyConnection();
                        String q2 = "insert into tbscore(rno, cid, canswer, incorrectans, unattempted, date) values(?,?,?,?,?,?)";
                        PreparedStatement pst2 = obj2.db.prepareStatement(q2);

                        pst2.setInt(1, rno);
                        pst2.setInt(2, cid);
                        pst2.setInt(3, cans);
                        pst2.setInt(4, inans);
                        pst2.setInt(5, unatt);
                        Date d1 = new Date();
                        pst2.setString(6, ""+d1);
                        pst2.executeUpdate();
                        System.out.println("values added in tbscore");
                    }
                    catch(Exception ex2)
                    {
                        System.out.println("Error from Test[block2]: " + ex2.getMessage());
                    }
                    
                    //opening a new jFrame for "generate bar chart" button
                    
                    GenerateBarChart gbc = new GenerateBarChart(rno, cid);
                    gbc.setVisible(true);
                    
                }
                
            });
            this.setVisible(false);
            
        }
        catch(Exception e)
        {
            System.out.println("Error from Test[block3]: " + e.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new Test(1, 2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
