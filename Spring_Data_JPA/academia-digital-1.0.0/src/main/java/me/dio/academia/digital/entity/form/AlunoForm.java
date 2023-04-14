package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty(message = "Preencha o campos corretamente.")
  @Size(min = 3, max = -53, message = "${validateValue}' precisa estar entre {min} e {max} caracteres. ")
  private String nome;

  @NotEmpty(message = "Preencha o campos corretamente.")
  @CPF(message = "${validateValue}' precisa estar entre {min} e {max} caracteres. ")
  private String cpf;

  @NotEmpty(message = "Preencha o campo.")
  @Size(min = 3, max = 50, message = " '${validateValue}' precisa estar entre {min} e {max} caracteres. ")
  private String bairro;

  @NotNull(message = "Preencha o campo corretamente.")
  @Past(message = "Data '${validateValue}' é inválida.")
  private LocalDate dataDeNascimento;
}
