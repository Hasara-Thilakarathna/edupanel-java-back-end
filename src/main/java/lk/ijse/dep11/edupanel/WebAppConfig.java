package lk.ijse.dep11.edupanel;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Bucket;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.StorageClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.InputStream;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebAppConfig {

    @Bean
    public Bucket defaultBucket() throws Exception {
        InputStream serviceAccount = getClass()
                .getResourceAsStream("/edu-panel-715bb-firebase-adminsdk-m5bi1-dc37c6697b.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setStorageBucket("edu-panel-715bb.appspot.com")
                .build();

        FirebaseApp.initializeApp(options);
        return StorageClient.getInstance().bucket();

    }

    @Bean
    public StandardServletMultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
    }
}
