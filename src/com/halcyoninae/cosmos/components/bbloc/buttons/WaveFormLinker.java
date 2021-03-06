/*
 *  Copyright: (C) 2022 name of Jack Meng
 * Halcyon MP4J is music-playing software.
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; If not, see <http://www.gnu.org/licenses/>.
 */

package com.halcyoninae.cosmos.components.bbloc.buttons;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import com.halcyoninae.cosmos.components.bbloc.BBlocButton;
import com.halcyoninae.cosmos.components.waveform.WaveFormPane;
import com.halcyoninae.halcyon.constant.Global;

/**
 * @author Jack Meng
 * @since 3.2
 */
public class WaveFormLinker extends JButton implements BBlocButton {
  private WaveFormPane pane;

  public WaveFormLinker() {
    setPreferredSize(new Dimension(16, 16));
    addActionListener(this);
    pane = new WaveFormPane();
    Global.player.getStream().setFrameBufferListener(Global.waveForm);
  }


  /**
   * @return JComponent
   */
  @Override
  public JComponent getComponent() {
    return this;
  }


  /**
   * @param e
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    SwingUtilities.invokeLater(pane::run);
  }

}
