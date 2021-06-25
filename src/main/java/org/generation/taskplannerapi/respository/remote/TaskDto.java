package org.generation.taskplannerapi.respository.remote;

import java.util.Date;

public class TaskDto
{
    private String name;

    private String description;

    private String assignedTo;

    private Date dueDate;

    private TaskStatusEnum status;

    public TaskDto( String name, String description, String assignedTo, TaskStatusEnum status )
    {
        this.name = name;
        this.description = description;
        this.assignedTo = assignedTo;
        this.status = status;
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

    public Date getDueDate()
    {
        return dueDate;
    }

    public void setDueDate( Date dueDate )
    {
        this.dueDate = dueDate;
    }
}
