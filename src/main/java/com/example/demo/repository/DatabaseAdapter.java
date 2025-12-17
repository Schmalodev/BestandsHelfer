package com.example.demo.repository;

import java.util.Map;

public interface DatabaseAdapter {
    public void WriteToDB();

    public Map<String, String> FetchToDB();
}
