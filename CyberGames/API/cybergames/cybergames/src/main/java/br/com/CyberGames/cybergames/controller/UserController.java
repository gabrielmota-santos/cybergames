/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.CyberGames.cybergames.controller;

import br.com.CyberGames.cybergames.DAO.IUsuario;
import br.com.CyberGames.cybergames.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author svers
 */
@RestController
@RequestMapping("/usuarios")
public class UserController {
    
    @Autowired
    private IUsuario dao;
    
    @GetMapping
    public List<Usuario> listaUsuarios (){
        List<Usuario> usuarios = (List<Usuario>) dao.findAll(); 
        return usuarios;
    }
    
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
        
    }
    
    @PutMapping
        public Usuario editarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
        }
}
