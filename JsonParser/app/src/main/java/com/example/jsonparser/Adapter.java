package com.example.jsonparser;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>
{
    Employee[] employees;

    public  Adapter (Employee[] employees){
        this.employees = employees;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, phone,skills;

        public ViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            phone = (TextView) view.findViewById(R.id.phone);
            skills = (TextView) view.findViewById(R.id.skills);
        }
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        holder.name.setText(employees[position].getName());
        holder.phone.setText(employees[position].getPhone_number());
        holder.skills.setText(employees[position].toStringSkills());
    }
    @Override
    public int getItemCount(){
        return employees.length;
    }
}


