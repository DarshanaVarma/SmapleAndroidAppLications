package com.example.demo.sampleapplicaton.Config;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by admin on 05-Jul-17.
 */

public class SharedUtils {

    SharedPreferences sharePref;
    SharedPreferences.Editor editor;

    public SharedUtils(Context context) {
        sharePref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sharePref.edit();
    }


    public void setIsLogin(boolean isLogin){
        editor.putBoolean("Is_logIn", isLogin);
        editor.commit();
    }

    public boolean isLogedIN(){
        return sharePref.getBoolean("Is_logIn",true);
    }

    public void  setUserId(Integer userId){
        editor.putInt("UserId",userId);
        editor.commit();
    }
    public int getUserId(){
        return sharePref.getInt("UserId",0);
    }

    public void  setFlag(Integer adminFlag){
        editor.putInt("Is_admin",adminFlag);
        editor.commit();
    }
    public int getFlag(){
        return sharePref.getInt("Is_admin",0);
    }


    public void setId(String transactionId){
        editor.putString("_id",transactionId);
        editor.commit();
    }
    public String getId(){
        return sharePref.getString("_id","");
    }


}
