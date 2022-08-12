/**
 * Copyright (C), 2021-2022, yuanyeaf
 * Date: 2022/8/11 16:22
 * FileName: LazySingleton
 * Description: 1.2-懒汉式单例
 * Version: 1.0
 */

/**
 * @Author: YuanYe
 * @CreateTime: 2022/8/11 16:22
 * @Description: 懒汉式单例
 */
public class LazySingleton {
    // 创建空的实例对象，在有需要时才加载
    public static LazySingleton INSTANCE = null;

    // 私有化构造器
    private LazySingleton(){
    }

    // 静态方法返回实例
    public static LazySingleton getInstance(){
        // 先上锁，再创建
        synchronized (LazySingleton.class){
            if(INSTANCE==null){
                INSTANCE = new LazySingleton();
            }
            return INSTANCE;
        }
    }
}
