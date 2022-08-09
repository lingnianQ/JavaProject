idea使用本地Tomcat有三个乱码问题，

Catalina Log乱码
Tomcat Localhost Log乱码
output控制台窗口乱码
找到Tomcat安装目录下
conf/logging.properties 文件
而，idea本身不做什么设置也可以解决此问题。
版本idea 2021.1

~~~properties
# 做如下三个修改
# 1
# 1catalina.org.apache.juli.AsyncFileHandler.encoding = UTF-8
# 解决IDEA控制台Catalina Log乱码
1catalina.org.apache.juli.AsyncFileHandler.encoding = GBK
# 2
# 2localhost.org.apache.juli.AsyncFileHandler.encoding = UTF-8
# 解决IDEA控制台Tomcat Localhost Log乱码
2localhost.org.apache.juli.AsyncFileHandler.encoding = GBK
# 3
# 解决idea output控制台窗口乱码问题
# java.util.logging.ConsoleHandler.encoding = UTF-8
java.util.logging.ConsoleHandler.encoding = GBK


