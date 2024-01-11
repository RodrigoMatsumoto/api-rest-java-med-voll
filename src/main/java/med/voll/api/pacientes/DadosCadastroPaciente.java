package med.voll.api.pacientes;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
    @NotBlank
    String nome,
    
    @NotBlank
    @Email
    String email,
    
    @NotBlank
    String telefone, 
    String cpf, 
    DadosEndereco endereco
    ) {}
