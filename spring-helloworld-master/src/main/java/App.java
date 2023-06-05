import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


        Cat catBean = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean.getMessage());

        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean1.getMessage());

        System.out.println(bean == bean1);
        System.out.println(catBean == catBean1);







    }
}