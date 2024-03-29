package Iphone;

import Exceptions.InvalidUserException;

public class Iphone {

    private String id; 
    private boolean isUsuarioValido;
    private Usuario usuarioLogado; 

    public void validarUsuario(Usuario usuario) {
        
        String mockupValidationApple = "123";

        if (usuario.getNome().isEmpty() || usuario.getSenha().isEmpty() || !usuario.getAppleId().equals(mockupValidationApple)) {
            throw new InvalidUserException("Usuário inválido.");
        }

        isUsuarioValido = true;
        usuarioLogado = usuario;

    }
}
