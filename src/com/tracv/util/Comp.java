package com.tracv.util;

import javax.swing.*;
import java.awt.*;

/*
    Static methods for adding components
 */
public class Comp {

    public static void add(JComponent toAdd, JComponent addTo, int x, int y, int width, int height,
                           double weightx, double weighty, int fill, int anchor){
        if(!(addTo.getLayout() instanceof GridBagLayout)){
            addTo.setLayout(new GridBagLayout());
        }

        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = width;
        c.gridheight = height;
        c.fill = fill;
        c.anchor = anchor;
        c.gridx = x;
        c.gridy = y;
        c.weightx = weightx;
        c.weighty = weighty;

        addTo.add(toAdd, c);
    }
}