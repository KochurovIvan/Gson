package com.example.jsonparser;

public class Company
{
    private String[] competences;

    private String name;

    private Employee[] employees;

    private String age;

    public String[] getCompetences ()
    {
        return competences;
    }

    public void setCompetences (String[] competences)
    {
        this.competences = competences;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Employee[] getEmployees ()
    {
        return employees;
    }

    public void setEmployees (Employee[] employees)
    {
        this.employees = employees;
    }

    public String getAge ()
    {
        return age;
    }

    public void setAge (String age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [competences = "+competences+", name = "+name+", employees = "+employees+", age = "+age+"]";
    }
}