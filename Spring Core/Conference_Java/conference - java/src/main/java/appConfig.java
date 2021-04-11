// start configuration App using Java

import com.pluralsight.repository.HibernateSpeakerRepositoryImplmentation;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImp;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.pluralsight"}) // scan all package/subpackages
public class appConfig {

    /*
    // Bean is only individual method level
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService(){
        // inject using constructor
        SpeakerServiceImp sp = new SpeakerServiceImp(getSpeakerRepositry());
        // inject using setter
        sp.setSpeakerRepository(getSpeakerRepositry());
        return sp;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepositry(){
        return new HibernateSpeakerRepositoryImplmentation();
    }
*/
}
