package com.mashibing.adapter;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *常见的Adapter类反而不是Adapter模式
         WindowAdapter
         KeyAdapter
 */
public class AdapterTest {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }
        });
    }
}
