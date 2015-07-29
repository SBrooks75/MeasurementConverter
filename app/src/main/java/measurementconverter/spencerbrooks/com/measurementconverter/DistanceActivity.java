package measurementconverter.spencerbrooks.com.measurementconverter;

import android.app.Activity;
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


public class DistanceActivity extends Activity {

    private Spinner distanceSpinnerOne;
    private Spinner distanceSpinnerTwo;
    private EditText distanceEditText;
    private TextView distanceTextView;
    private Button distanceConvertButton;
    DecimalFormat bigger = new DecimalFormat("0.00");
    DecimalFormat biggest = new DecimalFormat("0.00000");
    DecimalFormat bigdog = new DecimalFormat("0.0000");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        distanceSpinnerOne =(Spinner) findViewById(R.id.distanceSpinnerOneId);
        ArrayAdapter<CharSequence> adapterthree = ArrayAdapter.createFromResource(this, R.array.distanceoptionsone, R.layout.custom_spinnerdistance);
        adapterthree.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        distanceSpinnerOne.setAdapter(adapterthree);

        distanceSpinnerTwo =(Spinner) findViewById(R.id.distanceSpinnerTwoId);
        ArrayAdapter<CharSequence> adapterfour = ArrayAdapter.createFromResource(this, R.array.distanceoptionstwo, R.layout.custom_spinnerdistance);
        adapterfour.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        distanceSpinnerTwo.setAdapter(adapterfour);

        distanceConvertButton = (Button) findViewById(R.id.distanceConvertButtonId);
        distanceConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                distanceEditText = (EditText) findViewById(R.id.distanceEditTextId);
                distanceTextView = (TextView) findViewById(R.id.distanceResultTextViewId);
                String editTextVal = String.valueOf(distanceEditText.getText());
                if (editTextVal.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter A Value", Toast.LENGTH_LONG).show();
                }else if (distanceSpinnerOne.getItemAtPosition(0) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(1) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .39370;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(1) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(0) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .39370;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(0) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(3) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0984251;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(3) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(0) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0984251;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(0) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(2) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .032808;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(2) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(0) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .032808;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(0) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(4) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .010936;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(4) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(0) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .010936;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(0) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(5) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .01;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(5) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(0) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .01;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(0) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(6) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0054681;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(6) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(0) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0054681;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(0) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(7) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0019884;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(7) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(0) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0019884;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(0) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(8) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .00001;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(8) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(0) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .00001;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(0) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(9) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0000062137;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(9) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(0) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0000062137;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(1) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(2) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / 12;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(2) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(1) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 12.00;
                    String stringResult = String.valueOf(bigdog.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(1) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(3) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .25;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(3) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(1) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .25;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(1) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(4) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .027778;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(4) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(1) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 36.00;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(1) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(5) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0254;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(5) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(1) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0254;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(1) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(6) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .013889;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(6) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(1) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 72;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(1) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(7) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0050505;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(7) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(1) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 198;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(1) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(9) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .000015783;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(9) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(1) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 63360;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(2) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(3) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .333333;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(3) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(2) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .333333;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(2) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(4) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .333333;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(4) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(2) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .333333;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(2) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(5) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .3048;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(5) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(2) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .3048;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(2) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(6) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .16667;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(6) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(2) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .16667;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(2) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(7) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .060606;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(7) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(2) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .060606;
                    String stringResult = String.valueOf(bigdog.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(2) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(8) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0003048;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(8) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(2) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0003048;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(2) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(9) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .00018939;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(9) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(2) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 5280.0;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(3) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(4) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .11111;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(4) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(3) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 9;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(3) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(5) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .1016;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(5) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(3) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .1016;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(3) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(6) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0555555556;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(6) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(3) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0555555556;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(3) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(7) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .015152;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(7) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(3) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .015152;
                    String stringResult = String.valueOf(bigger.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(3) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(8) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0001016;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(8) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(3) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0001016;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(3) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(9) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .000063131;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(9) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(3) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * 15840.0;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(4) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(5) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .9114;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(5) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(4) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .9114;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(4) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(6) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .5;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(6) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(4) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .5;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(4) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(7) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .18182;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(7) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(4) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .18182;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(4) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(8) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0009144;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(8) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(4) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0009144;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(4) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(9) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .00056818;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(9) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(4) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .00056818;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(5) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(6) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .54681;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(6) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(5) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .54681;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(5) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(7) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .19884;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(7) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(5) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .19884;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(5) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(8) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .001;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(8) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(5) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .001;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(5) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(9) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .00062137;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(9) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(5) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .00062137;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(6) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(7) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .36364;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(7) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(6) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .36364;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(6) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(8) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0018288;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(8) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(6) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0018288;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(6) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(9) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0011364;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(9) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(6) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0011364;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(7) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(8) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .0050292;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(8) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(7) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .0050292;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(7) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(9) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .003125;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(9) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(7) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .003125;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(8) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(9) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText * .00062137;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else if (distanceSpinnerOne.getItemAtPosition(9) == String.valueOf(distanceSpinnerOne.getSelectedItem()) &&
                        distanceSpinnerTwo.getItemAtPosition(8) == String.valueOf(distanceSpinnerTwo.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedVal = intEditText / .00062137;
                    String stringResult = String.valueOf(biggest.format(convertedVal));
                    distanceTextView.setText(stringResult);

                }else{

                }
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_distance, menu);
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
