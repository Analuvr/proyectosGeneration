package org.generation.pandevs.config;

import org.generation.pandevs.security.JwtFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration // Indicar que es una clase de configuración
@EnableWebSecurity // Indicar que es una configuración de security
public class SecurityConfig {

    // Inyección de dependencias
    private final JwtFilter jwtFilter;

    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    // Metodo para usar PasswordEncoder y Bcrypt
    @Bean // Marcado como tipo Bean para que sea parte de la configuración
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Retorna un objeto del tipo
    }

    // Configurar el SecurityFilterChain
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{ // HttpSecurity allows configuring web based security for specific http requests.
        return httpSecurity
                .csrf(csrf -> csrf.disable()) // Deshabilitar el uso de password, utilizamos función lamda para recorrer

                // Configurar la autorizacipón para peticiones HTTP
                .authorizeHttpRequests (auth -> auth
                                .requestMatchers("/auth/**").permitAll()
                                .anyRequest().authenticated()

                        /*
                        .anyRequest()
                        .permitAll() // Cualquier solicitud se autoriza
                         */
                )
                // .httpBasic(Customizer.withDefaults()); // Metodo para que la autenticación no solicite un usuario
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class) // Filter Chain
                .build();
        // return httpSecurity.build();
    }

}
