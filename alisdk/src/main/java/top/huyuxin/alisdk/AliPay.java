/**
 * Copyright (C) © 2017 深圳市掌玩网络技术有限公司
 * MyApplication
 * AliPay.java
 */
package top.huyuxin.alisdk;

import top.huyuxin.library.IPay;
import top.huyuxin.library.Order;
import top.huyuxin.library.PayOverCallBack;

/**
 * @author huyuxin@kobox.tv
 * @since 2017/6/28 19:13
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */
public class AliPay implements IPay {
    private final static String LOG = AliPay.class.getSimpleName();

    @Override
    public void doPay(Order order, PayOverCallBack callBack) {
        order.setIspayed(true);
        callBack.Sucsess(order.getOrder_des());
    }
}
