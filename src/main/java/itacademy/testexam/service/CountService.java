package itacademy.testexam.service;

import itacademy.testexam.entity.Count;

import java.util.List;

public interface CountService {
    List<Count> getReport();
    Count post(Count count);
}
