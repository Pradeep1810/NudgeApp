package com.nudgeapp.payloads;


import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NudgeDto {

	 
	  private String eventTag;

	 
	  private String title;

	
	  private String image;

	
	  private LocalDateTime time;

	
	  private String description;

	 
	  private String icon;

	 
	  private String invitation;
}
