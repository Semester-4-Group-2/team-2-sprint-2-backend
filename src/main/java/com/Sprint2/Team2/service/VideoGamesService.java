package com.Sprint2.Team2.service;


import com.Sprint2.Team2.model.VideoGames;

import java.util.List;

public interface VideoGamesService {
    public VideoGames saveVideoGames(VideoGames videoGames);
    public List<VideoGames> getAllVideoGames();

    public VideoGames getById(Long id);

    public VideoGames getByName(String name);

    public List<VideoGames> getByGenre(String genre);

    public VideoGames updateVideoGames(VideoGames videoGames);


    void deleteVideoGames(Long id);
}
