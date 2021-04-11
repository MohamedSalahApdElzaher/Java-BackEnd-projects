import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String [] r){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService service = context.getBean("speakerService", SpeakerService.class);
         System.out.print(service.findAll().get(0).getfName());
    }
}
