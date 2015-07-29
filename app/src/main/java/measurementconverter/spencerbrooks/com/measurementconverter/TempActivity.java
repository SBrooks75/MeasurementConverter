package measurementconverter.spencerbrooks.com.measurementconverter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class TempActivity extends Activity {
    private Spinner spinner;
    private EditText editTextView;
    private TextView celTextView;
    private TextView fahTextView;
    private Button convertButton;
    DecimalFormat round = new DecimalFormat("0.0");







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);



        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.degree_array, R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);




//        spinner.setOnItemSelectedListener(new SelectingItem());
        convertButton = (Button) findViewById(R.id.convertButtonId);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fahTextView = (TextView) findViewById(R.id.fahConvertId);
                celTextView = (TextView) findViewById(R.id.celConvertedId);
                editTextView = (EditText) findViewById(R.id.editTextId);
                String editTextVal = String.valueOf(editTextView.getText());

                if (editTextVal.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter a Value!", Toast.LENGTH_LONG).show();


                }else if (spinner.getItemAtPosition(0) == String.valueOf(spinner.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedTempFahToCel = convertedFahToCel(intEditText);
                    String stringResultFahToCel = String.valueOf(round.format(convertedTempFahToCel));
                    celTextView.setText(editTextView.getText().toString() + " °F " + "= " + stringResultFahToCel + " °C");

                    double convertedTempFahToKel = convertedFahToKel(intEditText);
                    String stringResultFahToKel = String.valueOf(round.format(convertedTempFahToKel));
                    fahTextView.setText(editTextView.getText().toString() + " °F " + "= "  + stringResultFahToKel + " °K");



                }else if (spinner.getItemAtPosition(1) == String.valueOf(spinner.getSelectedItem())){
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedTempCelToFah = convertedCelToFah(intEditText);
                    String stringResultCelToFah = String.valueOf(round.format(convertedTempCelToFah));
                    celTextView.setText(editTextView.getText().toString() + " °C " + "= " + stringResultCelToFah + " °F");

                    double convertedTempCelToKel = convertedCelToKel(intEditText);
                    String stringResultCelToKel = String.valueOf(round.format(convertedTempCelToKel));
                    fahTextView.setText(editTextView.getText().toString() + " °C " + "= " + stringResultCelToKel + " °K");

                }else{
                    double intEditText = Double.parseDouble(editTextVal);
                    double convertedTempKelToFah = convertedKelToFah(intEditText);
                    String stringResultKelToFah = String.valueOf(round.format(convertedTempKelToFah));
                    celTextView.setText(editTextView.getText().toString() + " °K " + "= " + stringResultKelToFah + " °F");

                    double convertedTempKelToCel = convertedKelToCel(intEditText);
                    String stringResultKelToCel = String.valueOf(round.format(convertedTempKelToCel));
                    fahTextView.setText(editTextView.getText().toString() + " °K " + "= " + stringResultKelToCel + " °K");


                }




            }



        });



    }
    public double convertedFahToCel(double fahToCelVal) {
        double convertedValFahToCel;
        convertedValFahToCel = (fahToCelVal - 32) * 5 / 9;
        return convertedValFahToCel;
    }

    public double convertedFahToKel(double fahToKelVal) {
        double convertedValFahToKel;
        convertedValFahToKel = (fahToKelVal - 32) * 5/9 + 273.15;
        return convertedValFahToKel;
    }

    public double convertedCelToFah(double celToFahVal) {
        double convertedValCelToFah;
        convertedValCelToFah = (celToFahVal * 9/5) + 32;
        return convertedValCelToFah;
    }

    public double convertedCelToKel(double celToKelVal) {
        double convertedValCelToKel;
        convertedValCelToKel = celToKelVal + 273.15;
        return convertedValCelToKel;
    }

    public double convertedKelToFah(double kelToFahVar) {
        double convertedValKelToFah;
        convertedValKelToFah = (kelToFahVar - 273.15) * 9 / 5 + 32;
        return convertedValKelToFah;
    }

    public double convertedKelToCel(double kelToCeLVal) {
        double convertedValKelToCel;
        convertedValKelToCel = kelToCeLVal - 273.15;
        return convertedValKelToCel;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}