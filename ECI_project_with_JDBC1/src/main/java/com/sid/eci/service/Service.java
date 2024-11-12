package com.sid.eci.service;

import java.util.ArrayList;
import java.util.List;

import com.sid.eci.dao.Dao;
import com.sid.eci.entity.Candidate;

public class Service {
	Dao d = null;
	List<Candidate> allCandidates = new ArrayList<Candidate>();

	public List<Candidate> getAllCandidate() {
		// System.out.println("this is service");
		d = new Dao();
		allCandidates = d.getAllCandidate();

		return allCandidates;
	}

	public List<Candidate> getCandidateByParty(String party) {
		d = new Dao();
		for (Candidate candidate : d.getAllCandidate()) {
			if (candidate.getParty().equalsIgnoreCase(party)) {
				allCandidates.add(candidate);

			}

		}

		return allCandidates;
	}

	public List<Candidate> getCandidateByGender(String gender) {
		d = new Dao();
		for (Candidate candidate : d.getAllCandidate()) {
			if (candidate.getGender().equalsIgnoreCase(gender)) {
				allCandidates.add(candidate);

			}
		}
		return allCandidates;
	}

	public List<Candidate> getCandidateByAssembly(String assembly) {
		d = new Dao();
		for (Candidate candidate : d.getAllCandidate()) {
			if (candidate.getAssembly().equalsIgnoreCase(assembly)) {
				allCandidates.add(candidate);

			}
		}
		return allCandidates;
	}

	// add candidate method
	public String addCandidate(int cid, String name, String gender, String party, String state, String assembly,
			int age) {
		d = new Dao();
		String res = d.addCandidate(cid, name, gender, party, state, assembly, age);

		return res;
	}

	// delete method
	public String deleteCadidate(int id) {
		d = new Dao();
		String res = d.deleteCandidate(id);

		return res;
	}

	// update candidate data
	public String updateCandidateData(int oldcid, int updatedcid, String name, String party, String assembly, int age) {
		String res = null;
		d = new Dao();
		int count=0;
		for (Candidate candidate : d.getAllCandidate()) {

			if (oldcid == candidate.getCid()) {
			count++;
				d = new Dao();
				res = d.updateCandidateData(oldcid, updatedcid, name, party, assembly, age);

			}

		}
		if (count==0) {
			res="This candidate id is not existing";
			
		}

		return res;
	}

}
