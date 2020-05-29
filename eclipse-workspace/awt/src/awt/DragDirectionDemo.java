package awt;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DragDirectionDemo {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame("Drag Direction Demo");
                frame.setSize(500, 500);
                frame.setVisible(true);
                frame.addMouseListener(new MouseListener() {

                    float lastY = 0;
                    float lastX = 0;

                    public void mouseReleased(MouseEvent e) {
                        if (e.getY() < lastY) {
                            System.out.println("Upward swipe");
                        } else if (e.getY() > lastY) {
                            System.out.println("Downward swipe");
                        } 
                        if(e.getX() < lastX)  System.out.println("Right swipe");   
                        else System.out.println("left swipe");
                        
                    }

                    public void mousePressed(MouseEvent e) {

                        lastY = e.getY();
                        lastX = e.getX();
                    }

                    public void mouseEntered(MouseEvent e) {
                    }

                    public void mouseExited(MouseEvent e) {
                    }

                    public void mouseClicked(MouseEvent e) {
                    }
                });
            }
        });
    }
}