package com.cricket.app.service;

import com.cricket.app.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<List<String>> getPointTable();
}
