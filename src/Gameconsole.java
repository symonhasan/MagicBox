

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;






/**
 *
 * @author Symon Hasan
 */
public class Gameconsole extends javax.swing.JFrame {

    String s,t;
    static String name;
    int n1,n2,n3,n4,n5,n6,n7,n8,n9,count=0;
    boolean nameflag=false,stoptime=false;
    ScoreUI ob=new ScoreUI();

    
    void check()
    {
        
        n1=Integer.parseInt(box1.getText());
        n2=Integer.parseInt(box2.getText());
        n3=Integer.parseInt(box3.getText());
        n4=Integer.parseInt(box4.getText());
        n5=Integer.parseInt(box5.getText());
        n6=Integer.parseInt(box6.getText());
        n7=Integer.parseInt(box7.getText());
        n8=Integer.parseInt(box8.getText());
        n9=Integer.parseInt(box9.getText());
        
        System.out.println(n1+" " +n2 + " "+n3+" "+n4+" " +n5 + " "+n6+" "+n7+" " +n8 + " "+n9);
        
        if((n1+n2+n3==15) && (n4+n5+n6==15) && (n7+n8+n9==15) && (n1+n5+n9==15) && (n3+n5+n7==15) && 
                (n1+n4+n7==15)&&(n2+n5+n8==15)&&(n3+n6+n9==15))
        {
            stoptime=true;
            
           JOptionPane.showMessageDialog(this,"You Win");
           ob.name=namebox.getText();
            ob.s1=timebox.getText();
            ob.set();
           
        }
        else
        {
            JOptionPane.showMessageDialog(this,"You Lost");
            box1.setText("");
            box2.setText("");
            box3.setText("");
            box4.setText("");
            box5.setText("");
            box6.setText("");
            box7.setText("");
            box8.setText("");
            box9.setText("");
            count=0;
            one.setEnabled(true);
            two.setEnabled(true);
            three.setEnabled(true);
            four.setEnabled(true);
            five.setEnabled(true);
            six.setEnabled(true);
            seven.setEnabled(true);
            eight.setEnabled(true);
            nine.setEnabled(true);
            zero.setEnabled(true);
            stoptime=false;
        }
        
    }
    
    public Gameconsole(){
        initComponents();
        namebox.setText(name);
        Timer t= new Timer();
        count=0;
        TimerTask tk = new TimerTask() {         
            public void run() {
                if(!stoptime)
                {
                timebox.setText(" "+Integer.toString(count)+"sec");
                count ++;
                }
                if(stoptime)
                {
                    ob.name=namebox.getText();
                    ob.s1=timebox.getText();
                    ob.set();
                }
            }
        };
        t.scheduleAtFixedRate(tk, 1000, 1000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        box3 = new javax.swing.JTextField();
        box1 = new javax.swing.JTextField();
        box6 = new javax.swing.JTextField();
        box2 = new javax.swing.JTextField();
        box4 = new javax.swing.JTextField();
        box8 = new javax.swing.JTextField();
        box5 = new javax.swing.JTextField();
        box9 = new javax.swing.JTextField();
        box7 = new javax.swing.JTextField();
        button8 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        botton1 = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        three = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        five = new javax.swing.JButton();
        one = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        two = new javax.swing.JButton();
        four = new javax.swing.JButton();
        six = new javax.swing.JButton();
        timebox = new javax.swing.JLabel();
        namebox = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GAMECONSOLE");
        setPreferredSize(new java.awt.Dimension(500, 512));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 512));
        jPanel1.setLayout(null);

