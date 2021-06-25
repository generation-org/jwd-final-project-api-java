package org.generation.taskplannerapi.respository;

import org.generation.taskplannerapi.respository.model.Task;
import org.generation.taskplannerapi.respository.remote.TaskDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class HashMapRepository
    implements TaskRepository
{
    private final Map<String, Task> tasks = new HashMap<>();

    private final AtomicInteger idGenerator = new AtomicInteger(1);

    @Override
    public Task create( TaskDto taskDto )
    {
        String id = String.valueOf( idGenerator.getAndIncrement() );
        return save( id, taskDto );
    }

    private Task save( String id, TaskDto taskDto )
    {
        Task task = new Task( id, taskDto );
        tasks.put( id, task );
        return task;
    }


    @Override
    public Task read( String id )
    {
        if ( tasks.containsKey( id ) )
        {
            return tasks.get( id );
        }

        return null;
    }

    @Override
    public Task update( Task task )
    {
        tasks.put( task.getId(), task );
        return task;
    }

    @Override
    public void delete( String id )
    {
        tasks.remove( id );
    }

    @Override
    public List<Task> all()
    {
        return new ArrayList<>( tasks.values() );
    }
}
