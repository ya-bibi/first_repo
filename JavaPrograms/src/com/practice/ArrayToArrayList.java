package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {

		String batsman[] = { "rohit", "Kohlu", "Dhoni" };
		String bowlers[] = { "bumra", "shami" };

		List<String> players = new ArrayList<>();

		for (String player : batsman) {
			players.add(player);
		}
		for (String player : bowlers) {
			players.add(player);
		}
		System.out.println(players);
	}

}
