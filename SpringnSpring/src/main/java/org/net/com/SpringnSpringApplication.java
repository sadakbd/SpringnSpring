package org.net.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringnSpringApplication implements CommandLineRunner{
	
	@Autowired
    private NetAppName appName;
	
	@Bean
    public NetAppName getAppName(@Value("${app.name}") String app) {

        return new NetAppName() {

            @Override
            public String getName() {
                return app;
            }
        };
    }
	

	public static void main(String[] args) {
		SpringApplication.run(SpringnSpringApplication.class, args);
		
	}


	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("appName "+appName.getName());
		
	}
}
