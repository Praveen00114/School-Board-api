package com.school.sba.entity;

import java.time.LocalDateTime;

import com.school.sba.enums.ClassStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ClassHour {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classHourId;
	private LocalDateTime beginsAt;
	private LocalDateTime endsAt;
	private int roomNo;
	@Enumerated(EnumType.STRING)
	private ClassStatus classStatus;
	private boolean isDeleted;
	
	
	@ManyToOne
	private Subject subject;
	
	@ManyToOne
	private AcademicProgram academicProgram;
	
	@ManyToOne
	private User user;
}
