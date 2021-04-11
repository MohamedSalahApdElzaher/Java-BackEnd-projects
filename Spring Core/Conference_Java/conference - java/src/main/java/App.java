import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String [] r){

        // load config file
        ApplicationContext context =
                new AnnotationConfigApplicationContext(appConfig.class);

        SpeakerService service = context.getBean("speakerService", SpeakerService.class);

        System.out.print("Hi " + service.findAll().get(0).getfName() + " from Spring Configuration :)");
    }
}
