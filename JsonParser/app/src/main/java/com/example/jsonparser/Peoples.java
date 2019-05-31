package com.example.jsonparser;


public class Peoples
{
    private Company company;

    public Company getCompany ()
    {
        return company;
    }

    public void setCompany (Company company)
    {
        this.company = company;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [company = "+company+"]";
    }
}




