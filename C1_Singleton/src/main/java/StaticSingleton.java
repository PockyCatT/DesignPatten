/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/12 10:05
 * FileName: StaticSingleton
 * Description: 1.5-静态内部类实现单例
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/8/12 10:05
 * @Description: 静态内部类实现单例
 */
public class StaticSingleton {
    // 创建静态内部类
    private static class LazyHolder{
        static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    // 创建get接口
    public static StaticSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }
}
