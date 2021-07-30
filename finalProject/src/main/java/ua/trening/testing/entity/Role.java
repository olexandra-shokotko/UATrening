package ua.trening.testing.entity;

import org.springframework.security.core.GrantedAuthority;
import javax.persistence.*;
import java.util.Set;

public enum Role {
    ROLE_ADMIN,
    ROLE_USER,
    ROLE_GUEST
}
