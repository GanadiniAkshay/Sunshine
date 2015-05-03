package com.example.akshay.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_main, container, false);
        
        String[] forecastArray = {
                "Today  -    Sunny  -   88/63",
                "Tomorrow   -   Foggy   -   76/75",
                "Weds   - Cloudy  - 72/63",
                "Thurs  -   Asteroids   -   75/65",
                "Fri    -   Heavy Rain  -   65/56",
                "Sat    -   Help Trapped in WeatherStation  -   60/51",
                "Sun    -   Sunny   -   80/68"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );

        ListView listView = (ListView) rootview.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootview;

    }
}
