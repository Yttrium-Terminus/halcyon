package com.jackmeng.music;

/**
 * A global scope project manager that contains
 * constants to most used objects and values throughout the
 * program.
 */
public interface Manager {

  /// BIGCONTAINER Size Config START ///
  public static final int MIN_WIDTH = 500;
  public static final int MIN_HEIGHT = 600;

  public static final int MAX_WIDTH = MIN_HEIGHT + 40;
  public static final int MAX_HEIGHT = MIN_HEIGHT + 40;
  /// BIGCONTAINER Size Config END ///

  /// FILEVIEW Size Config START ///
  public static final int FILEVIEW_MIN_WIDTH = MIN_WIDTH - 70;
  public static final int FILEVIEW_MIN_HEIGHT = MIN_HEIGHT - 50 / 2;

  public static final int FILEVIEW_MAX_WIDTH = MAX_WIDTH - 50;
  public static final int FILEVIEW_MAX_HEIGHT = MAX_HEIGHT + 50 / 2 - 40;
  /// FILEVIEW Size Config END ///

  /// B Bloc Size Config START ///
  public static final int B_MIN_WIDTH = MIN_WIDTH - FILEVIEW_MIN_WIDTH - 40;
  public static final int B_MIN_HEIGHT = MIN_HEIGHT / 2;

  public static final int B_MAX_WIDTH = B_MIN_WIDTH - FILEVIEW_MAX_WIDTH;
  public static final int B_MAX_HEIGHT = MAX_HEIGHT / 2;
  /// B Bloc Size Config END ///

  /// GENERAL RESOURCE LOCATION START
  public static final String RSC_FOLDER_NAME = "resource";
  /// GENERAL RESOURCE LOCATION END

  /// GENERAL PROGRAM CONFIGURATION START
  public static final String[] ALLOWED_FORMATS = new String[] { "wav", "mp3" };
  public static final int TAB_VIEW_MAX_CHAR_LENGTH = 10;
  /// GENERAL PROGRAM CONFIGURATION END

  /// BEGIN RESOURCE LOCATION FOR ICONS
  public static final String FILEVIEW_ICON_FOLDER_OPEN = RSC_FOLDER_NAME + "/fileview/folder_icon.png";
  public static final String FILEVIEW_ICON_FOLDER_CLOSED = RSC_FOLDER_NAME + "/fileview/folder_icon.png";
  public static final String FILEVIEW_ICON_FILE = RSC_FOLDER_NAME + "/fileview/leaf.png";
  public static final String FILEVIEW_DEFAULT_FOLDER_ICON = RSC_FOLDER_NAME + "/fileview/folder_icon.png";

  public static final String PROGRAM_ICON_LOGO = RSC_FOLDER_NAME + "/app/logo.png";
  /// END RESOURCE LOCATION FOR ICONS

  /// TOPPane Wrapper Config START
  public static final int TOPPANE_MIN_WIDTH = MIN_WIDTH - FILEVIEW_MIN_WIDTH;
  public static final int TOPPANE_MIN_HEIGHT = MIN_HEIGHT / 2;

  public static final int TOPPANE_MAX_WIDTH = TOPPANE_MIN_WIDTH - FILEVIEW_MAX_WIDTH;
  public static final int TOPPANE_MAX_HEIGHT = MAX_HEIGHT / 2;
  /// TOPPane Wrapper Config END

  /// ButtonControl Config START
  public static final int BUTTONCONTROL_MIN_WIDTH = MIN_WIDTH;
  public static final int BUTTONCONTROL_MIN_HEIGHT = MIN_HEIGHT / 4;

  public static final int BUTTONCONTROL_MAX_WIDTH = MAX_WIDTH;
  public static final int BUTTONCONTROL_MAX_HEIGHT = MAX_HEIGHT / 4;
  /// ButtonControl Config END

  /// InfoView Config START
  public static final int INFOVIEW_MIN_WIDTH = MIN_WIDTH;
  public static final int INFOVIEW_MIN_HEIGHT = MIN_HEIGHT / 4;

  public static final int INFOVIEW_MAX_WIDTH = MAX_WIDTH;
  public static final int INFOVIEW_MAX_HEIGHT = MAX_HEIGHT / 4;
  /// InfoView Config END

  /// DIALOG_ERROR Config START
  public static final int DIALOG_ERROR_MIN_WIDTH = 300;
  public static final int DIALOG_ERROR_MIN_HEIGHT = 150;
  
  public static final String DIALOG_ERROR_WIN_TITLE = "Exception!";
  /// DIALOG_ERROR Config END

  /// TABBED View Config Start
  public static final String ATTRIBUTES_TAB_ICON = RSC_FOLDER_NAME + "/tabsview/attributes_tab.png";
  public static final String PLAYLIST_TAB_ICON = RSC_FOLDER_NAME + "/tabsview/playlist_tab.png";

  public static final String FILEVIEW_DEFAULT_TAB_NAME = "Playlist";
  public static final String ATTRIBUTES_DEFAULT_TAB_NAME = "Attributes";

  public static final String FILEVIEW_DEFAULT_TAB_TOOLTIP = "View your selected playlist(s) here.";
  public static final String ATTRIBUTES_DEFAULT_TAB_TOOLTIP = "View important properties regarding the program.";

  public static final int TAB_VIEW_MIN_TEXT_STRIP_LENGTH = 10;
  /// TABBED View Config End

  /// BBLOC BUTTONS Config START
  public static final String ADDFOLDER_BUTTON_TEXT = "+";

  /// BBLOC BUTTONS Config END
}