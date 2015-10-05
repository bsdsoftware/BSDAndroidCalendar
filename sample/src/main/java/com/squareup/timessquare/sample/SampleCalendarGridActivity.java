package com.squareup.timessquare.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.squareup.timessquare.CalendarPickerGridView;
import com.squareup.timessquare.MonthDescriptor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class SampleCalendarGridActivity extends Activity {

    private CalendarPickerGridView calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_calendar_grid);

        final Calendar nextYear = Calendar.getInstance();
        nextYear.add(Calendar.YEAR, 1);

        final Calendar lastYear = Calendar.getInstance();
        lastYear.add(Calendar.YEAR, -1);

        Date tomorrow = new Date();
        tomorrow.setDate(tomorrow.getDate() + 1);

        Date plusTen = new Date();
        plusTen.setDate(plusTen.getDate() + 5);

        Date minusTen = new Date();
        minusTen.setDate(minusTen.getDate() - 10);

        Collection<Date> dates = new ArrayList<>();
        dates.add(tomorrow);
        dates.add(plusTen);
        dates.add(minusTen);
        calendar = (CalendarPickerGridView) findViewById(R.id.calendar_view);
        calendar.init(lastYear.getTime(), nextYear.getTime()) //
                .inMode(CalendarPickerGridView.SelectionMode.MULTIPLE) //
                //.displayOnly()
                .withHighlightedDates(dates)
                ;//.withSelectedDates(dates);
        calendar.setOnDateSelectedListener(new CalendarPickerGridView.OnDateSelectedListener() {
            @Override
            public void onDateSelected(Date date) {
                Toast.makeText(SampleCalendarGridActivity.this, date.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onDateUnselected(Date date) {

            }
        });
        calendar.scrollToDate(new Date());

        /*calendar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonthDescriptor monthDescriptor = (MonthDescriptor) calendar.getAdapter().getItem(position);
                String message = String.format("date:%s - mese:%s - anno:%s - label: %s", monthDescriptor.getDate(), monthDescriptor.getMonth(), monthDescriptor.getYear(), monthDescriptor.getLabel());
                Toast.makeText(SampleCalendarGridActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });*/

    }
}
