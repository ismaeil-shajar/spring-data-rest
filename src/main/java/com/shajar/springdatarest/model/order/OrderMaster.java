package com.shajar.springdatarest.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Table
public class OrderMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String data;

    @Column( nullable = false)
    private BigInteger orderDate;

    @Column
    private float totalAmount;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date updateDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date createDate;
}
