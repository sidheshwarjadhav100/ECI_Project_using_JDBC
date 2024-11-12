package com.sid.eci.controller;

import java.util.ArrayList;
import java.util.List;

import com.sid.eci.entity.Candidate;
import com.sid.eci.service.Service;

public class Controller {
	Service s = null;
	List<Candidate> candidate = null;

	// this method add candidate into database
	public String addCandidate(int cid, String name, String gender, String party, String state, String assembly,
			int age) {
		s = new Service();
		String res = s.addCandidate(cid, name, gender, party, state, assembly, age);

		return res;
	}

	public List<Candidate> getAllCandidate() {
		// System.out.println("this is controller");
		candidate = new ArrayList<Candidate>();
		s = new Service();
		candidate = s.getAllCandidate();
		return candidate;

	}

	public List<Candidate> getCandidateByParty(String party) {
		s = new Service();
		candidate = new ArrayList<Candidate>();
		candidate = s.getCandidateByParty(party);

		return candidate;
	}

	public List<Candidate> getCandidateByGender(String gender) {
		s = new Service();
		candidate = new ArrayList<Candidate>();
		candidate = s.getCandidateByGender(gender);

		return candidate;
	}

	public List<Candidate> getCandidateByAssembly(String assembly) {
		s = new Service();
		candidate = new ArrayList<Candidate>();
		candidate = s.getCandidateByAssembly(assembly);

		return candidate;
	}

	// update candidate
	public String updateCandidateData(int oldcid, int updatedcid, String name, String party, String assembly, int age) {
		s = new Service();
		String res = s.updateCandidateData(oldcid, updatedcid, name, party, assembly, age);
		return res;
	}

	// delete canidate by id
	public String deleteCadidate(int id) {
		s = new Service();
		String res = s.deleteCadidate(id);

		return res;
	}

}
