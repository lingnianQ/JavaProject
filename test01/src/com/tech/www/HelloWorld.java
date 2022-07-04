package com.tech.www;

/**
 * 176.17.100.105
 * 自己基本情况
 * 校园经历
 * 家乡风景
 * 美食
 * 来达内的目的 钱，喜欢，梦想，理想
 *
 */

/**
 * 1.  java开发环境：
 *
 * - java编译运行过程：
 *
 *   - 编译期：.java源文件，经过编译，生成.class字节码文件
 *
 *   - 运行期：JVM加载并运行.class(0和1)
 *
 *     > 特点：跨平台、一次编译到处使用
 *
 * - 名词解释：
 *
 *   - JVM：java虚拟机
 *
 *     ​          加载.class并运行.class
 *
 *   - JRE：java运行环境
 *
 *     ​          除了包含JVM以外还包含了运行java程序所必须的环境
 *
 *     ​          JRE = JVM+java系统类库(小零件)
 *
 *   - JDK：java开发工具包
 *
 *     ​          除了包含JRE以外还包含了开发java程序所必须的命令工具
 *
 *     ​          JDK = JRE+编译、运行等命令工具
 *
 *     > 注意：
 *     >
 *     > 1. 运行java程序的最小环境为JRE
 *     > 2. 开发java程序的最小环境为JDK
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld!!");
    }
}
