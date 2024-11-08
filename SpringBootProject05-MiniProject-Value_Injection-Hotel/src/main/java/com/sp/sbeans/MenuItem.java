package com.sp.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menu")
@Data
public class MenuItem {
	@Value("${menu.vegMeal}")
	private float vegMealPrice;
	@Value("${menu.nonvegMeal}")
	private float nonvegMealPrice;
	@Value("${menu.vegBiryani}")
	private float vegBiryaniPrice;
	@Value("${menu.chickenBiryani}")
	private float chickenBiryaniPrice;
	@Value("${menu.muttonBiryani}")
	private float muttonBiryaniPrice;
}
