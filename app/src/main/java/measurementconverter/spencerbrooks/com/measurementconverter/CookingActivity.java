package measurementconverter.spencerbrooks.com.measurementconverter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class CookingActivity extends Activity {

    private Spinner cookingSpinnerOptionOne;
    private Spinner cookingSpinnerOptionsTwo;
    private EditText editCookingTextView;
    private TextView cookingTextViewOne;
    private Button cookingConvertButton;
    DecimalFormat bigger = new DecimalFormat("0.00");
    DecimalFormat biggest = new DecimalFormat("0.00000");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);

        cookingSpinnerOptionOne = (Spinner) findViewById(R.id.cookingspinnerone);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.cookingoptionsone, R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cookingSpinnerOptionOne.setAdapter(adapter);

        cookingSpinnerOptionsTwo = (Spinner) findViewById(R.id.cookingspinnertwo);
        ArrayAdapter<CharSequence> adaptertwo = ArrayAdapter.createFromResource(this, R.array.cookingoptionstwo, R.layout.custom_spinner);
        adaptertwo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cookingSpinnerOptionsTwo.setAdapter(adaptertwo);


        cookingConvertButton = (Button) findViewById(R.id.cookingconvertButtonId);

        cookingConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                editCookingTextView = (EditText) findViewById(R.id.cookingEditTextOne);
                cookingTextViewOne = (TextView) findViewById(R.id.cookingTextViewTwo);
                String editTextVal = String.valueOf(editCookingTextView.getText());
                
                if (editTextVal.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please Enter a Value!", Toast.LENGTH_LONG).show();
                }else if (cookingSpinnerOptionOne.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 4;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 4;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 16;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 16;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 8;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 8;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 128;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 128;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())) {
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 0.26417;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 0.26417;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 3785.41178;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 3785.41178;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 256;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 256;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 786;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 786;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 3785.41;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(2) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 3785.42;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 8.0;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 8.0;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 0.236588236;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 0.236588236;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 236.5882365;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 236.5882365;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 0.5;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    cookingTextViewOne.setText("0.0");
                    double convertedVal = intEditText / 0.5;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 4;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 4;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 16;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 16;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 48;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 48;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 236.58824;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(0) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 236.58824;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .02957;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .02957;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 29.57352;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 29.57352;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0625;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())) {
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0625;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 2;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 2;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 6;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 6;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 29.5735;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(1) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 29.5735;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 1000;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 1000;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 2.11338;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 2.11338;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 1.056688;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 1.056688;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 67;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 67;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 202.88413;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 202.88413;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 1000;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(3) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 1000;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .00211;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .00211;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .001056688;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .001056688;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .06763;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .06763;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .20288;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .20288;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 1;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(4) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 1;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 0.5;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 0.5;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 32;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 32;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 96;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 96;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 473.176475;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(5) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 473.176475;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 64;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 64;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 192;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())) {
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 192;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 946.35295;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(6) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 946.35295;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 3;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 3;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 14.78676;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(7) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 14.78676;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 4.92892;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else if (cookingSpinnerOptionOne.getItemAtPosition(9) == String.valueOf(cookingSpinnerOptionOne.getSelectedItem()) &&
                        cookingSpinnerOptionsTwo.getItemAtPosition(8) == String.valueOf(cookingSpinnerOptionsTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 4.92892;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    cookingTextViewOne.setText(stringResult);
                }else{

                }
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cooking, menu);
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
