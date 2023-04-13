package br.com.cotiinformatica.dtos.queries;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.cotiinformatica.entities.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "produtos")
public class ProdutosDto {
	@Id
	private Integer id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private Integer quatidade;
	private CategoriasDto categoria;
	

}
