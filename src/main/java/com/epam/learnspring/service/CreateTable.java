package com.epam.learnspring.service;

import org.springframework.jdbc.core.JdbcTemplate;

//@Service
public class CreateTable {
    private JdbcTemplate jdbcTemplate;

    public CreateTable(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getTableCreationStatus(){
        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS cats");
            jdbcTemplate.execute(
                    "CREATE TABLE public.cats\n" +
                            "(\n" +
                            "    id integer NOT NULL,\n" +
                            "    name character(255),\n" +
                            "    description character(255),\n" +
                            "    CONSTRAINT cats_pkey PRIMARY KEY (id)\n" +
                            ")");
            return "table created";
        } catch (Exception e){
            e.printStackTrace();
            return "table creation failed";
        }
    }
}