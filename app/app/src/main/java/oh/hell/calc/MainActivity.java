package oh.hell.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void clickonbtn1(View v){
        try{
            EditText num11 = (EditText)findViewById(R.id.num1);
            EditText num22 = (EditText)findViewById(R.id.num2);
            TextView ress = (TextView)findViewById(R.id.result);
            Double num1 = Double.parseDouble(num11.getText().toString());
            Double num2 = Double.parseDouble(num22.getText().toString());
            Double sum = num1+num2;
            ress.setText(Double.toString(sum));}catch (Exception e){
        }
    }
    public void clickonbtn2(View v){
        try {
            EditText num11 = (EditText)findViewById(R.id.num1);
            EditText num22 = (EditText)findViewById(R.id.num2);
            TextView ress = (TextView)findViewById(R.id.result);
            Double num1 = Double.parseDouble(num11.getText().toString());
            Double num2 = Double.parseDouble(num22.getText().toString());
            Double min=num1-num2;
            ress.setText(Double.toString(min));}catch (Exception e){}
    }
    public void clickonbtn3(View v){try{
        EditText num11 = (EditText)findViewById(R.id.num1);
        EditText num22 = (EditText)findViewById(R.id.num2);
        TextView ress = (TextView)findViewById(R.id.result);
        Double num1 = Double.parseDouble(num11.getText().toString());
        int num2 = Integer.parseInt(num22.getText().toString());
        Double mul = num1*num2;
        ress.setText(Double.toString(mul));}catch (Exception e){}
    }
    public void clickonbtn4(View v){try {
        EditText num11 = (EditText)findViewById(R.id.num1);
        EditText num22 = (EditText)findViewById(R.id.num2);
        TextView ress = (TextView)findViewById(R.id.result);
        Double num1 = Double.parseDouble(num11.getText().toString());
        int num2 = Integer.parseInt(num22.getText().toString());
        Double div = num1/num2;
        ress.setText(Double.toString(div));}catch (Exception e){}
    }

}
