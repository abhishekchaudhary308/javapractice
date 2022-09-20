package assessment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class PlayerBO {

	public List<Player> findPlayer(List<Player> playerList, String nationality) {
		List<Player> list = new ArrayList<>();
		for (Player players : playerList) {
			if (players.getNationality().equalsIgnoreCase(nationality)) {
				list.add(players);
			}
		}
		return list;
	}

	public List<Player> findPlayer(List<Player> playerList, Date dateofBirth) {
		List<Player> p = new ArrayList<>();
		for (Player players : playerList) {
			if (players.getDateOfBirth().compareTo(dateofBirth) == 0) {
				p.add(players);
			}
		}
		return p;

	}

	public List<Player> findPlayer(List<Player> playerList, double powerRating) {
		List<Player> p = new ArrayList<>();
		for (Player players : playerList) {
			if (players.getPowerRating() == powerRating) {
				p.add(players);

			}
		}
		return p;

	}

	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		PlayerBO pbo = new PlayerBO();
		System.out.println("Enter the Number of players");
		int size = sc.nextInt();
		List<Player> p = new ArrayList<>();
		sc.nextLine();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the details");
			String details = sc.nextLine();
			Player players = Player.createPlayer(details);
			p.add(players);
		}
		while (true) {
			System.out.println(
					"Enter the Search Type:\n1:By Nationality\n2:By Date of Birth\n3:By Power Rating\n4:Exit\nEnter your choice");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter the Nationality");
				String n = sc.next();

				List<Player> findbyNationa = pbo.findPlayer(p, n);

				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name", "Date of birth", "Skill",
						"No of matches", "Runs", "Wickets", "Nationality", "Rating");
				for (Player p1 : findbyNationa) {
					System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%-10.1f\n", p1.getName(),
							sdf.format(p1.getDateOfBirth()), p1.getSkill(), p1.getNumberOfMatches(), p1.getRuns(),
							p1.getWickets(), p1.getNationality(), p1.getPowerRating());
				}
			} else if (choice == 2) {
				System.out.println("Enter the date of birth");
				String n = sc.next();

				List<Player> findbydob = pbo.findPlayer(p, sdf.parse(n));

				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name", "Date of birth", "Skill",
						"No of matches", "Runs", "Wickets", "Nationality", "Rating");
				for (Player p1 : findbydob) {
					System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%-10.1f\n", p1.getName(),
							sdf.format(p1.getDateOfBirth()), p1.getSkill(), p1.getNumberOfMatches(), p1.getRuns(),
							p1.getWickets(), p1.getNationality(), p1.getPowerRating());
				}
			}
			else if (choice == 3) {
				System.out.println("Enter the power Rating");
				double r = sc.nextDouble();

				List<Player> findbyrating = pbo.findPlayer(p, r);
				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name", "Date of birth", "Skill",
						"No of matches", "Runs", "Wickets", "Nationality", "Rating");
				for (Player p1 : findbyrating) {
					System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%-10.1f\n", p1.getName(),
							sdf.format(p1.getDateOfBirth()), p1.getSkill(), p1.getNumberOfMatches(), p1.getRuns(),
							p1.getWickets(), p1.getNationality(), p1.getPowerRating());
				}

			} else
				System.out.println("Invalid Choice");
		}

	}

}

