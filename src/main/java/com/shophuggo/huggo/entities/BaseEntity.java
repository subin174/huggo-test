package com.shophuggo.huggo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
@Getter
@Setter
@MappedSuperclass

public abstract class BaseEntity {
    @ManyToOne
    @JoinColumn(name = "created_by")
    @JsonBackReference
    private User createdBy;
    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "updated_by")
    @JsonBackReference
    private User updatedBy;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
