package com.sid.eci.client;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import com.sid.eci.controller.Controller;
import com.sid.eci.entity.Candidate;

public class ECI_Client {
	public static void main(String[] args) {
		Controller c = null;
		Scanner sc = new Scanner(System.in);
		List<Candidate> candidatelist = null;
		int choice = 0;

		do {

			int count = 0;
			System.out.println("MENU");
			System.out.println("1. Insert Candidate");
			System.out.println("2. View candidate");
			System.out.println("3. Update candidate");
			System.out.println("4. Delete candidate");
			if (count > 0) {
				System.out.println("5 Exit");
			}
			count++;

			System.out.println("Enter Choice");

			choice = sc.nextInt();

			switch (choice) {
			case 1: {

				System.out.println("Enter Candidate id");
				int cid = sc.nextInt();
				System.out.println("Enter name;");
				String name = sc.next();
				System.out.println("Enter Gender");
				String gender = sc.next();
				System.out.println("Enter Party");
				String party = sc.next();
				System.out.println("Enter State");
				String state = sc.next();
				System.out.println("Enter Assembly");
				String assembly = sc.next();
				System.out.println("Enter Age");
				int age = sc.nextInt();

				c = new Controller();
				String res = c.addCandidate(cid, name, gender, party, state, assembly, age);
				System.out.println(res);
				System.out.println("____________________________________________");

				break;
			}

			case 2: {
				do {

					// System.out.println("read op");
					System.out.println("VIEW MENU");
					System.out.println("1. All Candidate of ECI");
					System.out.println("2. ECI candidate by party");
					System.out.println("3. ECI candidate by gender");
					System.out.println("4. ECI Candidate by assesmbly");
					System.out.println("5. Main Menu");

					System.out.println("Enter choice");
					int viewchoice = sc.nextInt();

					switch (viewchoice) {
					case 1: {
						// View All Candidate of bd.
						// System.out.println(" View All Candidate of bd");
						candidatelist = new ArrayList<Candidate>();
						c = new Controller();
						candidatelist = c.getAllCandidate();
						for (Candidate candidate : candidatelist) {
							System.out.println(candidate);

						}
						System.out.println("____________________________________________________");
						System.out.println();
						break;
					}
					case 2: {
						System.out.println("Enter Party Name");
						String party = sc.next();
						candidatelist = new ArrayList<Candidate>();
						c = new Controller();
						candidatelist = c.getCandidateByParty(party);
						for (Candidate candidate : candidatelist) {
							System.out.println(candidate);
						}
						System.out.println("____________________________________________________");
						System.out.println();
						break;
					}
					case 3: {
						System.out.println("Enter Gender as male/Female");
						String gender = sc.next();
						candidatelist = new ArrayList<Candidate>();
						c = new Controller();
						candidatelist = c.getCandidateByGender(gender);
						for (Candidate candidate : candidatelist) {
							System.out.println(candidate);
						}
						System.out.println("____________________________________________________");
						System.out.println();
						break;
					}
					case 4: {
						System.out.println("Enter Assembly");
						String assembly = sc.next();
						candidatelist = new ArrayList<Candidate>();
						c = new Controller();
						candidatelist = c.getCandidateByAssembly(assembly);
						for (Candidate candidate : candidatelist) {
							System.out.println(candidate);

						}
						System.out.println("____________________________________________________");
						System.out.println();
						break;
					}
					case 5: {
						break;
					}

					default: {
						System.out.println("invalid input");
						break;
					}

					}
					if (viewchoice == 5) {
						break;

					}

				} while (true);
			}

			case 3: {
				System.out.println("Enter candidate id which you want to update");
				int oldcid = sc.nextInt();
				System.out.println("Enter updated Candidate id");
				int updatedcid = sc.nextInt();
				System.out.println("Enter updated name;");
				String name = sc.next();
				System.out.println("Enter updated Party");
				String party = sc.next();
				System.out.println("Enter updated Assembly");
				String assembly = sc.next();
				System.out.println("Enter updated Age");
				int age = sc.nextInt();
				c = new Controller();
				String res = c.updateCandidateData(oldcid, updatedcid, name, party, assembly, age);
				System.out.println(res);

				System.out.println("____________________________________________________");
				System.out.println();
				break;

			}

			case 4: {
				// delete candidate case
				// System.out.println("delete op");
				System.out.println("Enter cadidate id which you want to delete");
				int id = sc.nextInt();
				c = new Controller();
				String res = c.deleteCadidate(id);
				System.out.println(res);
				System.out.println("____________________________________________________");
				System.out.println();
			}

			}
			if (choice == 5) {
				break;

			}
		} while (true);
	}
}