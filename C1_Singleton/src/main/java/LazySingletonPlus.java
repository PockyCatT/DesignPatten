/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/11 16:37
 * FileName: LazySingletonPlus
 * Description: 1.3-饿汉式单例加强版
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/8/11 16:37
 * @Description: 双重检查
 */

public class LazySingletonPlus {
    // 创建静态实例
    // volatile字段可以避免指令重排导致的线程错误
    private static volatile LazySingletonPlus INSTANCE = null;

    // 私有化构造器
    private LazySingletonPlus(){
    }

    // 返回实例方法
    // 双重检查确保了只有一个进程可以进入到锁内部
    public static LazySingletonPlus getInstance(){
        if(INSTANCE == null){
            synchronized (LazySingletonPlus.class){
                if(INSTANCE == null){
                    INSTANCE = new LazySingletonPlus();
                }
            }
        }
        return INSTANCE;
    }

}
