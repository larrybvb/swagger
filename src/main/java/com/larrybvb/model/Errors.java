package com.larrybvb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Errors {

	private String code;
	private String message;
}
