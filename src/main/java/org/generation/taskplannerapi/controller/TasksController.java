package org.generation.taskplannerapi.controller;


import org.generation.taskplannerapi.respository.TaskRepository;
import org.generation.taskplannerapi.respository.model.Task;
import org.generation.taskplannerapi.respository.remote.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/task" )
public class TasksController
{
    private final TaskRepository taskRepository;


    public TasksController( @Autowired TaskRepository taskRepository )
    {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public List<Task> all()
    {
        return taskRepository.all();
    }

    @GetMapping( "/{id}" )
    public Task get( @PathVariable String id )
    {
        return taskRepository.read( id );
    }

    @PostMapping
    public Task create( @RequestBody TaskDto taskDto )
    {
        return taskRepository.create( taskDto );
    }

    @PutMapping( "/{id}" )
    public Task update( @PathVariable String id, @RequestBody TaskDto taskDto )
    {
        return taskRepository.update( new Task( id, taskDto ) );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable String id )
    {
        taskRepository.delete( id );
    }
}
