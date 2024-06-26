package app.revanced.bilibili.patches;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;

public class UpRcmdAdsPatch {
    @Keep
    public static boolean blockUpRcmdAds() {
        return Settings.BlockUpRcmdAds.get();
    }
}
