package com.awards.drama.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="drama")
public class DramaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length=100, nullable = false)
    private String title;

    @Column(length=400)
    private String summary;

    @Column(length=100, nullable = false)
    private String poster;

    @Column(length=100)
    private String platform;

    @Column( )
    private Integer air_year;

    @Column(length=300)
    private String url;

    @Column(nullable = false)
    private Integer vote;
}
