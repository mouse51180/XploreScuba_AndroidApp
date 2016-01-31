package com.xplore_scuba.xplorescuba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalendarBtnClick (View view){
        Intent CalendarActivity = new Intent(this, Calendar.class);
        startActivity(CalendarActivity);
    }

    public void CCardBtnClick (View view){
        Intent CCardActivity = new Intent(this, CCard.class);
        startActivity(CCardActivity);
    }

    public void ChecklistBtnClick (View view){
        Intent ChecklistActivity = new Intent(this, Checklist.class);
        startActivity(ChecklistActivity);
    }

    public void ICEInfoBtnClick (View view){
        Intent ICEInfoActivity = new Intent(this, ICEInfo.class);
        startActivity(ICEInfoActivity);
    }

    public void NitroxBtnClick (View view){
        Intent NitroxActivity = new Intent(this, Nitrox.class);
        startActivity(NitroxActivity);
    }
}
