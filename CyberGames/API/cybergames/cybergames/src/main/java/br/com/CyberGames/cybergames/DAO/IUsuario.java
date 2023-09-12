/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.CyberGames.cybergames.DAO;

import br.com.CyberGames.cybergames.model.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author svers
 */
public interface IUsuario extends CrudRepository<Usuario, Integer>{
    
}
