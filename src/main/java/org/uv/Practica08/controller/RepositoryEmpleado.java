/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.Practica08.controller;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author yahir
 */
public interface RepositoryEmpleado extends CrudRepository<Empleado, Long>  {
    
}