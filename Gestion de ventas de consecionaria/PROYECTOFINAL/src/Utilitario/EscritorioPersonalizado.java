/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilitario;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class EscritorioPersonalizado extends JPanel {
    
    private BufferedImage img;  

    public EscritorioPersonalizado() {
        try {
            
            img = ImageIO.read(getClass().getResourceAsStream("/IMAGENES/Login.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
