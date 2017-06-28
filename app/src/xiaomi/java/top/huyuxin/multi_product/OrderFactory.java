/**
 * Copyright (C) © 2017 深圳市掌玩网络技术有限公司
 * MyApplication
 * OrderFactory.java
 */
package top.huyuxin.multi_product;

import top.huyuxin.library.IOrderFactory;
import top.huyuxin.library.Order;

/**
 * @author huyuxin@kobox.tv
 * @since 2017/6/28 18:38
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */
public class OrderFactory implements IOrderFactory {

    @Override
    public Order getOrder() {
        return new Order(4,"xiaomi_order",System.currentTimeMillis()+"");
    }

}
