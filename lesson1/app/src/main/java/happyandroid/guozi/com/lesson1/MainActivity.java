package happyandroid.guozi.com.lesson1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by guoxiaojiang on 16/6/28.
 */
public class MainActivity extends Activity implements View.OnClickListener {
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layou);
        mBtn = (Button) findViewById(R.id.myBtn);
        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.myBtn) {
            Toast.makeText(MainActivity.this, "Hello android!", Toast.LENGTH_LONG).show();
        }
    }
}
