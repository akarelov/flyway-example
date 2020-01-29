package com.akarelov.flyway.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String text;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    @CreationTimestamp
    private LocalDate date;
    @UpdateTimestamp
    @Column(name = "date_of_modified")
    private LocalDate dateOfModified;
}
