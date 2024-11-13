package com.sid.eci.controller;

import java.util.ArrayList;
import java.util.List;

import com.sid.eci.entity.Candidate;
import com.sid.eci.service.Service;

public class Controller {
	Service s = null;
	// List<Candidate> candidate = null;

	// this method add candidate into database
	public String addCandidate(int cid, String name, String gender, String party, String state, String assembly,
			int age) {
		s = new Service();
		String res = s.addCandidate(cid, name, gender, party, state, assembly, age);

		return res;
	}

	public List<Candidate> getAllCandidate() {
		s = new Service();
		List<Candidate> allcandidatelist = new ArrayList<Candidate>();
		allcandidatelist = s.getAllCandidate();
		return allcandidatelist;

	}

	public List<Candidate> getCandidateByParty(String party) {
		s = new Service();
		List<Candidate> candidatebyparty = new ArrayList<Candidate>();
		candidatebyparty = s.getCandidateByParty(party);

		return candidatebyparty;
	}

	public List<Candidate> getCandidateByGender(String gender) {
		s = new Service();
		List<Candidate> candidatebygender = new ArrayList<Candidate>();
		candidatebygender = s.getCandidateByGender(gender);

		return candidatebygender;
	}

	public List<Candidate> getCandidateByAssembly(String assembly) {
		s = new Service();
		List<Candidate> candidatebyassembly = new ArrayList<Candidate>();
		candidatebyassembly = s.getCandidateByAssembly(assembly);

		return candidatebyassembly;
	}

	// update candidate
	public String updateCandidateData(int oldcid, int updatedcid, String name, String party, String assembly, int age) {
		s = new Service();
		String res = s.updateCandidateData(oldcid, updatedcid, name, party, assembly, age);
		return res;
	}

	// delete candidate by id
	public String deleteCadidate(int id) {
		s = new Service();
		String res = s.deleteCadidate(id);

		return res;
	}

}
