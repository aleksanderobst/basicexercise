package testKsiazkaJava9;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
/**
 * Program do przeglądania obrazów.
 * @version 1.22 2007-05-21
 * @author Cay Horstmann
 */
public class ImageViewer
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {


            public void run()
            {
                JFrame frame = new ImageViewerFrame();
                frame.setTitle("ImageViewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
