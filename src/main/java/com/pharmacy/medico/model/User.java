package com.pharmacy.medico.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue
    @Column(length = 16)
    UUID userId;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "user_type")
    String userType;

    @Column(name = "user_phone")
    String userPhone;

    @Column(name = "user_email")
    String userEmail;

    @Column(name = "user_password")
    String userPassword;

    @Column(name = "user_address")
    String userAddress;

    @Column(name = "user_gender")
    String userGender;

    @Column(name = "user_dob")
    Date userDOB;

    @Column(name = "user_blocked")
    boolean userBlocked;

    @CreationTimestamp
    Timestamp createdAt;

    @UpdateTimestamp
    Timestamp updatedAt;
}
