package com.sid.eci.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sid.eci.entity.Candidate;
import com.sid.eci.utility.Utility;

public class Dao {

	// this method returns all the candidate from the database.
	public List<Candidate> getAllCandidate() {
		List<Candidate> allcandidate = new ArrayList<Candidate>();

		try {
			Connection conn = Utility.connection();
			PreparedStatement statement = conn.prepareStatement("select * from candidate");
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				int cid = resultSet.getInt("cid");
				String cname = resultSet.getString("name");
				String gender = resultSet.getString("gender");
				String party = resultSet.getString("party");
				String state = resultSet.getString("state");
				String assembly = resultSet.getString("assembly");
				int age = resultSet.getInt("age");

				Candidate c = new Candidate(cid, cname, gender, party, state, assembly, age);
				allcandidate.add(c);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return allcandidate;

	}

	// add candidate into database.
	public String addCandidate(int cid, String name, String gender, String party, String state, String assembly,
			int age) {
		String qry = "INSERT INTO ecidb.candidate(cid,name,gender,party,state,assembly,age) VALUES (?,?,?,?,?,?,?)";
		String result = null;
		try {
			Connection conn = Utility.connection();
			PreparedStatement st = conn.prepareStatement(qry);
			st.setInt(1, cid);
			st.setString(2, name);
			st.setString(3, gender);
			st.setString(4, party);
			st.setString(5, state);
			st.setString(6, assembly);
			st.setInt(7, age);

			int ex = st.executeUpdate();
			System.out.println(ex);

			if (ex > 0) {
				result = "Candidate Inserted Successfully";

			} else {
				result = "Something Went Wrong";
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return result;
	}

	// this method get id as parameter and delete that id candidate from database
	public String deleteCandidate(int id) {
		String res = null;
		String qry = "DELETE FROM ecidb.candidate WHERE cid=?";

		try {
			Connection conn = Utility.connection();
			PreparedStatement statement = conn.prepareStatement(qry);
			statement.setInt(1, id);
			int ex = statement.executeUpdate();

			if (ex > 0) {
				res = "Candidate deleted successfully";

			} else {
				res = "Candidate id not found";

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;

	}

	public String updateCandidateData(int oldcid, int updatedcid, String name, String party, String assembly, int age) {

		String res = null;

		String sqlupdate = "UPDATE ecidb.candidate SET cid = ?,party=?, name = ?, assembly=?,age=? WHERE cid=?; ";

		try {
			Connection conn = Utility.connection();
			PreparedStatement st = conn.prepareStatement(sqlupdate);
			st.setInt(1, updatedcid);
			st.setString(2, name);
			st.setString(3, party);
			st.setString(4, assembly);
			st.setInt(5, age);
			st.setInt(6, oldcid);
			

			int ex = st.executeUpdate();

			if (ex > 0) {
				res = "Candidate updated successfully";

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

}
