/**
 * Copyright (C) © 2017 深圳市掌玩网络技术有限公司
 * MyApplication
 * Utils.java
 */
package top.huyuxin.multi_product;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/**
 * @author huyuxin@kobox.tv
 * @since 2017/6/28 19:54
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */
public class Utils {
    private final static String LOG = Utils.class.getSimpleName();

   public static String getApplicationMeta(Context context,String mateString){
       ApplicationInfo appInfo = null;
       try {
           appInfo = context.getPackageManager()
                   .getApplicationInfo(context.getPackageName(),
                           PackageManager.GET_META_DATA);
       } catch (PackageManager.NameNotFoundException e) {
           e.printStackTrace();
       }
       return  appInfo.metaData.getString(mateString);
   }

}
