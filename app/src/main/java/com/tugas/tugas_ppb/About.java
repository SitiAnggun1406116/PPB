package com.tugas.tugas_ppb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends AppCompatActivity {
    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        browser=(WebView)findViewById(R.id.about_apps);
        //Use same layout and manifest of previous example
        browser.loadData("" +
                "<html>" +
                "   <body>" +
                "  <title>About Aplikasi </title>" +
                "<p>" +
                "Aplikasi ini aplikasi pencatatan waktu olahraga." +
                "Aplikasi ini dibuat oleh :<br/>" +
                "Delina Permatasari (1406029)<br/>" +
                "Siti Anggun Haerunisa (1406116)<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");
    }
}
