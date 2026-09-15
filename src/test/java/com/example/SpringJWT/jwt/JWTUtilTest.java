package com.example.SpringJWT.jwt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JWTUtilTest {
    @Test
    void requiresStrongExternalSecretAndSignsTokens() {
        assertThrows(IllegalArgumentException.class, () -> new JWTUtil(null));
        assertThrows(IllegalArgumentException.class, () -> new JWTUtil("short"));
        assertThrows(IllegalArgumentException.class, () -> new JWTUtil(" ".repeat(32)));
        JWTUtil jwt = new JWTUtil("test-only-signing-key-32-bytes-long");
        String token = jwt.createJwt("demo-user", "ROLE_USER", 60000L);
        assertEquals("demo-user", jwt.getUsername(token));
        assertEquals("ROLE_USER", jwt.getRole(token));
        assertFalse(jwt.isExpired(token));
    }
}
