package com.joon.mushroom_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

private fun WebView.webChromeClient() {

}

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val webView = findViewById<WebView>(R.id.webView)
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        webSettings.javaScriptCanOpenWindowsAutomatically = true

        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = WebViewClient()


        webView.loadUrl(intent.getStringExtra("url").toString())


    }
}

