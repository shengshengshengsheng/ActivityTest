package com.example.shengsheng.activitytest;

import android.app.Activity;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by XQS on 2017/10/2 0002.
 */

public class ActivityCollector {
    public static List<Activity>activities=new ArrayList<>();
    public static void addActivity(Activity activity)
    {
        activities.add(activity);
    }
    public static void removeActivity(Activity activity)
    {
        activities.remove(activity);
    }
    public static void finishall()
    {
        for(Activity activity:activities)
        {
            if(!activity.isFinishing())
            {
                activity.finish();
            }
        }
    }


}
