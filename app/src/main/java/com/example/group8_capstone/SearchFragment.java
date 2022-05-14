package com.example.group8_capstone;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment implements View.OnClickListener {
    Button tag, tag2, tag3, tag4, tag5, tag6, tag7, tag8, tag9, tag10, tag11, tag12, tag13, tag14, custom, search;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        tag =  view.findViewById(R.id.tag);
        tag2 =  view.findViewById(R.id.tag2);
        tag3 =  view.findViewById(R.id.tag3);
        tag4 =  view.findViewById(R.id.tag4);
        tag5 =  view.findViewById(R.id.tag5);
        tag6 =  view.findViewById(R.id.tag6);
        tag7 =  view.findViewById(R.id.tag7);
        tag8 =  view.findViewById(R.id.tag8);
        tag9 =  view.findViewById(R.id.tag9);
        tag10 =  view.findViewById(R.id.tag10);
        tag11 =  view.findViewById(R.id.tag11);
        tag12 =  view.findViewById(R.id.tag12);
        tag13 =  view.findViewById(R.id.tag13);
        tag14 =  view.findViewById(R.id.tag14);
        custom = view.findViewById(R.id.custom);
        search = view.findViewById(R.id.search2);

        tag.setOnClickListener(this);
        tag2.setOnClickListener(this);
        tag3.setOnClickListener(this);
        tag4.setOnClickListener(this);
        tag5.setOnClickListener(this);
        tag6.setOnClickListener(this);
        tag7.setOnClickListener(this);
        tag8.setOnClickListener(this);
        tag9.setOnClickListener(this);
        tag10.setOnClickListener(this);
        tag11.setOnClickListener(this);
        tag12.setOnClickListener(this);
        tag13.setOnClickListener(this);
        tag14.setOnClickListener(this);


        custom.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity().getApplicationContext(), Custom.class);
            startActivity(intent);
        });

        search.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity().getApplicationContext(), Find.class);
            startActivity(intent);
        });

        return view;
    }

    @Override
    public void onClick(View view) {
        tag.setOnClickListener(this);
        tag2.setOnClickListener(this);
        tag3.setOnClickListener(this);
        tag4.setOnClickListener(this);
        tag5.setOnClickListener(this);
        tag6.setOnClickListener(this);
        tag7.setOnClickListener(this);
        tag8.setOnClickListener(this);
        tag9.setOnClickListener(this);
        tag10.setOnClickListener(this);
        tag11.setOnClickListener(this);
        tag12.setOnClickListener(this);
        tag13.setOnClickListener(this);
        tag14.setOnClickListener(this);


    }
}