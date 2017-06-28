/**
 * Copyright (C) © 2017 深圳市掌玩网络技术有限公司
 * MyApplication
 * Order.java
 */
package top.huyuxin.library;

/**
 * @author huyuxin@kobox.tv
 * @since 2017/6/28 18:26
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */
public class Order {
    private int order_id;
    private  String order_des;
    private  String time;
    private boolean ispayed;

    public Order() {
    }

    public Order(int order_id, String order_des, String time) {
        this.order_id = order_id;
        this.order_des = order_des;
        this.time = time;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_des() {
        return order_des;
    }

    public void setOrder_des(String order_des) {
        this.order_des = order_des;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean ispayed() {
        return ispayed;
    }

    public void setIspayed(boolean ispayed) {
        this.ispayed = ispayed;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", order_des='" + order_des + '\'' +
                ", time='" + time + '\'' +
                ", ispayed=" + ispayed +
                '}';
    }
}
