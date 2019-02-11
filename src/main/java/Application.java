

import java.io.IOException;
import java.net.URISyntaxException;
import javax.xml.transform.TransformerException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication()
public class Application {

    public Application() throws IOException {
    }

    public static void main(String args[]) throws IOException, TransformerException, URISyntaxException {
        new SpringApplicationBuilder(Application.class).run(args);

    }
}
