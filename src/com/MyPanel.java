package com;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {
    final int panelLungime =1920;
    final int panelInaltime =300;
    Image imagine;
    Timer timer;
    int xVelocity = 10;
    int yVelocity = 10;

    int x=0;
    int y=0;

    MyPanel(){
        this.setPreferredSize(new Dimension(panelLungime,panelInaltime));
        this.setBackground(Color.white);
        imagine = new ImageIcon("logoRCO.png").getImage();
        timer= new Timer(10,this);
        timer.start();
    }
    public void paint (Graphics g){

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(imagine,x,y,null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (x>=panelLungime-imagine.getWidth(this)|| x<0)
        {
            xVelocity=xVelocity * (-1);
        }
//        if (y>=panelInaltime-imagine.getWidth(this)|| y<0)
//        {
//            yVelocity=yVelocity * (-1);
//        }
    x=x+xVelocity;
//        y=y+yVelocity;
    repaint();
    }
}
