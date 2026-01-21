package lk.razee.practical_1.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import lk.razee.practical_1.R;
import lk.razee.practical_1.activity.HomeActivity;

public class SignInFragment extends Fragment {

    private EditText emailEditText,passwordEditText;
    private Button signInBtn;
    private TextView textView3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        emailEditText=view.findViewById(R.id.signinFragmentEmailEditText);
        passwordEditText=view.findViewById(R.id.signinFragmentPasswordEditText);
        signInBtn=view.findViewById(R.id.signInBtn);
        textView3=view.findViewById(R.id.textView3);

        signIn();
    }

    private void signIn(){
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (email.isEmpty() || password.isEmpty()){
                    textView3.setText("Please fill all the fields");
                    textView3.setVisibility(View.VISIBLE);
                    Toast.makeText(getContext(),"Please fill all the fields",Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(getContext(), HomeActivity.class);
                intent.putExtra("email",email);
                startActivity(intent);
            }
        });
    }
}