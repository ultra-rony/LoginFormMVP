package ru.yakstar.loginformmvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ru.yakstar.loginformmvp.R;
import ru.yakstar.loginformmvp.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private UserPresenter presenter;

    @BindView(R.id.etEmail) EditText etMail;
    @BindView(R.id.etPassword) EditText etPassword;

    @OnClick(R.id.btnValid) void submit() {
        presenter = new UserPresenter(MainActivity.this);
        presenter.getUser(etMail.getText().toString(),etPassword.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @Override
    public void getMessage(String message) {
        Toast toast = Toast.makeText(getApplicationContext(),
                message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
