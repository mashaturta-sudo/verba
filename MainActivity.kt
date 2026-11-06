package com.verba.rules

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.graphics.Color
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        val controller = WindowCompat.getInsetsController(window, window.decorView)
        controller.hide(WindowInsetsCompat.Type.navigationBars())
        controller.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.allowFileAccess = true
        web.webViewClient = WebViewClient()
        web.setBackgroundColor(Color.rgb(0, 170, 255))
        web.loadUrl("file:///android_asset/index.html")
        setContentView(web)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        val web = findViewById<WebView>(android.R.id.content)?.getChildAt(0) as? WebView
        if (web != null && web.canGoBack()) web.goBack() else super.onBackPressed()
    }
}
