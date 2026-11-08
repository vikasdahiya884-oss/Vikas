package com.dahiyalogic.dialer;
import android.telecom.*; import android.app.*; import android.content.*; import android.os.*;
public class DahiyaInCallService extends InCallService {
 static DahiyaInCallService instance; static Call active;
 @Override public void onCallAdded(Call call){super.onCallAdded(call);instance=this;active=call;showCallNotification();}
 @Override public void onCallRemoved(Call call){super.onCallRemoved(call);if(active==call)active=null;}
 void showCallNotification(){NotificationManager nm=getSystemService(NotificationManager.class);nm.createNotificationChannel(new NotificationChannel("calls","Incoming calls",NotificationManager.IMPORTANCE_HIGH));Intent i=new Intent(this,CallActivity.class);i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_SINGLE_TOP);PendingIntent pi=PendingIntent.getActivity(this,1,i,PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);Notification n=new Notification.Builder(this,"calls").setSmallIcon(android.R.drawable.sym_call_incoming).setContentTitle("DAHIYA AI — Incoming call").setContentText("Tap to answer or decline").setCategory(Notification.CATEGORY_CALL).setOngoing(true).setContentIntent(pi).setFullScreenIntent(pi,true).build();nm.notify(101,n);}
}
