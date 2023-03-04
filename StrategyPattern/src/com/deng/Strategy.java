package com.deng;

/**
 * @Classname Strategy
 * @Description       表示猜拳游戏中的策略的类
 * @Version 1.0.0
 * @Date 2023/2/19 20:38
 * @Created by helloDeng
 */
public interface Strategy {
    public abstract Hand nextHand();         //获取下一局要出的手势

    /**
     * 如果上一局中调用nextHand方法获胜了，就接着调用study(true),如果输了，就接着调用study(false)
     * 这样Strategy接口的实现类就会改变自己的内部状态，从而为下一次nextHand被调用时究竟是返回什么手势提供依据
     * @param win
     */
    public abstract void study(boolean win); //学习上一局的手势是否获胜了
}
