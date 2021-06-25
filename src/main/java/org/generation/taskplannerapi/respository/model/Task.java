package org.generation.taskplannerapi.respository.model;

import org.generation.taskplannerapi.respository.remote.TaskDto;
import org.generation.taskplannerapi.respository.remote.TaskStatusEnum;

import java.util.Date;

public class Task
{

    private String id;

    private String name;

    private String description;

    private String assignedTo;

    private Date dueDate;

    private TaskStatusEnum status;


    public Task()
    {
    }

    public Task( String name )
    {
        this.name = name;
    }

    public Task( String id, TaskDto taskDto )
    {
        this.id = id;
        this.assignedTo = taskDto.getAssignedTo();
        this.description = taskDto.getDescription();
        this.dueDate = taskDto.getDueDate();
        this.name = taskDto.getName();
        this.status = taskDto.getStatus();
    }

    public String getId()
    {
        return id;
    }

    public Date getDueDate()
    {
        return dueDate;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getAssignedTo()
    {
        return assignedTo;
    }

    public void setAssignedTo( String assignedTo )
    {
        this.assignedTo = assignedTo;
    }

    public TaskStatusEnum getStatus()
    {
        return status;
    }

    public void setStatus( TaskStatusEnum status )
    {
        this.status = status;
    }
}
