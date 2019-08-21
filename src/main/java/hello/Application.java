package hello;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;

import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.util.Properties;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
        Properties properties = loadConfiguration();
    }
    
    
    
    
    
    private static Properties loadConfiguration() {
        Properties properties = new Properties();
        try (InputStream is = Application.class.getResourceAsStream("/config.properties")) {
            properties.load(is);
        } catch (IOException e) {
            ((org.slf4j.Logger) LOG).error("Can't load properties file", e);
            throw new IllegalStateException(e);
        }

        return properties;
    }

}



/*
 *	Сервисный ключ доступа	. 	.	.	66ea739b66ea739b66ea739bda668614a1666ea66ea739b3bb1dc9c2f96e91811f38d941
 *	Защищённый ключ		.	.	.	.	HPnWasK3qZ3ei5mIE2ED1
 *
 *	
 *  идентификатор приложения  	.	.	API_ID			7104314
 *  безопасный ключ .	.	.	.	.	CLIENT_SECRET	HPnWasK3qZ3ei5mIE2ED1   
 *  авторизованного перенаправления .	REDIRECT_URI

		
		
		https://oauth.vk.com/authorize?
		
		client_id=7104314&
		
		display=page&
		
		redirect_uri=https://oauth.vk.com/blank.html&
		
		scope=friends&
		
		response_type=token&
		
		v=5.52

 */