package com.joon.mushroom_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

private fun WebView.webChromeClient() {

}

class ViewActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        auth = Firebase.auth

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        //webView、url設定、Javascript表示設定
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

        //Firebase DB設定
        val database = Firebase.database
        val myBookMarkRef = database.getReference("Bookmark_ref")

        val url = intent.getStringExtra("url").toString()
        val imageUrl = intent.getStringExtra("imageUrl").toString()
        val title = intent.getStringExtra("title").toString()

        val Bookmark = findViewById<TextView>(R.id.bookMark)
        Bookmark.setOnClickListener {
            //urlだけではなく、contentsmodelを全部DBに入れる
            myBookMarkRef
                .child(auth.currentUser!!.uid)
                .push()
                .setValue(ContentsModel(url, imageUrl, title))
        }
    }
}

