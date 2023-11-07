adb root
adb logcat -b all -c && adb shell stop && adb shell start && adb logcat -b all > 111.txt
PAUSE