package com.example.porag.deck;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumbersFragment extends Fragment {


    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list, container, false);

    // Create an array list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","Ek",R.drawable.number_one));
        words.add(new Word("Two","Dhui",R.drawable.number_two));
        words.add(new Word("Two","Tin",R.drawable.number_three));
        words.add(new Word("Two","Shher",R.drawable.number_four));
        words.add(new Word("Two","Pacchh",R.drawable.number_five));
        words.add(new Word("Two","Soi",R.drawable.number_six));
        words.add(new Word("Two","Saat",R.drawable.number_seven));
        words.add(new Word("Two","Aaat",R.drawable.number_eight));
        words.add(new Word("Two","Noi",R.drawable.number_nine));
        words.add(new Word("Two","Dhochh",R.drawable.number_ten));


        // Creates an ArrayAdapter whose data source is a list of words.
        WordAdapter adapter = new WordAdapter(getActivity(), words,R.color.numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
// sets the itemsAdapter as a child to listView
        listView.setAdapter(adapter);

        return rootView;
    }

}
