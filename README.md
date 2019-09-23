# 自定义SpringBoot Starter

<a name="FSbvk"></a>
## 前言
已经是2019年了，这玩意已经不“新鲜”了，想起17年公司的大佬培训SpringBoot的一番话：

> 这个东西其实并不神奇，它有个自动装配的功能，然后打开jar包，找到源码，打开spring.factories说了一大堆...


但对于当时刚刚实习的萌新一脸懵逼，对于SpringBoot只是觉得好方便啊，加上JPA开发起来快多了。

时隔两年后，再看SpringBoot源码，确实如此，只能怪当时功力不够。这就是为什么大佬学个东西，半天就会了，很多技术的思想都是相通的，当然基础也非常的重要。

不知道以后还能不能超越大佬的高度，因为他真的是巨佬啊！

大佬还喜欢说一句话：
> 魔鬼藏在细节中



---

<a name="2Tu9I"></a>
## 自定义一个Starter
其实不难，需要掌握两点：

- 约定大于配置
- 条件注解

<a name="Jv0uX"></a>
### 约定大于配置
这个是现在软件开发中一个很重要思想（规范？），其实也很好理解，不解释。

<a name="SEHes"></a>
### 条件注解
条件注解其实在Spring中就已经有了，但是哪个版本出现的还没查阅，SpringBoot只不过发扬了、光大了而已。

例如`@ConditionalOnClass`这个注解，可以理解为`当类路径上有某个指定的类就生效`，自动配置就是利用这些`@Conditional*`为前缀的注解来完成的，也就是七八个而已，而且知名见意很好理解。

<a name="ktI8s"></a>
### Demo说明
所谓的自动装配就是提前帮我们配置好一个Bean，然后要用的时候，直接添加注解使用就行，就拿Redis来说，`redisTemplate`就是帮我们自动装配好了的，然后要用的时候直接加个注解就行<br />![image.png](https://cdn.nlark.com/yuque/0/2019/png/316467/1569249411819-76e86b4d-1525-4342-bfb9-0662190a251b.png#align=left&display=inline&height=493&name=image.png&originHeight=493&originWidth=1173&size=126975&status=done&width=1173)

我们的这个demo定义一个具有包装功能的starter，重点在于看看它是如何实现自动装配的，具体可以参考下SpringBoot的自动装配jar包`org/springframework/boot/spring-boot-autoconfigure/2.1.8.RELEASE/spring-boot-autoconfigure-2.1.8.RELEASE.jar`它的一些格式进行参考。<br />![image.png](https://cdn.nlark.com/yuque/0/2019/png/316467/1569249793029-a6ea9dbc-61d7-46bb-a8a2-be7527e399c8.png#align=left&display=inline&height=519&name=image.png&originHeight=519&originWidth=477&size=69613&status=done&width=477)


具体的看代码，运行一下就能体会到自动装配的奥妙所在了。如果还没实现过的，一定一定实现下，动手才是硬道理！

<a name="8NPfR"></a>
## 参考资料

- 演示demo
- 条件注解：[https://juejin.im/post/5c6c2189e51d45713911466d](https://juejin.im/post/5c6c2189e51d45713911466d)
- 每个注解源码也注释的很清楚了
