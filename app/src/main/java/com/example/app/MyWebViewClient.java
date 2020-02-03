package com.example.app;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.content.Context;

class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Uri uri = Uri.parse(url);
        if (uri.getHost() != null && uri.getHost().contains("lucidcouple.com")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }

}
