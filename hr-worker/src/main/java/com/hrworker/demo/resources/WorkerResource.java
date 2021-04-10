package com.hrworker.demo.resources;

import com.hrworker.demo.entities.Worker;
import com.hrworker.demo.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    @Autowired
    WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = this.workerRepository.findAll();
        return ResponseEntity.ok(workers);
    }

    public ResponseEntity<Worker> findById(Long id) {
        Optional<Worker> worker = this.workerRepository.findById(id);
        return ResponseEntity.ok(worker.get());
    }


}
