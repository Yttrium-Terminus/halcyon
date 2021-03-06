package com.halcyoninae.cosmos.components.inheritable;

import com.halcyoninae.halcyon.debug.Debugger;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.*;

public class TruncLabelUI extends BasicLabelUI {
  private int before, after;


  /**
   * @param l
   * @param fontMetrics
   * @param text
   * @param icon
   * @param viewR
   * @param iconR
   * @param textR
   * @return String
   */
  @Override
  protected String layoutCL(JLabel l, FontMetrics fontMetrics, String text, Icon icon, Rectangle viewR, Rectangle iconR,
      Rectangle textR) {
    before = text.length();
    String s = super.layoutCL(
        l, fontMetrics, text, icon, viewR, iconR, textR);
    after = s.length();
    Debugger.warn(s);
    return s;
  }


  /**
   * @return int
   */
  public int getBefore() {
    return before;
  }


  /**
   * @return int
   */
  public int getAfter() {
    return after;
  }
}
