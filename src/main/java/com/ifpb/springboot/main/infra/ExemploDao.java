
package com.ifpb.springboot.main.infra;

import com.ifpb.springboot.main.interfaces.Dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExemploDao implements Dao{

    private Connection conexao;
    
    @Autowired
    public ExemploDao(DataSource dataSource){
        try {
            this.conexao = dataSource.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public boolean adicionar(Object o) {
        // Implementar
        return true;
    }

    @Override
    public boolean remover(Object o) {
        // Implementar
        return true;
    }

    @Override
    public boolean atualizar(Object o) {
        // Implementar
        return true;
    }

    @Override
    public List<Object> todosDados() {
        // Implementar
        return null;
    }
    
}
