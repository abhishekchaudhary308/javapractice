package assessment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main4 {
	
	public static void main(String[] args) throws NumberFormatException, ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of players");
		int size = sc.nextInt();
		sc.nextLine();
		List<Player> player = new ArrayList<Player>(); 
		for (int i = 0; i < size; i++) {
			System.out.println("Enter details");

			String details = sc.nextLine();

			Player players = Player.createPlayer(details);
			player.add(players);
		}
		while (true) {
			System.out.println(
					"Enter the Search Type:\n1:sort Number of Matches\n2:Sort by runs scored\n3:Sort by power rating\n4:Exit\nEnter your choice");

			int choice = sc.nextInt();

			if (choice == 1) {
				Collections.sort(player);
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name", "Date of birth", "Skill",
						"No of matches", "Runs", "Wickets", "Nationality", "Rating");
				for (Player p : player) {
					System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%-10.1f\n", p.getName(),
							sdf.format(p.getDateOfBirth()), p.getSkill(), p.getNumberOfMatches(), p.getRuns(),
							p.getWickets(), p.getNationality(), p.getPowerRating());
				}

			} else if (choice == 2) {
				Collections.sort(player, new RunComparator());
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name", "Date of birth", "Skill",
						"No of matches", "Runs", "Wickets", "Nationality", "Rating");
				for (Player p : player) {
					System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%-10.1f\n", p.getName(),
							sdf.format(p.getDateOfBirth()), p.getSkill(), p.getNumberOfMatches(), p.getRuns(),
							p.getWickets(), p.getNationality(), p.getPowerRating());
				}

			} else if (choice == 3) {
				Collections.sort(player, new PowerRatingComparator());
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name", "Date of birth", "Skill",
						"No of matches", "Runs", "Wickets", "Nationality", "Rating");
				for (Player p : player) {
					System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%-10.1f\n", p.getName(),
							sdf.format(p.getDateOfBirth()), p.getSkill(), p.getNumberOfMatches(), p.getRuns(),
							p.getWickets(), p.getNationality(), p.getPowerRating());
				}

			}
			else
				System.out.println("Incorrect  Choice");
			sc.close();
		}
		
	}
}

