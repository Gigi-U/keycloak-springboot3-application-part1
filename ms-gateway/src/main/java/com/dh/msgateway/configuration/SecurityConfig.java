package com.dh.msgateway.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.client.oidc.web.server.logout.OidcClientInitiatedServerLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;

@Configuration
public class SecurityConfig {
    @Autowired
    private ReactiveClientRegistrationRepository reactiveClientRegistrationRepository;

    @Bean
    public SecurityWebFilterChain SecurityWebfilterChain (ServerHttpSecurity http){
        http
                .authorizeExchange((exchanges) -> exchanges
                .anyExchange().authenticated());
        http.oauth2Login(Customizer.withDefaults());
        http.logout((logout) -> logout.logoutSuccessHandler(oidcServerLogoutSuccessHandler()));
        return http.build();
    }
    private ServerLogoutSuccessHandler oidcServerLogoutSuccessHandler() {
        OidcClientInitiatedServerLogoutSuccessHandler oidcClientInitiatedServerLogoutSuccessHandler =
                new OidcClientInitiatedServerLogoutSuccessHandler(this.reactiveClientRegistrationRepository);

        oidcClientInitiatedServerLogoutSuccessHandler.setPostLogoutRedirectUri("{baseUrl}");
        return oidcClientInitiatedServerLogoutSuccessHandler;
    }

}
