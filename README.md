# spring-boot-mybatis-with-redis
spring-boot + mybatis + redis .

直接使用【SpringBootApplicationTests】把项目跑起来，它会使用嵌入式H2数据库，并且自动创建表结构和插入测试数据。

配置文件为application.yml。







spring-cache  把redis里面的数据反序列化的过程如下：

callstack

```
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381) ~[na:1.8.0_102]
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424) ~[na:1.8.0_102]
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331) ~[na:1.8.0_102]
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357) ~[na:1.8.0_102]
	at org.springframework.util.ClassUtils.forName(ClassUtils.java:250) ~[spring-core-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.core.ConfigurableObjectInputStream.resolveClass(ConfigurableObjectInputStream.java:74) ~[spring-core-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:1620) ~[na:1.8.0_102]
	at java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1521) ~[na:1.8.0_102]
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:1781) ~[na:1.8.0_102]
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1353) ~[na:1.8.0_102]
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:373) ~[na:1.8.0_102]
	at org.springframework.core.serializer.DefaultDeserializer.deserialize(DefaultDeserializer.java:70) ~[spring-core-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.core.serializer.support.DeserializingConverter.convert(DeserializingConverter.java:73) ~[spring-core-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.core.serializer.support.DeserializingConverter.convert(DeserializingConverter.java:36) ~[spring-core-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.data.redis.serializer.JdkSerializationRedisSerializer.deserialize(JdkSerializationRedisSerializer.java:80) ~[spring-data-redis-1.8.3.RELEASE.jar:na]
	at org.springframework.data.redis.cache.RedisCache$CacheValueAccessor.deserializeIfNecessary(RedisCache.java:477) ~[spring-data-redis-1.8.3.RELEASE.jar:na]
	at org.springframework.data.redis.cache.RedisCache.lookup(RedisCache.java:323) ~[spring-data-redis-1.8.3.RELEASE.jar:na]
	at org.springframework.data.redis.cache.RedisCache.get(RedisCache.java:184) ~[spring-data-redis-1.8.3.RELEASE.jar:na]
	at org.springframework.data.redis.cache.RedisCache.get(RedisCache.java:133) ~[spring-data-redis-1.8.3.RELEASE.jar:na]
	at org.springframework.cache.interceptor.AbstractCacheInvoker.doGet(AbstractCacheInvoker.java:71) ~[spring-context-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.cache.interceptor.CacheAspectSupport.findInCaches(CacheAspectSupport.java:537) ~[spring-context-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.cache.interceptor.CacheAspectSupport.findCachedItem(CacheAspectSupport.java:503) ~[spring-context-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.cache.interceptor.CacheAspectSupport.execute(CacheAspectSupport.java:389) ~[spring-context-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.cache.interceptor.CacheAspectSupport.execute(CacheAspectSupport.java:327) ~[spring-context-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.cache.interceptor.CacheInterceptor.invoke(CacheInterceptor.java:61) ~[spring-context-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179) ~[spring-aop-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:673) ~[spring-aop-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at com.jacarrichan.demo.sdr.service.ProductService$$EnhancerBySpringCGLIB$$b75f03f7.select(<generated>) ~[classes/:na]
	at com.jacarrichan.demo.sdr.ProductController.getProductInfo(ProductController.java:21) ~[classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_102]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_102]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_102]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_102]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:205) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:133) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:97) ~[spring-webmvc-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:827) ~[spring-webmvc-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:738) ~[spring-webmvc-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:85) ~[spring-webmvc-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963) ~[spring-webmvc-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:897) ~[spring-webmvc-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:970) ~[spring-webmvc-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:861) ~[spring-webmvc-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:635) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:846) ~[spring-webmvc-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:742) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52) ~[tomcat-embed-websocket-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:99) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.springframework.web.filter.HttpPutFormContentFilter.doFilterInternal(HttpPutFormContentFilter.java:105) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.springframework.web.filter.HiddenHttpMethodFilter.doFilterInternal(HiddenHttpMethodFilter.java:81) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:197) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.3.8.RELEASE.jar:4.3.8.RELEASE]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:198) ~[tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:478) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:140) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:80) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:87) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:342) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:799) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:861) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1455) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_102]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_102]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-8.5.14.jar:8.5.14]
	at java.lang.Thread.run(Thread.java:745) [na:1.8.0_102]

```
