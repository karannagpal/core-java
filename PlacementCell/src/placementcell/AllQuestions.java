package placementcell;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class AllQuestions extends javax.swing.JFrame {

    public AllQuestions()
    {
        initComponents();
        display();
    }

    void display()
    {
        try
        {
            MyConnection obj = new MyConnection();
            String q = "select * from tbquestions";
            PreparedStatement pst = obj.db.prepareStatement(q);
            
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
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Error from AllQuestions: " + e.getMessage());
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(AllQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AllQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AllQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AllQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new AllQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}