package top.huyuxin.multi_product;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import top.huyuxin.library.Order;
import top.huyuxin.library.PayOverCallBack;

public class MainActivity extends Activity {

    private TextView tv_order_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_order_text = (TextView) this.findViewById(R.id.tv_order_text);
        Order order = new OrderFactory().getOrder();
        String channelMeta = Utils.getApplicationMeta(this,"CHANNEL_NAME");
        PayProxy payProxy = new PayProxy(channelMeta);
        payProxy.doPay(order, new PayOverCallBack() {
            @Override
            public void Sucsess(String msg) {
                tv_order_text.setText("pay_sucess:"+msg+msg+msg+msg+msg+msg+msg+msg);
            }

            @Override
            public void Fail(int errcode, String msg) {
                tv_order_text.setText("pay_fail:"+msg+msg+msg+msg+msg+msg+msg+msg);
            }
        });
    }


}
