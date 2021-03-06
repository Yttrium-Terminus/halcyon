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

import com.halcyoninae.cosmos.components.bbloc.BBlocButton;
import com.halcyoninae.cosmos.components.minimizeplayer.MiniPlayer;
import com.halcyoninae.cosmos.components.minimizeplayer.MiniPlayerListener;
import com.halcyoninae.halcyon.constant.Global;
import com.halcyoninae.halcyon.constant.Manager;
import com.halcyoninae.halcyon.utils.DeImage;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author Jack Meng
 * @since 3.2
 */
public class MinimizePlayer extends JButton implements BBlocButton {
  private boolean pressed = false;
  private MiniPlayer player;

  public MinimizePlayer() {
    setIcon(DeImage.resizeImage(Global.rd.getFromAsImageIcon(Manager.BBLOC_MINIMIZED_PLAYER), 16, 16));
    setToolTipText("Launch the audio player in a mini display form factor");
    setRolloverEnabled(false);
    setBorder(null);
    setOpaque(true);
    setDoubleBuffered(true);
    setBackground(null);
    addActionListener(this);
    player = new MiniPlayer();
    player.setMiniPlayerListener(new MiniPlayerListener() {
      @Override
      public void closingWindow() {
        pressed = false;
      }
    });
  }

  /**
   * @param e
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    if (!pressed) {
      player.run();
      pressed = true;
    }
  }

  /**
   * @return JComponent
   */
  @Override
  public JComponent getComponent() {
    return this;
  }

}
