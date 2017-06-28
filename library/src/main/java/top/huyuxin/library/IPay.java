package top.huyuxin.library;

/**
 * @author huyuxin@kobox.tv
 * @version 1.0
 *          <p><strong>Features draft description.主要功能介绍</strong></p>
 * @since 2017/6/28 18:26
 */

public interface IPay {
   void doPay(Order order, PayOverCallBack callBack);
}
