package java02.group1.productcatalogmanagementsystem.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        servers = {
                @Server(url = "https://web-production-ecb33.up.railway.app")
        }
)
public class OpenApiConfig {
}