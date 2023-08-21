package com.shophuggo.huggo.entities;

import com.shophuggo.huggo.entities.enums.PermissionRole;
import com.shophuggo.huggo.entities.enums.RoleStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private PermissionRole role;
    @Enumerated(EnumType.STRING)
    private RoleStatus status;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users ;
}

