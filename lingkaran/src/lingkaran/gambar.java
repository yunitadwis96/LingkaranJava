/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lingkaran;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author CHhannZ
 */
public class gambar extends JPanel {
    private int xc,yc,r;

    public int getxc() {
        return xc; 
    }

    public int getyc() {
        return yc;
    }

    public int getr() {
        return r;
    }

    public void setxc(int xa) {
        xc = xa;
    }

    public void setyc(int ya) {
        yc = ya;
    }

    
    public void setr(int jari2) {
        r = jari2; //mengeset r dengan nilai jari2
    }

    public void paint(Graphics g) {     
        int p =  1-r; //nilai perubahan posisi titiknya
        int x = 0;  //penentuan titik awal x lingkaran sebelum di translasi & pencerminan
        int y = r; //penentuan titik awal y lingkaran sebelum di translasi & pencerminan

        super.paint(g);
        this.setBackground(Color.PINK);
        
        g.setColor(Color.GRAY);
        
        //
        while(x<=y) { //kondisi untuk menentukan titik P selanjutnya
            x++;
            if (p<0) {      //kondisi jika P < 0 
               p+=2*x+1;    //maka pakai rumus P selanjutnya = P+(2x)+1
            } else {
                y--;        //kondisi jika P > 0 dan P = 0
                p+=2*(x-y)+1; //rumusnya P selanjutnya = P+(2*(x-y))+1
            }
            
            g.drawRect(xc+x, yc+y, 1, 1); //translasi & pencerminan titik
            g.drawRect(xc-x, yc+y, 1, 1); //translasi & pencerminan titik
            g.drawRect(xc+x, yc-y, 1, 1); //translasi & pencerminan titik
            g.drawRect(xc-x, yc-y, 1, 1); //translasi & pencerminan titik
            g.drawRect(xc+y, yc+x, 1, 1); //translasi & pencerminan titik
            g.drawRect(xc-y, yc+x, 1, 1); //translasi & pencerminan titik
            g.drawRect(xc+y, yc-x, 1, 1); //translasi & pencerminan titik
            g.drawRect(xc-y, yc-x, 1, 1); //translasi & pencerminan titik
        }
        
    }
}
