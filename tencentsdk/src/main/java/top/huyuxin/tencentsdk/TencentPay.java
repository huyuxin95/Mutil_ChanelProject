/**
 * Copyright (C) © 2017 深圳市掌玩网络技术有限公司
 * MyApplication
 * TencentPay.java
 */
package top.huyuxin.tencentsdk;

import top.huyuxin.library.IPay;
import top.huyuxin.library.Order;
import top.huyuxin.library.PayOverCallBack;

/**
 * @author huyuxin@kobox.tv
 * @since 2017/6/28 19:19
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */
public class TencentPay implements IPay {
    private final static String LOG = TencentPay.class.getSimpleName();

    @Override
    public void doPay(Order order, PayOverCallBack callBack) {
        order.setIspayed(true);
        callBack.Sucsess(order.getOrder_des());
    }
}
