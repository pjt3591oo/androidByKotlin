package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true
        webView.settings.blockNetworkImage = false
        webView.settings.loadsImagesAutomatically = true

        webView.settings.domStorageEnabled = true
        webView.settings.allowContentAccess = true

        // 웹 뷰에서 새 창이 뜨지 않도록 방지
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()

        webView.loadUrl("https://www.naver.com")
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) { // 웹 뷰에서 뒤로 갈 페이지가 있다면?
            webView.goBack()       // 뒤로가기
        } else {
            super.onBackPressed()
        }
    }

    override fun onDestroy() {
        webView.clearHistory()
        webView.clearCache(true)
        webView.clearView()
        super.onDestroy()
    }
}