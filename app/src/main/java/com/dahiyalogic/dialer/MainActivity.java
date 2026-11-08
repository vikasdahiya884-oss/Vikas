package com.dahiyalogic.dialer;
import android.app.*; import android.app.role.RoleManager; import android.os.*; import android.content.*; import android.graphics.Color; import android.view.*; import android.widget.*;
public class MainActivity extends Activity {
 public void onCreate(Bundle b){super.onCreate(b); LinearLayout l=new LinearLayout(this);l.setPadding(32,60,32,32);l.setOrientation(1);l.setBackgroundColor(Color.rgb(12,19,34)); TextView t=new TextView(this);t.setText("DAHIYA AI PHONE\n\nDefault dialer prototype\n\nAI Attend is NOT connected to cellular call audio.");t.setTextColor(-1);t.setTextSize(21);l.addView(t);Button btn=new Button(this);btn.setText("Set as default Phone app");l.addView(btn);btn.setOnClickListener(v->{RoleManager rm=getSystemService(RoleManager.class);if(rm!=null && rm.isRoleAvailable(RoleManager.ROLE_DIALER))startActivityForResult(rm.createRequestRoleIntent(RoleManager.ROLE_DIALER),1);});setContentView(l); }
}