        box3.setEditable(false);
        box3.setFont(new java.awt.Font("Type Keys", 0, 36)); // NOI18N
        box3.setForeground(new java.awt.Color(153, 0, 0));
        box3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box3);
        box3.setBounds(280, 110, 50, 50);

        box1.setEditable(false);
        box1.setFont(new java.awt.Font("Type Keys", 0, 36)); // NOI18N
        box1.setForeground(new java.awt.Color(153, 0, 0));
        box1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box1);
        box1.setBounds(160, 110, 50, 50);

        box6.setEditable(false);
        box6.setFont(new java.awt.Font("Type Keys", 0, 36)); // NOI18N
        box6.setForeground(new java.awt.Color(153, 0, 0));
        box6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box6);
        box6.setBounds(280, 170, 50, 50);

        box2.setEditable(false);
        box2.setFont(new java.awt.Font("Type Keys", 0, 36)); // NOI18N
        box2.setForeground(new java.awt.Color(153, 0, 0));
        box2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box2);
        box2.setBounds(220, 110, 50, 50);

        box4.setEditable(false);
        box4.setFont(new java.awt.Font("Type Keys", 0, 36)); // NOI18N
        box4.setForeground(new java.awt.Color(153, 0, 0));
        box4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box4);
        box4.setBounds(160, 170, 50, 50);

        box8.setEditable(false);
        box8.setFont(new java.awt.Font("Type Keys", 0, 36)); // NOI18N
        box8.setForeground(new java.awt.Color(153, 0, 0));
        box8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box8);
        box8.setBounds(220, 230, 50, 50);

        box5.setEditable(false);
        box5.setFont(new java.awt.Font("Type Keys", 0, 36)); // NOI18N
        box5.setForeground(new java.awt.Color(153, 0, 0));
        box5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box5);
        box5.setBounds(220, 170, 50, 50);

        box9.setEditable(false);
        box9.setFont(new java.awt.Font("Type Keys", 0, 36)); // NOI18N
        box9.setForeground(new java.awt.Color(153, 0, 0));
        box9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box9);
        box9.setBounds(280, 230, 50, 50);

        box7.setEditable(false);
        box7.setFont(new java.awt.Font("Type Keys", 0, 36)); // NOI18N
        box7.setForeground(new java.awt.Color(153, 0, 0));
        box7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(box7);
        box7.setBounds(160, 230, 50, 50);

        button8.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        button8.setForeground(java.awt.SystemColor.textHighlight);
        button8.setText("8");
        button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel1.add(button8);
        button8.setBounds(280, 410, 50, 40);

        button4.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        button4.setForeground(java.awt.SystemColor.textHighlight);
        button4.setText("4");
        button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4);
        button4.setBounds(340, 360, 50, 40);

        button5.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        button5.setForeground(java.awt.SystemColor.textHighlight);
        button5.setText("5");
        button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel1.add(button5);
        button5.setBounds(100, 410, 50, 40);

        button6.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        button6.setForeground(java.awt.SystemColor.textHighlight);
        button6.setText("6");
        button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel1.add(button6);
        button6.setBounds(160, 410, 50, 40);

        button9.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        button9.setForeground(java.awt.SystemColor.textHighlight);
        button9.setText("9");
        button9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel1.add(button9);
        button9.setBounds(340, 410, 50, 40);

        button7.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        button7.setForeground(java.awt.SystemColor.textHighlight);
        button7.setText("7");
        button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel1.add(button7);
        button7.setBounds(220, 410, 50, 40);

        button0.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        button0.setForeground(java.awt.SystemColor.textHighlight);
        button0.setText("0");
        button0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });
        jPanel1.add(button0);
        button0.setBounds(100, 360, 50, 40);

        button2.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        button2.setForeground(java.awt.SystemColor.textHighlight);
        button2.setText("2");
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(220, 360, 50, 40);

        button3.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        button3.setForeground(java.awt.SystemColor.textHighlight);
        button3.setText("3");
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3);
        button3.setBounds(280, 360, 50, 40);

        botton1.setFont(new java.awt.Font("HACKED", 0, 18)); // NOI18N
        botton1.setForeground(java.awt.SystemColor.textHighlight);
        botton1.setText("1");
        botton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton1ActionPerformed(evt);
            }
        });
        jPanel1.add(botton1);
        botton1.setBounds(160, 360, 50, 40);

        seven.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        seven.setForeground(new java.awt.Color(0, 153, 153));
        seven.setText("7");
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel1.add(seven);
        seven.setBounds(100, 180, 40, 40);

        eight.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        eight.setForeground(new java.awt.Color(0, 153, 153));
        eight.setText("8");
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        jPanel1.add(eight);
        eight.setBounds(400, 230, 40, 40);

        three.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        three.setForeground(new java.awt.Color(0, 153, 153));
        three.setText("3");
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel1.add(three);
        three.setBounds(0, 180, 40, 40);

        nine.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        nine.setForeground(new java.awt.Color(0, 153, 153));
        nine.setText("9");
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel1.add(nine);
        nine.setBounds(50, 230, 40, 40);

        five.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        five.setForeground(new java.awt.Color(0, 153, 153));
        five.setText("5");
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel1.add(five);
        five.setBounds(50, 180, 40, 40);

        one.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        one.setForeground(new java.awt.Color(0, 153, 153));
        one.setText("1");
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel1.add(one);
        one.setBounds(50, 130, 40, 40);

        zero.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        zero.setForeground(new java.awt.Color(0, 153, 153));
        zero.setText("0");
        zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        jPanel1.add(zero);
        zero.setBounds(400, 130, 40, 40);

        two.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        two.setForeground(new java.awt.Color(0, 153, 153));
        two.setText("2");
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel1.add(two);
        two.setBounds(350, 180, 40, 40);

        four.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        four.setForeground(new java.awt.Color(0, 153, 153));
        four.setText("4");
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel1.add(four);
        four.setBounds(400, 180, 40, 40);

        six.setFont(new java.awt.Font("HACKED", 0, 12)); // NOI18N
        six.setForeground(new java.awt.Color(0, 153, 153));
        six.setText("6");
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel1.add(six);
        six.setBounds(450, 180, 40, 40);

        timebox.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        timebox.setForeground(new java.awt.Color(0, 102, 51));
        jPanel1.add(timebox);
        timebox.setBounds(360, 10, 120, 30);

        namebox.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        namebox.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(namebox);
        namebox.setBounds(100, 20, 160, 30);

        jLabel1.setFont(new java.awt.Font("1942 report", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.textHighlight);
        jLabel1.setText("NUMBERS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 290, 100, 20);

        jLabel3.setFont(new java.awt.Font("1942 report", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.textHighlight);
        jLabel3.setText("NUMBERS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 290, 100, 20);

        Back.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Back.setForeground(java.awt.SystemColor.textHighlight);
        Back.setText("BACK");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 380, 70, 50);

        reset.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        reset.setForeground(java.awt.SystemColor.textHighlight);
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(410, 380, 75, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gameconsole.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 510, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        s="1";
        one.setEnabled(false);
    }//GEN-LAST:event_oneActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        s="0";
        zero.setEnabled(false);
    }//GEN-LAST:event_zeroActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        s="2";
        two.setEnabled(false);
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        s="3";
        three.setEnabled(false);
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        s="4";
        four.setEnabled(false);
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        s="5";
        five.setEnabled(false);
    }//GEN-LAST:event_fiveActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        s="7";
        seven.setEnabled(false);
    }//GEN-LAST:event_sevenActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        s="6";
        six.setEnabled(false);
    }//GEN-LAST:event_sixActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        s="9";
        nine.setEnabled(false);
    }//GEN-LAST:event_nineActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        s="8";
        eight.setEnabled(false);
    }//GEN-LAST:event_eightActionPerformed

    private void botton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton1ActionPerformed
       if(box1.getText().isEmpty())
       {
           box1.setText(s);
           s="";
           check();
       }
      
        
    }//GEN-LAST:event_botton1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        if(box2.getText().isEmpty())
       {
           box2.setText(s);
           s="";
           check();
       }
       
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        if(box3.getText().isEmpty())
       {
           box3.setText(s);
           s="";
           check();
       }
       
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if(box4.getText().isEmpty())
       {
           box4.setText(s);
           s="";
           check();
       }
       
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        if(box5.getText().isEmpty())
       {
           box5.setText(s);
           s="";
           check();
       }
       
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        if(box6.getText().isEmpty())
       {
           box6.setText(s);
           s="";
           check();
       }
       
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        if(box7.getText().isEmpty())
       {
           box7.setText(s);
           s="";
           check();
       }
       
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        if(box8.getText().isEmpty())
       {
           box8.setText(s);
           s="";
           check();
       }
       
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        if(box9.getText().isEmpty())
       {
           box9.setText(s);
           s="";
           check();
       }
       
    }//GEN-LAST:event_button9ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Main ob1=new Main();
        
        ob1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        zero.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        box1.setText("");
        box2.setText("");
        box3.setText("");
        box4.setText("");
        box5.setText("");
        box6.setText("");
        box7.setText("");
        box8.setText("");
        box9.setText("");
        stoptime=false;
        count=0;
    }//GEN-LAST:event_resetActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button0ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gameconsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gameconsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gameconsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gameconsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gameconsole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton botton1;
    private javax.swing.JTextField box1;
    private javax.swing.JTextField box2;
    private javax.swing.JTextField box3;
    private javax.swing.JTextField box4;
    private javax.swing.JTextField box5;
    private javax.swing.JTextField box6;
    private javax.swing.JTextField box7;
    private javax.swing.JTextField box8;
    private javax.swing.JTextField box9;
    private javax.swing.JButton button0;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namebox;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JLabel timebox;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
