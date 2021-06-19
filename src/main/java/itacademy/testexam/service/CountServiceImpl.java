package itacademy.testexam.service;

import itacademy.testexam.entity.Count;
import itacademy.testexam.repository.CountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CountServiceImpl implements CountService {
    @Autowired
    private CountRepo countRepo;

    @Override
    public List<Count> getReport() {
        return  countRepo.findAll();
    }

    @Override
    public Count post(Count count) {
        return countRepo.save(count);
    }
}
