package itacademy.testexam.controller;

import itacademy.testexam.entity.Count;
import itacademy.testexam.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CounterController {
    @Autowired
    private CountService countService;

    @PostMapping("/counter")
    public Count count(@RequestBody Count count){
        Count getLastCount = getReport().get(getReport().size()-1);
        count.setCount(getLastCount.getCount() + 1);
        count.setTotal(count.getCount());
        return countService.post(count);
    }


    @GetMapping("/counter")
    public Integer getcount(){
        Count getLastCount = getReport().get(getReport().size()-1);
        return getLastCount.getTotal();
    }
    @GetMapping("/report")
    public List<Count> getReport(){
        return countService.getReport();
    }

}
