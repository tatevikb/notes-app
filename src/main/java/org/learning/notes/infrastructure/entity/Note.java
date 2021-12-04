package org.learning.notes.infrastructure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Range(max=50, message = "The title length exceeds the allowable")
    @Column(name = "title")
    private String title;

    @Range(max=1000, message = "The note length exceeds the allowable")
    @Column(name = "note")
    private String note;

    @Column(name = "created_time")
    private LocalDateTime createTime;

    @Column(name = "updated_time")
    private LocalDateTime updateTime;
}
