package company.kurro.sunshine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends Activity {
    static final String EXTRA_FORECAST = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        View rootView = findViewById(R.id.activity_detail);
        TextView textView = (TextView)findViewById(R.id.detail_forecast);
        Intent intent = getIntent();
        String forcastStr = intent.getStringExtra(EXTRA_FORECAST);
        textView.setText(forcastStr);
    }
}
