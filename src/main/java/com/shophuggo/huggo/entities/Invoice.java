package com.shophuggo.huggo.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision=19)
    @ColumnDefault("'0'")
    private BigDecimal totalPrice;
    @Column(precision=19)
    @ColumnDefault("'0'")
    private BigDecimal discount;
    private String fullname;
    private String address;
    private String PhoneNumber;
    private String gmail;
    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();

}
