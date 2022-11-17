package com.example.personalprojecttemplate.domain.store;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.personalprojecttemplate.domain.account.Account;

@Entity @Table(name = "store")
public class Store {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id", nullable = false) private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false) @JoinColumn(name = "account_id", nullable = false) private Account account;

    @Column(name = "deleted", nullable = false) private Boolean deleted = false;

    @Column(name = "name", nullable = false, length = 100) private String name;

    @Column(name = "description", length = 500) private String description;

    @Column(name = "img_url", length = 2083) private String imgUrl;

    @Column(name = "phone_number", length = 20) private String phoneNumber;

    @Column(name = "facebook_url", length = 2083) private String facebookUrl;

    @Column(name = "instagram_url", length = 2083) private String instagramUrl;

    @Column(name = "email", length = 50) private String email;

    @Column(name = "created_at", nullable = false) private Instant createdAt;

    @Column(name = "created_by", nullable = false, length = 10) private String createdBy;

    @Column(name = "modified_at", nullable = false) private Instant modifiedAt;

    @Column(name = "modified_by", nullable = false, length = 10) private String modifiedBy;
    @Column(name = "story_id") private Long storyId;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public Account getAccount() {return account;}

    public void setAccount(Account account) {this.account = account;}

    public Boolean getDeleted() {return deleted;}

    public void setDeleted(Boolean deleted) {this.deleted = deleted;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getImgUrl() {return imgUrl;}

    public void setImgUrl(String imgUrl) {this.imgUrl = imgUrl;}

    public String getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getFacebookUrl() {return facebookUrl;}

    public void setFacebookUrl(String facebookUrl) {this.facebookUrl = facebookUrl;}

    public String getInstagramUrl() {return instagramUrl;}

    public void setInstagramUrl(String instagramUrl) {this.instagramUrl = instagramUrl;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public Instant getCreatedAt() {return createdAt;}

    public void setCreatedAt(Instant createdAt) {this.createdAt = createdAt;}

    public String getCreatedBy() {return createdBy;}

    public void setCreatedBy(String createdBy) {this.createdBy = createdBy;}

    public Instant getModifiedAt() {return modifiedAt;}

    public void setModifiedAt(Instant modifiedAt) {this.modifiedAt = modifiedAt;}

    public String getModifiedBy() {return modifiedBy;}

    public void setModifiedBy(String modifiedBy) {this.modifiedBy = modifiedBy;}

    public Long getStoryId() {return storyId;}

    public void setStoryId(Long storyId) {this.storyId = storyId;}

/*
    TODO [JPA Buddy] create field to map the 'operating_hours' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "operating_hours", columnDefinition = "JSON(1073741824)") private Object operatingHours;
*/
}