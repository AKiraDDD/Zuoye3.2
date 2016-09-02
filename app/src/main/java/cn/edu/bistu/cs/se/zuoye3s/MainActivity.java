package cn.edu.bistu.cs.se.zuoye3s;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        final TextView mytext = (TextView) findViewById(R.id.mytext);
        CheckBox cbMi = (CheckBox) findViewById(R.id.CheckMi);
        CheckBox cbHuawei = (CheckBox) findViewById(R.id.CheckHuawei);
        CheckBox cbMeizu = (CheckBox) findViewById(R.id.CheckMeizu);
        CheckBox cbSmartisan = (CheckBox) findViewById(R.id.CheckSmartisan);
        RadioButton rbm = (RadioButton) findViewById(R.id.male);
        RadioButton rbf = (RadioButton) findViewById(R.id.female);
        cbMi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    txtResult.setText("您选择了：小米");
            }
        });
        cbHuawei.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    txtResult.setText("您选择了：华为");
            }
        });
        cbMeizu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    txtResult.setText("您选择了：魅族");
            }
        });
        cbSmartisan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    txtResult.setText("您选择了：锤子");
            }
        });
        rbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    mytext.setText("您的性别为：男");
            }
        });
        rbf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    mytext.setText("您的性别为：女");
            }
        });
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
