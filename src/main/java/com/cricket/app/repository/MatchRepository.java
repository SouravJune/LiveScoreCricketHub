package com.cricket.app.repository;

import com.cricket.app.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {

    Optional<Match> findByTeamHeading(String teamHeading);
}
