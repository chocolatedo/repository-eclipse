package com.eastict.entity.GroupEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Results {

	private boolean success;
	private String message;
	private Object obj;
}
