/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_diegocruzjunniorsauceda;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author Junnior Sauceda
 */
public class Hilo extends Thread {
    private Color color;
    private JProgressBar jp;
    private JTextArea Area=new JTextArea();
    private String hola="";
    private String Adios="";
    private boolean vive=true;
    private int avance;
    
    public Hilo(){
        
    }
    public Hilo(Color c,JProgressBar J,JTextArea TA,String a,String h,int av){
        this.color=c;
        this.jp=J;
        jp.setForeground(c);
        this.Area=TA;
        this.hola=h;
        this.Adios=a;
        this.avance=av;
    }
    public Hilo(Color c,JProgressBar J,String a,int av){
        this.color=c;
        this.jp=J;
        jp.setBackground(c);
        this.Adios=a;
        this.avance=av;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public JProgressBar getJp() {
        return jp;
    }

    public void setJp(JProgressBar jp) {
        this.jp = jp;
    }

    public JTextArea getArea() {
        return Area;
    }

    public void setArea(JTextArea Area) {
        this.Area = Area;
    }

    public String getHola() {
        return hola;
    }

    public void setHola(String hola) {
        this.hola = hola;
    }
    
    @Override
    public void run(){
        
        
        while (vive) {            
            if(jp.getValue()>=100){
                Area.setText(hola);
                JOptionPane.showMessageDialog(null, Adios);
                jp.setValue(0);
                vive=false;
                jp.setVisible(false);
            }
            else{
               jp.setValue(jp.getValue()+avance);
               
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
