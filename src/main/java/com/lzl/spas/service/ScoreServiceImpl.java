package com.lzl.spas.service;
import com.lzl.spas.dao.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Component
public class ScoreServiceImpl  implements ScoreServiceInterface{
    @Autowired
    private ScoreRepository scoreRepository;

    @Override
    public List<Map<String, Object>> getScoreList(String studentNo) {
        return scoreRepository.getScoreListByStuNo(studentNo);
    }
}


