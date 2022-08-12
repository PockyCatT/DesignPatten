/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/11 16:02
 * FileName: HungrySingleton
 * Description: 1.1-饿汉模式单例
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/8/11 16:02
 * @Description: 饿汉式单例
 */
public class HungrySingleton {
    // 只创建一次类的实例
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    // 私有化构造器
    private HungrySingleton(){
    }

    // 提供访问接口
    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}
