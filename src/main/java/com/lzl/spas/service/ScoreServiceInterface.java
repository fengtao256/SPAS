package com.lzl.spas.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface ScoreServiceInterface {
    List<Map<String,Object>> getScoreList(String studentNo);
}
