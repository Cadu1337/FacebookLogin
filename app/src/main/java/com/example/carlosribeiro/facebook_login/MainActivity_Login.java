package com.example.carlosribeiro.facebook_login;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_Login extends AppCompatActivity {

    UserConfig config = new UserConfig();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__login);
        config.initialize();

    }

    public void ChangeActivity(View view)
    {
        setContentView(R.layout.layoutregistro);
    }

    public void ChangeActivity2(View view)
    {
        setContentView(R.layout.activity_main_activity__login);
    }

    public void DetectLogin(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        EditText email    = (EditText) findViewById(R.id.editText);
        EditText password = (EditText) findViewById(R.id.editText2);
        TextView login    = (TextView) findViewById(R.id.log);

        boolean isFind = false;

        for(int i = 0; i < config.users.size(); i++) {

                if (config.users.get(i).equals(email.getText().toString()) &&
                        config.password.get(i).equals(password.getText().toString())) {
                    isFind = true;
                    break;
                }
                else {
                    isFind = false;
                }
        }

        if(isFind) {
            login.setTextColor(0xFF099425);
        }
        else {
            login.setTextColor(0xFFB80C0C);
        }
    }

}
