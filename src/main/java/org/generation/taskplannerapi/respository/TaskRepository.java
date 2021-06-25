package org.generation.taskplannerapi.respository;

import org.generation.taskplannerapi.respository.model.Task;
import org.generation.taskplannerapi.respository.remote.TaskDto;

import java.util.List;

public interface TaskRepository
{

    Task create( TaskDto taskDto );

    Task read( String id );

    Task update(Task task);

    void delete(String id);

    List<Task> all();

}
