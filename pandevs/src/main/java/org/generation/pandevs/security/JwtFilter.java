package org.generation.pandevs.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


import java.io.IOException;
import java.util.Collections;

@Component
public class JwtFilter extends OncePerRequestFilter {
    private final JwtUtil jwtUtil;

    public JwtFilter(JwtUtil jwtUtil){
        this.jwtUtil = jwtUtil;
    }

    // Creamos metodo para ejecutar un filtro por cada petición HTTP
    // Trabajamos con 3 parámetros: request, response, filterChain
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        // 1. Obtener el header de una solicitud (Authorization)
        String authHeader = request.getHeader("Authorization");

        // 2. Verificar si el header existe y tiene el formato "Bearer [token]"
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
           // 3. Extraer el token
            String token = authHeader.substring(7);
            // 4. Verificamos si el token es válido usando jwtUtil
            if (jwtUtil.isTokenValid(token)){
                // 5. Extraemos el username
                String username = jwtUtil.extractUsername(token);
                // 6. Creamos un objeto de autenticación (sin password, sin rol)
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username, null, Collections.emptyList());
                // 7. Agregar detalles de la solicitud
                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                // 8.
                SecurityContextHolder.getContext().setAuthentication(auth);
            } // if
        } // if

        // 9. Permite que la petición continue en el filtro SecurityFilterChain
        filterChain.doFilter(request, response);

    } // doFilterInternal

} // class
