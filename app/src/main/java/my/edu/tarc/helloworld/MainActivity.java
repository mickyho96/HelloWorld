package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Module level variable
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resource class
        setContentView(R.layout.activity_main);

        //Link variable to UI component
        textView = (TextView) findViewById(R.id.textViewMessage);
    }

    public void showMessage(View v){
        textView.setText("Hi my name is Ho Wee Kee");
    }

    public void restoreMessage(View v){
        textView.setText(getString(R.string.app_name));
    }

}
