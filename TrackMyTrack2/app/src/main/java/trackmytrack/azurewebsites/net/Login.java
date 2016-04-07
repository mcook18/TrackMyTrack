package trackmytrack.azurewebsites.net;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class Login extends AppCompatActivity{
//declare variables
    Button loginbutton;
    Button signupbutton;
    String emailtxt;
    String passwordtxt; //text entered into password and email
    EditText ETemail; //text linked to id
    EditText ETpassword;//text linked to id

    TextView tx1; //check credetials and times been entered
    int counter =3;

        //call when the activity is first created
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbutton=(Button)findViewById(R.id.loginbutton);
        ETemail=(EditText)findViewById(R.id.ETemail);
        ETpassword=(EditText)findViewById(R.id.ETpassword);
        signupbutton=(Button)findViewById(R.id.SignupButton);

        // Login Button Click Listener
        loginbutton.setOnClickListener(new OnClickListener() {//clicking if credentials are filled
            @Override
            public void onClick(View v) {
                // Retrieve the text entered from the EditText
                if (ETemail.getText().toString().equals("admin") &&

                        ETpassword.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        loginbutton.setEnabled(false);
                    }
                    //emailtxt = ETemail.getText().toString();
                    //passwordtxt = ETpassword.getText().toString();

                }
            }
        });
        // Sign up Button Click Listener //http://www.tutorialspoint.com/android/android_login_screen.htm
        //https://docs.oracle.com/javase/specs/jls/se7/html/
        signupbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the text entered from the EditText
                emailtxt = ETemail.getText().toString();
                passwordtxt = ETpassword.getText().toString();



            }
        });

    }
}
