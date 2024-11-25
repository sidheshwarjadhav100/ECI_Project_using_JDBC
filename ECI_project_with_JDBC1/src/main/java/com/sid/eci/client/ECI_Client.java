package com.sid.eci.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sid.eci.controller.Controller;
import com.sid.eci.entity.Candidate;

public class ECI_Client {
	public static void main(String[] args) {
		Controller c = new Controller();
		try (Scanner sc = new Scanner(System.in)) {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			List<Candidate> candidatelist = null;
			int choice = 0;
			int count = 0;
			int status = 0;
			System.out.println("Wecome to Election Commition Of India");
			do {
				System.out.print(" --------------------\n");
				System.out.printf("|%-20s|\n", "       MENU");
				System.out.print(" --------------------\n");
				System.out.printf("|%-20s|\n", "1. Insert Candidate");
				System.out.print(" --------------------\n");
				System.out.printf("|%-20s|\n", "2. View candidate");
				System.out.print(" --------------------\n");
				System.out.printf("|%-20s|\n", "3. Update candidate");
				System.out.print(" --------------------\n");
				System.out.printf("|%-20s|\n", "4. Delete candidate");
				System.out.print(" --------------------\n");

				if (count > 0) {
					System.out.printf("|%-20s|\n", "5 Exit");
					System.out.print(" --------------------\n");

				}
				count++;

				try {
					System.out.println("Enter Choice");
					choice = sc.nextInt();
					System.out.println(choice);
				} catch (Exception e) {

					System.out.println("Project Terminated Due To Invalid Input.");
					break;
				}

				switch (choice) {
				case 1: {

					try {
						int cid;
						System.out.println("Enter Candidate id");
						cid = sc.nextInt();
						System.out.println("Enter name;");
						String name = bf.readLine();
						System.out.println("Enter Gender");
						String gender = bf.readLine();
						System.out.println("Enter Party");
						String party = bf.readLine();
						System.out.println("Enter State");
						String state = bf.readLine();
						System.out.println("Enter Assembly");
						String assembly = bf.readLine();
						System.out.println("Enter Age");
						int age = sc.nextInt();

						String res = c.addCandidate(cid, name, gender, party, state, assembly, age);
						System.out.println(res);
					} catch (Exception e) {
						e.printStackTrace();

					}

					System.out.println("____________________________________________________");
					System.out.println();
					break;
				}

				case 2: {
					int viewchoice = 0;
					do {

						System.out.print(" ------------------------------\n");
						System.out.printf("|%-30s|\n", "       VIEW MENU");
						System.out.print(" ------------------------------\n");
						System.out.printf("|%-30s|\n", "1. All Candidate of ECI 2024");
						System.out.print(" ------------------------------\n");
						System.out.printf("|%-30s|\n", "2. ECI candidate by party");
						System.out.print(" ------------------------------\n");
						System.out.printf("|%-30s|\n", "3. ECI candidate by gender");
						System.out.print(" ------------------------------\n");
						System.out.printf("|%-30s|\n", "4. ECI Candidate by assesmbly");
						System.out.print(" ------------------------------\n");
						System.out.printf("|%-30s|\n", "5. Main Menu");
						System.out.print(" ------------------------------\n");

						try {
							System.out.println("Enter choice");
							viewchoice = sc.nextInt();
						} catch (Exception e) {
							status = 1;
							choice = 5;
							System.out.println("Project Terminated Due To Invalid Input.");
							break;

						}

						switch (viewchoice) {
						case 1: {

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

							String party;
							try {
								System.out.println("Enter Party Name");
								party = bf.readLine();
								candidatelist = new ArrayList<Candidate>();
								candidatelist = c.getCandidateByParty(party);
								for (Candidate candidate : candidatelist) {
									System.out.println(candidate);
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							System.out.println("____________________________________________________");
							System.out.println();
							break;
						}
						case 3: {

							String gender;
							try {
								System.out.println("Enter Gender as male/Female");
								gender = bf.readLine();
								candidatelist = new ArrayList<Candidate>();
								candidatelist = c.getCandidateByGender(gender);

								for (Candidate candidate : candidatelist) {
									System.out.println(candidate);
								}
							} catch (Exception e) {
								e.printStackTrace();
							}

							System.out.println("____________________________________________________");
							System.out.println();
							break;
						}
						case 4: {

							String assembly;
							try {
								System.out.println("Enter Assembly");
								assembly = bf.readLine();
								candidatelist = new ArrayList<Candidate>();
								candidatelist = c.getCandidateByAssembly(assembly);
								for (Candidate candidate : candidatelist) {
									System.out.println(candidate);

								}
							} catch (Exception e) {
								e.printStackTrace();
							}

							System.out.println("____________________________________________________");
							System.out.println();
							break;
						}
						case 5: {

							break;
						}

						default: {
							System.out.println();
							System.out.println("Please Enter Valid Choice");
							System.out.println();

							break;
						}

						}

					} while (viewchoice != 5 || status == 0);
					break;
				}

				case 3: {

					try {
						int oldcid;
						System.out.println("Enter candidate id which you want to update");
						oldcid = sc.nextInt();
						System.out.println("Enter updated Candidate id");
						int updatedcid = sc.nextInt();
						System.out.println("Enter updated name;");
						String name = bf.readLine();
						System.out.println("Enter updated Party");
						String party = bf.readLine();
						System.out.println("Enter updated Assembly");
						String assembly = bf.readLine();
						System.out.println("Enter updated Age");
						int age = sc.nextInt();
						String res = c.updateCandidateData(oldcid, updatedcid, name, party, assembly, age);
						System.out.println(res);

					} catch (Exception e) {
						System.out.println("Project Terminated Due To Invalid Input.");

						break;
					}

					System.out.println("____________________________________________________");
					System.out.println();
					break;

				}

				case 4: {

					int id;
					try {
						System.out.println("Enter cadidate id which you want to delete");
						id = sc.nextInt();
						String res = c.deleteCadidate(id);
						System.out.println(res);
					} catch (Exception e) {
						e.printStackTrace();
					}

					System.out.println("____________________________________________________");
					System.out.println();
				}

				default: {
					System.out.println();
					System.out.println("Please Enter Valid Choice");
					System.out.println();

					break;
				}
				}

			} while (choice != 5 || (status == 0));
		}
	}
}