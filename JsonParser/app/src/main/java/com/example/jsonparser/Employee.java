package com.example.jsonparser;

public class Employee
{
    private String[] skills;

    private String name;

    private String phone_number;

    public String[] getSkills ()
    {
        return skills;
    }

    public void setSkills (String[] skills)
    {
        this.skills = skills;
    }

    public String getName ()
    {
        return "Name:\n" + name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPhone_number ()
    {
        return "Phone:\n" + phone_number;
    }

    public void setPhone_number (String phone_number)
    {
        this.phone_number = phone_number;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [skills = "+skills+", name = "+name+", phone_number = "+phone_number+"]";
    }
    public String toStringSkills()
    {
        String allSkills = null;
        for (int i = 0 ; i < skills.length ; i++)
        {
            allSkills += skills[i]+"\n";
        }
        return "Skills:\n" + allSkills;
    }
}

