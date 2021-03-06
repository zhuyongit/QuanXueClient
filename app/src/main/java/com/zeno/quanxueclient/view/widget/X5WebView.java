package com.zeno.quanxueclient.view.widget;
// +----------------------------------------------------------------------
// | QuanXue
// +----------------------------------------------------------------------
// | CreateDate : 2016/12/16
// +----------------------------------------------------------------------
// | Author: Zeno <zhuyongit@gmail.com>
// +----------------------------------------------------------------------

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class X5WebView extends WebView {


    private WebPageLoadListener webPageLoadListener;

    public X5WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setWebViewClient(client);

        initWebViewSettings();

    }


    /**
     * 设置webview常规参数
     */
    private void initWebViewSettings() {
        WebSettings webSetting = this.getSettings();
        webSetting.setJavaScriptEnabled(true);
        webSetting.setJavaScriptCanOpenWindowsAutomatically(true);
        webSetting.setAllowFileAccess(true);
        webSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSetting.setSupportZoom(false);
        webSetting.setBuiltInZoomControls(false);
        webSetting.setUseWideViewPort(false);
        webSetting.setSupportMultipleWindows(true);
        webSetting.setAppCacheEnabled(true);
        webSetting.setDatabaseEnabled(true);
        webSetting.setDomStorageEnabled(true);
        webSetting.setAppCacheMaxSize(Long.MAX_VALUE);
        webSetting.setPluginState(WebSettings.PluginState.ON_DEMAND);
        webSetting.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webSetting.setCacheMode(WebSettings.LOAD_NO_CACHE);

    }


    private WebViewClient client = new WebViewClient() {
        /**
         * 防止加载网页时调起系统浏览器
         */
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            if (webPageLoadListener != null)
                webPageLoadListener.shouldOverrideUrlLoading(view,url);
            return true;
        }


        @Override
        public void onPageFinished(WebView webView, String s) {
            super.onPageFinished(webView, s);
            if (webPageLoadListener != null)
                webPageLoadListener.onPageFinished(webView,s);
        }

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            super.onReceivedError(view, request, error);
            if (webPageLoadListener != null)
                webPageLoadListener.onReceivedError(view,request);
        }


    };


    public interface WebPageLoadListener{
        void shouldOverrideUrlLoading(WebView view, String url);
        void onPageFinished(WebView webView, String s);
        void onReceivedError(WebView webView, WebResourceRequest webResourceRequest);
    }

    public void setWebPageLoadListener(WebPageLoadListener webPageLoadListener) {
        this.webPageLoadListener = webPageLoadListener;
    }
}
