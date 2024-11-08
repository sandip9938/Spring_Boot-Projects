package com.sp.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component("owner")
@Data
@ToString
@ConfigurationProperties(prefix = "org.sp")
public class OwnerContact {
	private List<String> branches;
	private Set<String> owner;
	private List<String> phone;
}
