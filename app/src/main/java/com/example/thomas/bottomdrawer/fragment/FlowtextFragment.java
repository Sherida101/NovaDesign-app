package com.example.thomas.bottomdrawer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.thomas.bottomdrawer.R;

public class FlowtextFragment extends Fragment {

    public FlowtextFragment() {
        // Required empty public constructor
    }

    public static FlowtextFragment newInstance(String param1, String param2) {
        FlowtextFragment fragment = new FlowtextFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        final EditText InputBox = (EditText) findViewById(R.id.InputEditText);
//        Button FindSolution = (Button) findViewById(R.id.FindButton);
//        final TextView ResultText = (TextView) findViewById(R.id.ResultTextView);
//        final EditText ResultBox = (EditText) findViewById(R.id.ResultEditText);
//
//        FindSolution.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                //some function e.g. findflow()
//                //Add text to the input box
//                final String inputText = InputBox.getText().toString();
//                //Find the total number of words in a string which is equivalent to the number of spaces
//                int wordCount = inputText.split("").length;
//                //Find best width which is the sum of all characters including whitespaces
//                //int bestWidth = wordCount.max();
//                //Find max flow
//
//
//                ResultText.setVisibility(View.VISIBLE);
//                ResultText.setText("Total words: 21, Best width: 15, Max flow: 5");
//                ResultBox.setVisibility(View.VISIBLE);
//                ResultBox.setText("Final text && marked maximum flow with red *");
//            }
//        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_flowtext, container, false);
    }

}
