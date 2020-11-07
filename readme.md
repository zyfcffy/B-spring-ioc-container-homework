##@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

1、@Component是作用于一个类，@Bean是对方法进行注解，这个方法是获得bean对象的方法;
2、@Component是以注解的方式自动来Spring来创建bean实例，但是@Bean和@Configuration搭配使用是基于Java的显示配置来声明让Spring来创建bean实例；
3、如果想将第三方的类变成组件，你又没有没有源代码，也就没办法使用@Component进行自动配置，这种时候使用@Bean就比较合适了。