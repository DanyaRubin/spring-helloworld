import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());

        Cat catOne = (Cat) applicationContext.getBean("cat");
        System.out.println(catOne.getMessage());

        Cat catTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(catTwo.getMessage());

        System.out.println(bean == beanTwo);
        System.out.println(catOne == catTwo);
    }
}