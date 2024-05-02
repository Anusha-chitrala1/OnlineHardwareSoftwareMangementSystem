package com.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.stereotype.Service;

import com.main.Repository.ProblemRepository;
import com.main.model.ProblemModel;

@Service
public class ProblemService {
    
	@Autowired
    private ProblemRepository problemRepository;
    
    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }
    
    public Problem getProblemById(Long id) {
        return problemRepository.findById(id).orElse(null);
    }
    
    public Problem createProblem(Problem problem) {
        return problemRepository.save(problem);
    }
    @Autowired
    public Problem updateProblem(Long id , Problem updateProblem) {
        Problem existingProblem = problemRepository.findById(id).orElse(null);
        if (existingProblem != null) {
            existingProblem.setDescription(( updateProblem).getDescription());
            existingProblem.setStatus(updateProblem.getStatus();
            return problemRepository.save(existingProblem);
        }
        return null;
    }
    
    public void deleteProblem(Long id) {
        problemRepository.deleteById(id);
    }
}
