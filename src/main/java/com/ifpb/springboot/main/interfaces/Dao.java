
package com.ifpb.springboot.main.interfaces;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao {    
    boolean adicionar(Object o);
    boolean remover(Object o);
    boolean atualizar(Object o);
    List<Object> todosDados();
}
