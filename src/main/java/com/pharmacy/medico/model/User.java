package com.pharmacy.medico.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "user_table")
public class User {
    @Id
    @Column(length = 16)
    UUID userId;

    String firstName;

    String lastName;

    String userType;

    String userPhone;

    String userEmail;

    String userPassword;

    String userAddress;

    String userGender;

    Date userDOB;

    boolean userBlocked;

    @CreationTimestamp
    Timestamp createdAt;

    @UpdateTimestamp
    Timestamp updatedAt;
}
