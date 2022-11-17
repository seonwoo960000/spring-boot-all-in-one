package com.example.personalprojecttemplate.domain.category;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "category")
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id", nullable = false) private Long id;

    @Column(name = "name", nullable = false, length = 100) private String name;

    @Column(name = "account_id", nullable = false) private Long accountId;

    @Column(name = "created_at", nullable = false) private Instant createdAt;

    @Column(name = "created_by", nullable = false, length = 10) private String createdBy;

    @Column(name = "modified_at", nullable = false) private Instant modifiedAt;
    @Column(name = "modified_by", nullable = false, length = 10) private String modifiedBy;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Long getAccountId() {return accountId;}

    public void setAccountId(Long accountId) {this.accountId = accountId;}

    public Instant getCreatedAt() {return createdAt;}

    public void setCreatedAt(Instant createdAt) {this.createdAt = createdAt;}

    public String getCreatedBy() {return createdBy;}

    public void setCreatedBy(String createdBy) {this.createdBy = createdBy;}

    public Instant getModifiedAt() {return modifiedAt;}

    public void setModifiedAt(Instant modifiedAt) {this.modifiedAt = modifiedAt;}

    public String getModifiedBy() {return modifiedBy;}

    public void setModifiedBy(String modifiedBy) {this.modifiedBy = modifiedBy;}

/*
    TODO [JPA Buddy] create field to map the 'menu_ids' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "menu_ids", columnDefinition = "JSON(1073741824)") private Object menuIds;
*/
}