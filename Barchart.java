
package barchart;
import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
/*<applet code="Barchart" width=600 height=200 >
 <param name="columns" value="2">
 <param name="c1" value="350">
 <param name="c2" value="400">
 <param name="label1" value=“80">
 <param name="label2" value="90">
 </applet>
*/

public class Barchart extends Applet {

                  int n=0;
                  String label[];
                  int value[];

                  @Override
          public void init(){        
                  try{
                        n = Integer.parseInt(getParameter("totcol"));
                        label = new String[n];
                        value = new int[n];

                  label[0] = getParameter("lbl1");
                  label[1] = getParameter("lbl2");
                  label[2] = getParameter("lbl3");
                  label[3] = getParameter("lbl4");

                  value[0] = Integer.parseInt(getParameter("c1"));
                  value[1] = Integer.parseInt(getParameter("c2"));
                  value[2] = Integer.parseInt(getParameter("c3"));
                  value[3] = Integer.parseInt(getParameter("c4"));
                  }  catch(Exception e) {}
           }

       
                  @Override
          public void paint(Graphics g){
                for (int i=0;i<n ;i++ )
                {
                      g.setColor(Color.red);
                      g.drawString(label[i],20,(i*50)+30);
                      g.setColor(Color.blue);
                      g.fillRect(50,(i*50)+10,value[i],40);
                      g.drawString("    " +value[i],value[i]+50,(i*50)+30);
                }
           }     
                
   }