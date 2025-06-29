package org.example;      // ← ajuste se o seu package for outro

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

    @Autowired
    private JdbcTemplate jdbc;

    @GetMapping("/dbtime")
    public String time() {
        // retorna a hora atual vinda do PostgreSQL
        return jdbc.queryForObject(
                "SELECT to_char(NOW(),'HH24:MI:SS')", String.class);
    }
}
