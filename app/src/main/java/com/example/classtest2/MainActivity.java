package com.example.classtest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1 = findViewById(R.id.txt1);
        Button btnSave = findViewById(R.id.btnSave);
        ImageView imgProfile = findViewById(R.id.imgProfile);
        TextView txtHtml = findViewById(R.id.txtHtml);
        WebView web = findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.digikala.com");

        txt1.setText("Started");
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Item Saved", Toast.LENGTH_LONG).show();
            }
        });
        txtHtml.setText(HtmlCompat.fromHtml("<h2>Title</h2><br><p>Description here</p>",HtmlCompat.FROM_HTML_MODE_COMPACT));
        

    }
}