package eg.bazinga.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChunkConfiguration {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotesBean() {
        return new ChuckNorrisQuotes();
    }
}
