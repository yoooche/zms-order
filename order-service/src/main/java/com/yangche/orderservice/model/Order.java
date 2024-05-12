package com.yangche.orderservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "`ORDER`")
@JsonIgnoreProperties({"version", "createTime", "updateTime"})
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "TYPE")
    private Integer type;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "CREATE_TIME")
    private Timestamp createTime;

    @Column(name = "UPDATE_TIME")
    private Timestamp updateTime;

    @Transient
    private User user;
}