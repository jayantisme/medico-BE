package com.pharmacy.medico;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "currency-service")
public class CurrencyServiceConfig {
    private String url;
    private String username;
    private String key;
}
