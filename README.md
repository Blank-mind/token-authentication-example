# token-authentication-example
使用token做鉴权的例子


### 如何运行这个例子
+ 安装MySQL，导入`resources`下的`token_demo.sql`，创建数据库表结构，在`application.properties`中配置数据库账号密码。
+ 安装redis。redis官方没有提供window版本，好在微软为我们提供了window下的版本：
[window版redis下载](https://github.com/MicrosoftArchive/redis/releases/tag/win-3.2.100)
+  运行`TokenApplication.java`类来启动项目，默认端口为`9001`,如果有端口冲突或者希望修改端口可以到配置文件`application.properties`下修改`server.port`的值即可。
+  成功启动后浏览器打开`http://localhost:9001/swagger-ui.html`,便可以看到swagger API展示界面，进行API调试。

### 实现效果
用户登录成功后后台会返回一个token给调用者，同时我们自定义了`@AuthToken`注解，被该注解标注的api进行请求的时候都需要进行token效验，效验通过才可以正常访问。同时`token`具有生命周期，在用户持续一段时间不进行操作的话，token则会过期。