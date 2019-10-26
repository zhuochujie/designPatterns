package com.mashibing.adapter;

import java.awt.*;
import java.awt.event.WindowAdapter;

public class AdapterTest {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
        });
    }
}
