package com.cricket.app.controller;

import com.cricket.app.entities.Match;
import com.cricket.app.service.MatchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches() {
        return ResponseEntity.ok().body(matchService.getLiveMatches());
    }

    @GetMapping("/all-matches")
    public ResponseEntity<List<Match>> getAllMatches() {
        return ResponseEntity.ok().body(matchService.getAllMatches());
    }

    @GetMapping("/point-table")
    public ResponseEntity<List<List<String>>> getPointTable() {
        return ResponseEntity.ok().body(matchService.getPointTable());
    }
}
