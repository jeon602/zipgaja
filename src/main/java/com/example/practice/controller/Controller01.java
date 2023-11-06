package com.example.practice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
@RequiredArgsConstructor
@RequestMapping("main1")
public class Controller01 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1(@RequestParam("name")String name, Model model) throws SQLException {
        String sql = """
                INSERT INTO musiclist(Name, Title, Releasedate, Price, Production)
                VALUE(?,?,?,?,?)
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);


        try (connection; statement) {
            statement.setString(1, "sfdhlsdv");
            statement.setString(2, "adadakad");
            statement.setString(3, "adadakad");
            statement.setString(4, "2019-01-01");
            statement.setString(5, "adadakad");
            int rows = statement.executeUpdate();
            if (rows == 1) {
                System.out.println("complete change");
            } else {
                System.out.println("try again");
            }

        }
    }
    @PostMapping("sub1")
    public void method2()throws SQLException{

    }
}



