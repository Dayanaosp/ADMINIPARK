/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import controlador.UsuarioController;
import modelo.usuario;

public class main {
         public static void main(String[] args) {
        // Crear instancia de Login
        Login login = new Login();
        
        // Crear instancia del modelo
        usuario modeloUsuario = new usuario();
        
        // Crear e inicializar el controlador con la vista y el modelo
        UsuarioController controlador = new UsuarioController(modeloUsuario, login);
        
        // Mostrar el formulario de login
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
}
