import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


        ApplicationContext applicationContextCat = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat catBean = (Cat) applicationContextCat.getBean("cat");
        System.out.println(catBean.getMessage());


        ApplicationContext applicationContextCat3 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat catBean3 = (Cat) applicationContextCat.getBean("cat");
        System.out.println(catBean.getMessage());

        System.out.println(bean == bean2);
        System.out.println(catBean == catBean3);
    }
}