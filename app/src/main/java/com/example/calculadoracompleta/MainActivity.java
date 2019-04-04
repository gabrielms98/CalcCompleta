package com.example.calculadoracompleta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String op = " ";
    Boolean r = false;

    public void clear(View view){
        EditText input = (EditText) findViewById(R.id.inputCalc);
        input.setText("");
    }

    public void um(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("1");
            r = false;
        } else input.setText(str+"1");
    }

    public void dois(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("2");
            r = false;
        } else input.setText(str+"2");
    }

    public void tres(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("3");
            r = false;
        } else input.setText(str+"3");
    }

    public void quatro(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("4");
            r = false;
        } else input.setText(str+"4");
    }

    public void cinco(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("5");
            r = false;
        } else input.setText(str+"5");
    }

    public void seis(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("6");
            r = false;
        } else input.setText(str+"6");
    }

    public void sete(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("7");
            r = false;
        } else input.setText(str+"7");
    }

    public void oito(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("8");
            r = false;
        } else input.setText(str+"8");
    }

    public void nove(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("9");
            r = false;
        } else input.setText(str+"9");
    }

    public void zero(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();

        if(r){
            input.setText("0");
            r = false;
        } else input.setText(str+"0");
    }

    public void add(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();
        if(!op.equals(" ")) return;
        input.setText(str+" + ");
        op = "+";
        r = false;
    }

    public void sub(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();
        if(!op.equals(" ")) return;
        input.setText(str+" - ");
        op = "-";
        r = false;
    }

    public void vezes(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();
        if(!op.equals(" ")) return;
        input.setText(str+" * ");
        op = "*";
        r = false;
    }

    public void div(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();
        if(!op.equals(" ")) return;
        input.setText(str+" / ");
        op = "/";
        r = false;
    }

    public void ponto(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();
        String[] valores = str.split("[-+*/]");

        if(valores.length == 1){
            if(valores[0].indexOf(".") == -1) input.setText(str+".");
        } else if(valores.length == 2){
            if(valores[1].indexOf(".") == -1) input.setText(str+".");
        }
    }

    public void igual(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();
        if(str.equals("")) return;
        if(str.indexOf("+") == -1 && str.indexOf("-") == -1 && str.indexOf("/") == -1 && str.indexOf("*") == -1)
            return;

        String[] valores = str.split("[-+*/]");
        Log.i("valores", valores[0]);

        if(valores[1].length() < 2) return;
        if(op == "+"){
            Double v1 = Double.parseDouble(valores[0]);
            Double v2 = Double.parseDouble(valores[1]);
            Double result = v1 + v2;

            input.setText(result.toString());
        } else if(op == "-"){
            Double v1 = Double.parseDouble(valores[0]);
            Double v2 = Double.parseDouble(valores[1]);
            Double result = v1 - v2;

            input.setText(result.toString());
        } else if(op == "*"){
            Double v1 = Double.parseDouble(valores[0]);
            Double v2 = Double.parseDouble(valores[1]);
            Double result = v1 * v2;

            input.setText(result.toString());
        } else if(op == "/"){
            Double v1 = Double.parseDouble(valores[0]);
            Double v2 = Double.parseDouble(valores[1]);
            if(v2 == 0) input.setText("Error 404");
            else {
                Double result = v1 / v2;
                input.setText(result.toString());
            }
        }
        r = true;
        op = " ";
    }

    public void erase(View view){
        EditText input = findViewById(R.id.inputCalc);
        String str = input.getText().toString();
        if(str.equals("")) return;
        str = str.substring(0, str.length() - 1);
        input.setText(str);
    }
}
