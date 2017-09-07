package com.ifpb.springboot.main.controladores;

import com.ifpb.springboot.main.infra.ExemploDao;
import com.ifpb.springboot.main.interfaces.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExemploController {    
    
    private Dao tdao;
    
    @Autowired
    public ExemploController(ExemploDao tdao) {
        this.tdao = tdao;
    }

    // Salvar algo no banco utilizando todo o conceito de D.I e o postgres acoplado
//    @RequestMapping("salvar")
//    public String teste(String descricao) {
//        System.out.println(descricao);
//        tdao.adicionar(descricao);
//        return "redirect:index.html";
//    }
    
    // Requisição para a pagina index.html
    @RequestMapping("ir")
    public String irPara(){
        return "index.html";
    }

}
