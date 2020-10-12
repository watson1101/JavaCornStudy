package com.hong.simpleFrame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SimpleFrameMain {

    public static void main(String[] args) {
        // 事件分派线程
        EventQueue.invokeLater(
            new Runnable() {
                @Override
                public void run() {
                    SimpleFrameDemo frame = new SimpleFrameDemo();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            }
        );
    }
}
