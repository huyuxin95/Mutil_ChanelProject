/**
 * Copyright (C) © 2017 深圳市掌玩网络技术有限公司
 * MyApplication
 * PayProxy.java
 */
package top.huyuxin.multi_product;

import top.huyuxin.library.IPay;
import top.huyuxin.library.Order;
import top.huyuxin.library.PayOverCallBack;

/**
 * @author huyuxin@kobox.tv
 * @since 2017/6/28 19:36
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */
public class PayProxy implements IPay{
    private final static String LOG = PayProxy.class.getSimpleName();

    private IPay pay;
    private String payType;

    public PayProxy(IPay pay) {
        this.pay = pay;
    }

    public PayProxy(String payType) {
       switch (payType){
           case "ali":
               this.pay=createPay("top.huyuxin.alisdk.AliPay");
               break;
           case "tencent":
               this.pay=createPay("top.huyuxin.tencentsdk.TencentPay");
               break;
           case "baidu":
               this.pay=createPay("top.huyuxin.baidusdk.BaiduPay");
               break;
           case "xiaomi":
               this.pay=createPay("top.huyuxin.xiaomisdk.XiaoMiPay");
               break;
       }
    }

    private IPay createPay(String className)throws RuntimeException{
        Class<?> clazz ;
        try {
           clazz = Class.forName(className);
            return  (IPay) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
       throw new RuntimeException("PayProxy can`t be create:" + className);
    }

    @Override
    public void doPay(Order order, PayOverCallBack callBack) {
        this.pay.doPay(order,callBack);
    }
}
