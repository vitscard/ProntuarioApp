/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prontuario.rest;

import com.prontuario.bean.Paciente;
import com.senac.util.CrudGenerico;
import java.util.List;
import javax.ws.rs.Path;

/**
 *
 * @author scard
 */
@Path("/pacientes")
public class PacienteRest implements CrudGenerico<Paciente>{

    @Override
    public void salvar(Paciente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Paciente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> listar(Paciente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente consultar(Paciente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}