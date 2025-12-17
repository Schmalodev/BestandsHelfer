package com.example.demo.adapter;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.repository.*;

public class PostgreAdapter implements DatabaseAdapter{
    
    public void WriteToDB() {

    }

    public Map<String, String> FetchToDB() {
        Map<String, String> dict = new HashMap<>();
        return dict;
    }
}
