package com.example;

import org.apache.commons.lang3.StringUtils;

public class Texto {

	public static void main(String[] args) {
		System.out.println("Vazio? " + StringUtils.isBlank(" "));
		System.out.println("Vazio? " + StringUtils.isBlank("Luiza"));
		
		
		System.out.println(StringUtils.abbreviate("Luiza", 5));
		System.out.println(StringUtils.contains("Luiza", "Luiz"));
		System.out.println(StringUtils.length("Luiza"));
		System.out.println(StringUtils.reverse("Luiza"));
	}

}
