package org.generation.pandevs.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component // Anotar a la clase como un componente para inyectar la clase en otras clases
public class JwtUtil {
    // 1. Clave secreta para firmar el token (utilizando un algoritmo: SH-256)
    private final Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // 2. Agregar un tiempo de expiración del token (ms)
    private final long expirationTime = 60*60*1000; // 1 hora (para la generación de uno nuevo)

    // 3. Metodo para generar el token
    // Contiene el asunto, fecha de emisión, tiempo de expiración, cómo se firma (secretKey)
    public String generateToken(String username){
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime)) // Acercar un tiempo de expiración con base en el tiempo actual del sistema
                .signWith(secretKey)
                .compact();
    }

    // 5. Metodo que permite extraer el username a partir del token parseado
    public String extractUsername(String token) {
        return parseToken(token).getBody().getSubject();
    }

    // 6. Metodo para validar el token (si está expirado no funcionará) -> boolean
    public boolean isTokenValid(String token){
        try {
            parseToken(token); // Intenta parsear y verificar la firma así como la fecha de expiración
            return true;
        } catch(JwtException e) {
            return false;
        }
    }

    // 4. Metodo para convertir el token, es decir, decodificar y verificar su firma
    private Jws<Claims> parseToken(String token) {// private para que solo la clase interactúe con él
        return Jwts.parser()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(token);
    }
}
