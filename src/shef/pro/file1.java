package shef.pro;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class file1 extends Activity {
	private WebView webview;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        webview=(WebView)findViewById(R.id.webView1);
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadUrl("https://z-lib.org/");
        webview.setWebViewClient(new WebViewClient());
        
    }
    
    
    public void onBackPressed(){
    	if(webview.canGoBack()){
    		webview.goBack();
    	}
    	else
    	{
    		super.onBackPressed();
    	}
    }
}