# Keep the launcher Activity entry point.
-keep class com.verba.guide.MainActivity { *; }

# WebView is used only with local packaged assets.
-dontwarn org.chromium.**
