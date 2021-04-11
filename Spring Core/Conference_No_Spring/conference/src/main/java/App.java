import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpo;

public class App {
    public static void main(String [] r){
        SpeakerService service =
                new SpeakerServiceImpo();
         System.out.print(service.findAll().get(0).getfName());
    }
}
