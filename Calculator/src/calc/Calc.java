/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author admin
 */
public class Calc extends JFrame {
    JPanel display = new JPanel(new GridLayout(2,1));
    JTextArea display1= new JTextArea();
    JTextArea display2= new JTextArea();
    JPanel buttonPanel = new JPanel(new GridLayout(6,3));
    JButton bt0 = new JButton("0");
    JButton bt1 = new JButton("1");
    JButton bt2 = new JButton("2");
    JButton bt3 = new JButton("3");
    JButton bt4 = new JButton("4");
    JButton bt5 = new JButton("5");
    JButton bt6 = new JButton("6");
    JButton bt7 = new JButton("7");
    JButton bt8 = new JButton("8");
    JButton bt9 = new JButton("9");
    JButton btSum = new JButton("+");
    JButton btClr = new JButton("C");
    JButton btDvd = new JButton("/");
    JButton btSub = new JButton("-");
    JButton btMul = new JButton("*");
    JButton btStart = new JButton("=");
    JButton btFctrl = new JButton("!");
    String a;
    String operat = "+";
    String b;
      
    String oper(String e, String f) {
    String r = null;
               float c = Float.valueOf(e);
               float d = Float.valueOf(f);
               System.out.println("c = "+ c);
               System.out.println("d = "+ d);
               System.out.println("e = "+ e);
               System.out.println("f = "+ f);
                if("+".equals(operat)){
                  r=((c+d)+"");
                  }
                 if("-".equals(operat)){
                  r=((c-d)+"");
                }
                if("*".equals(operat)){
                  r=((c*d)+"");
                }
                if("/".equals(operat)){
                  r=((c/d)+"");
                }
                System.out.println("r = "+ r);
     return r;
}
    
    Calc() {
        setBounds(500, 300, 250, 300);
        bt0.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"0");
            if (a == null) {
                a = "0";
            }
                else a = a + "0";
                        
        });
        bt1.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"1");
              if (a == null) {
                a = "1";
            }
                else a = a + "1";
        });
        bt2.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"2");
             if (a == null) {
                a = "2";
            }
                else a = a + "2";
        });
        bt3.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"3");
            if (a == null) {
                a = "3";
            }
            else a = a + "3";
        });
        bt4.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"4");
            if (a == null) {
                a = "4";
            }
            else a = a + "4";
        });
        bt5.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"5");
            if (a == null) {
                a = "5";
            }
            else a = a + "5";
        });
        bt6.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"6");
            if (a == null) {
                a = "6";
            }
            else a = a + "6";
        });
        bt7.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"7");
            if (a == null) {
                a = "7";
            }
            else a = a + "7";
        });
        bt8.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"8");
            if (a == null) {
                a = "8";
            }
            else a = a + "8";
        });
        bt9.addActionListener((ActionEvent e) -> {
            display1.setText(display1.getText()+"9");
            if (a == null) {
                a = "9";
            }
            else a = a + "9";
        });
        btClr.addActionListener((ActionEvent e) -> {
            display1.setText("");
            display2.setText("");
            a = null;
            b = null;
        });
        btSum.addActionListener((ActionEvent e) -> {
            if (a != null){
                System.out.println("a = "+ a);
                System.out.println("b = "+ b);
                
                if (b == null) {
                    b = display1.getText();
                }
                else b = oper(a,b);
                display2.setText(b);
                display1.setText(display1.getText()+"+");
                a = null;
                operat = "+";
                System.out.println("a1 = "+ a);
                System.out.println("b2 = "+ b);
            }
        });
        btMul.addActionListener((ActionEvent e) -> {
            if (a != null){
                System.out.println("a = "+ a);
                System.out.println("b = "+ b);
                if (b == null) {
                    b = display1.getText();
                }
                else b = oper(a,b);
                display2.setText(b);
                display1.setText(display1.getText()+"*");
                a = null;
                operat = "*";
                System.out.println("a1 = "+ a);
                System.out.println("b2 = "+ b);
            }
        });
        btDvd.addActionListener((ActionEvent e) -> {
            //a = Integer.valueOf(c);
            // b = "";
            if (a != null){
                if (b == null) {
                    b = display1.getText();
                }
                else b = oper(a,b);
                display2.setText(b);
                display1.setText(display1.getText()+"/");
                a = null;
                operat = "/";
            }
        });
        btSub.addActionListener((ActionEvent e) -> {
            if (a != null){
                
                if (b == null) {
                    b = display1.getText();
                }
                else b = oper(a,b);
                display2.setText(b);
                display1.setText(display1.getText()+"-");
                a = null;
                operat = "-";
            }
        });
        
        btStart.addActionListener((ActionEvent e) -> {
            if (a == null) {
                a = b;
            }
            if (b != null) {
                display2.setText(oper(a,b));
                a = null;
                b = null;
                display1.setText("");
            }
        });
        
        
        btFctrl.addActionListener((ActionEvent e) -> {
        
        if (a != null){    
        long g = 1;
        long h;
        if (b == null){    
            b = a;
        }
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        h = Long.valueOf(b); 
        System.out.println("h = "+ h);
        display1.setText("");
        a = null;
        b = null;
        if (h == 0) {
        display2.setText("1"); 
        }
        for (long n=1; n<=h; n++){
             g = g * n;
        //     System.out.println("g= "+ g);                   
        }
        display2.setText(g+"");
        }
        });
        
        setLayout(new BorderLayout());
        add(display,BorderLayout.NORTH);
        add(buttonPanel,BorderLayout.CENTER);
        add(btStart,BorderLayout.EAST);
        display.add(display1);
        display.add(display2);       
        buttonPanel.add(bt7);
        buttonPanel.add(bt8);
        buttonPanel.add(bt9);
        buttonPanel.add(bt4);
        buttonPanel.add(bt5);
        buttonPanel.add(bt6);
        buttonPanel.add(bt1);
        buttonPanel.add(bt2);
        buttonPanel.add(bt3);
        buttonPanel.add(bt0);
        buttonPanel.add(btSum);
        buttonPanel.add(btSub);
        buttonPanel.add(btMul);
        buttonPanel.add(btDvd);
        buttonPanel.add(btClr);
        buttonPanel.add(btFctrl);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calc();
    }
}

