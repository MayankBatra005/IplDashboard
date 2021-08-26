package io.mayank.Ipl.dashboard.data;
import io.mayank.Ipl.dashboard.models.Match;
import io.mayank.Ipl.dashboard.models.MatchInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;

public class DataProcessor implements ItemProcessor<MatchInput, Match>{
    private static final Logger log = LoggerFactory.getLogger(DataProcessor.class);

    @Override
    public Match process(final MatchInput matchInput) throws Exception {
        Match match=new Match();
        match.setId(Long.parseLong(matchInput.getId()));
        match.setCity(matchInput.getCity());
        match.setDate(LocalDate.parse(matchInput.getDate()));
        match.setPlayerOfMatch(matchInput.getPlayer_of_match());
        match.setEliminator(matchInput.getEliminator());
        match.setMatchWinner(matchInput.getWinner());
        match.setResult(matchInput.getResult());
        match.setResultMargin(matchInput.getResult_margin());
        match.setTeam1(matchInput.getTeam1());
        match.setTeam2(matchInput.getTeam2());
        match.setTossDecision(matchInput.getToss_decision());
        match.setUmpire1(matchInput.getUmpire1());
        match.setUmpire2(matchInput.getUmpire2());
        match.setVenue(matchInput.getVenue());
        match.setTossWinner(matchInput.getToss_winner());
        
        
        return match;
    }
}
