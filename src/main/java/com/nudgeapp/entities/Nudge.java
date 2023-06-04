package com.nudgeapp.entities;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Nudge {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;

	  @Column(name = "event_tag")
	  private String eventTag;

	  @Column(name = "title")
	  private String title;

	  @Column(name = "image")
	  private String image;

	  @Column(name = "time")
	  private LocalDateTime time;

	  @Column(name = "description")
	  private String description;

	  @Column(name = "icon")
	  private String icon;

	  @Column(name = "invitation")
	  private String invitation;

}
