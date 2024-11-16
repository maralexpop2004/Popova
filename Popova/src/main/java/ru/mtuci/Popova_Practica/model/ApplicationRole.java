package ru.mtuci.Popova_Practica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.mtuci.Popova_Practica.model.Permission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
@Getter
@AllArgsConstructor
public enum ApplicationRole {
    USER(Set.of(ru.mtuci.Popova_Practica.model.Permission.READ)),
    ADMIN(Set.of(ru.mtuci.Popova_Practica.model.Permission.READ, ru.mtuci.Popova_Practica.model.Permission.MODIFICATION));
    private final Set<Permission> permissions;
    public Set<GrantedAuthority> getGrantedAuthorities() {
        Set<GrantedAuthority> grantedAuthorities = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + name()));
        return grantedAuthorities;
    }
}
