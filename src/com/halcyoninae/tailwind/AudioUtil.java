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

package com.halcyoninae.tailwind;

import com.halcyoninae.tailwind.simple.FileFormat;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import java.io.File;
import java.net.URL;

/**
 * @author Jack Meng
 * @since 3.1
 */
public final class AudioUtil {

  /**
   * @param locale
   * @return AudioInputStream
   */
  public static AudioInputStream getAudioIS(URL locale) {
    try {
      AudioInputStream ais;
      FileFormat target = FileFormat.getFormatByName(locale.toExternalForm());
      if (target.equals(FileFormat.MP3)) {
        ais = AudioSystem.getAudioInputStream(locale);
        AudioFormat base = ais.getFormat();
        AudioFormat decode = new AudioFormat(
            AudioFormat.Encoding.PCM_SIGNED,
            base.getSampleRate(),
            16,
            base.getChannels(),
            base.getChannels() * 2,
            base.getSampleRate(),
            false);
        ais = AudioSystem.getAudioInputStream(decode, ais);
        return ais;
      } else if (target.equals(FileFormat.WAV)) {
        ais = AudioSystem.getAudioInputStream(locale);
        return ais;
      } else if (target.equals(FileFormat.AIFF) || target.equals(FileFormat.AIFC)) {
        ais = AudioSystem.getAudioInputStream(locale);
        return ais;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * This writes an AudioInfo's properties to a file.
   *
   * This process writes to a folder and writes the following:
   * A file with all the attributes
   * A file with the image artwork
   *
   * @since 3.3
   * @param parentDir The folder to write to.
   * @param info      The AudioInfo object
   * @return The File as a directory that has been written to.
   */
  public static File writeAudioInfoConfig(File parentDir, AudioInfo info) {

  }
}
